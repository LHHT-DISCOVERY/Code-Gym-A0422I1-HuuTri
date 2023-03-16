import { LoHangService } from './../../service/lo-hang.service';
import { LoHang } from './../../model/lo-hang';
import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lohang-list',
  templateUrl: './lohang-list.component.html',
  styleUrls: ['./lohang-list.component.css']
})
export class LohangListComponent implements OnInit {

  loHangList : LoHang[] = [];
  delId: number;

  constructor(
    private loHangService : LoHangService,
    private toast: ToastrService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getAllLoHang();
  }
  getAllLoHang() {
    this.loHangService.getAllLoHang().subscribe((value) => {
      this.loHangList = value;
      console.log(this.loHangList);
    });
  }

  infoDelete(id: number, name: string , nameP :string) {
    this.delId = id;
    document.getElementById("delName").innerText = name;
    document.getElementById("nameP").innerText = nameP;
  }

  deleteProduct(id: number | undefined) {
    this.loHangService.deleteLoHang(id).subscribe(
      () => {
        this.getAllLoHang();
        document.getElementById("");
        this.toast.success("Xóa thành công");
      },
      (err) => {
        console.log(err);
      }
    );
  }

  showEditPage(id: number) {
    this.router.navigate(["updateProduct", id]);
  }

}
