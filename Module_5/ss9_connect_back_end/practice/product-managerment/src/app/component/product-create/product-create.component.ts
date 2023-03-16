// import { Category } from "src/app/model/category";

// import { ProductService } from "./../../service/product-service/product.service";

// import { Component, OnInit } from "@angular/core";
// import { FormControl, FormGroup, Validators } from "@angular/forms";
// import { CategoryService } from "src/app/service/category-service/category.service";
// import { Router } from "@angular/router";
// import { ToastrService } from "ngx-toastr";

// @Component({
//   selector: "app-product-create",
//   templateUrl: "./product-create.component.html",
//   styleUrls: ["./product-create.component.css"],
// })
// export class ProductCreateComponent implements OnInit {
//   productForm = new FormGroup({
//     id: new FormControl(),
//     name: new FormControl("", [Validators.required]),
//     price: new FormControl(),
//     description: new FormControl(),
//     category: new FormControl(),
//   });

//   categoryList: Category[] = [];
//   constructor(
//     private productService: ProductService,
//     private categoryService: CategoryService,
//     private router: Router,
//     private toast: ToastrService
//   ) {}

//   ngOnInit(): void {
//     this.getAllCategory();
//   }

//   saveProduct() {
//     const product = this.productForm.value;
//     console.log(product);
//     for (let i = 0; i < this.categoryList.length; i++) {
//       if (this.categoryList[i].id === product.category) {
//         product.category = this.categoryList[i];
//         break;
//       }
//     }
//     if (this.productForm.valid) {
//       this.productService.saveProduct(product).subscribe(
//         () => {
//           this.router.navigateByUrl("");
//           this.toast.success("Thêm mới thành công");
//         },
//         (err) => {
//           console.log(err);
//         }
//       );
//     }else{
//       this.toast.error("Thêm mới thất bại")
//     }
//   }

//   getAllCategory() {
//     this.categoryService.getAllCategory().subscribe((cate) => {
//       this.categoryList = cate;
//     });
//   }
// }
