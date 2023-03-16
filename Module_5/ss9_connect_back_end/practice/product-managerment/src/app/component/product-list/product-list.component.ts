import { ToastrService } from "ngx-toastr";
import { Router } from "@angular/router";
import { Product } from "./../../model/product";
import { Component, OnInit } from "@angular/core";
import { ProductService } from "src/app/service/product-service/product.service";
// nhiều
@Component({
  selector: "app-product-list",
  templateUrl: "./product-list.component.html",
  styleUrls: ["./product-list.component.css"],
})
export class ProductListComponent implements OnInit {
  productList: Product[] = [];
  delId: number;

  constructor(
    private productService: ProductService,
    private toast: ToastrService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getAllProduct();
  }
  getAllProduct() {
    this.productService.getAllProduct().subscribe((value) => {
      this.productList = value;
      console.log(this.productList);
    });
  }

  infoDelete(id: number, name: string) {
    this.delId = id;
    document.getElementById("delName").innerText = name;
  }

  deleteProduct(id: number | undefined) {
    this.productService.deleteProduct(id).subscribe(
      () => {
        this.getAllProduct();
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
