import { ProductService } from './../../service/product-service/product.service';
import { LoHangService } from './../../service/lo-hang.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Product } from 'src/app/model/product';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-lohang-create',
  templateUrl: './lohang-create.component.html',
  styleUrls: ['./lohang-create.component.css']
})
export class LohangCreateComponent implements OnInit {

   loHangForm = new FormGroup({

    id : new FormControl(),
    codeName : new FormControl("", [
      Validators.required,
      Validators.pattern("^(LH-)(\\d{4})$"),
    ]),
    product : new FormControl() ,
    soLuong : new FormControl("", [
      Validators.required,
      Validators.pattern("^[0-9]+$"),
    ]) ,
    ngayNhap : new FormControl("", [
      Validators.required,
     
    ]),
    ngaySX : new FormControl("", [
      Validators.required,
     
    ]) ,
    ngayHH : new FormControl("", [
      Validators.required,
    
    ]) ,
  });

  productList: Product[] = [];
  constructor(
    private loHangService: LoHangService,
    private productService: ProductService,
    private router: Router,
    private toast: ToastrService
  ) {}

  ngOnInit(): void {
    this.getAllProduct();
  }

  saveProduct() {
    const loHang = this.loHangForm.value;
    console.log(loHang);
    for (let i = 0; i < this.productList.length; i++) {
      if (this.productList[i].id === loHang.product) {
        loHang.product = this.productList[i];
        break;
      }
    }
    if (this.loHangForm.valid) {
      this.loHangService.saveLoHang(loHang).subscribe(
        () => {
          this.router.navigateByUrl("");
          this.toast.success("Thêm mới thành công");
        },
        (err) => {
          console.log(err);
        }
      );
    }else{
      this.toast.error("Thêm mới thất bại")
    }
  }

  getAllProduct() {
    this.productService.getAllProduct().subscribe((cate) => {
      this.productList = cate;
    });
  }

}
