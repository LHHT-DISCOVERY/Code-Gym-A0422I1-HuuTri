import { Router } from "@angular/router";
import { Product } from "./../../model/product";
import { Component, OnInit } from "@angular/core";
import { ProductService } from "src/app/service/product-service/product.service";

@Component({
  selector: "app-product-list",
  templateUrl: "./product-list.component.html",
  styleUrls: ["./product-list.component.css"],
})
export class ProductListComponent implements OnInit {
  productList: Product[] = [];

  constructor(private productService: ProductService, private router: Router) {}

  ngOnInit(): void {
    this.getAllProduct();
  }
  getAllProduct() {
    this.productService.getAllProduct().subscribe((value) => {
      this.productList = value;
      console.log(this.productList);
    });
  }

  showEditPage(id: number) {
    this.router.navigate(["updateProduct", id]);
  }
}
