// import { Component, OnInit } from "@angular/core";
// import { FormControl, FormGroup } from "@angular/forms";
// import { ActivatedRoute, ParamMap, Router } from "@angular/router";
// import { Category } from "src/app/model/category";
// import { CategoryService } from "src/app/service/category-service/category.service";
// import { ProductService } from "src/app/service/product-service/product.service";
// import { ToastrService } from "ngx-toastr";

// @Component({
//   selector: "app-product-edit",
//   templateUrl: "./product-edit.component.html",
//   styleUrls: ["./product-edit.component.css"],
// })
// export class ProductEditComponent implements OnInit {
//   productForm: FormGroup;
//   id: number;
//   categoryList: Category[] = [];

//   constructor(
//     private productService: ProductService,
//     private activatedRoute: ActivatedRoute,
//     private categoryService: CategoryService,
//     private router: Router,
//     private toast: ToastrService
//   ) {
//     this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
//       this.id = +paramMap.get("id");
//       this.getProduct(this.id);
//     });
//   }

//   ngOnInit(): void {
//     this.getAllCategory();
//   }

//   getProduct(id: number) {
//     return this.productService.findById(id).subscribe((product) => {
//       this.productForm = new FormGroup({
//         name: new FormControl(product.name),
//         price: new FormControl(product.price),
//         description: new FormControl(product.description),
//         category: new FormControl(product.category.id),
//       });
//     });
//   }

//   updateProduct(id: number) {
//     const product = this.productForm.value;
//     console.log(product);
//     for (let i = 0; i < this.categoryList.length; i++) {
//       if (this.categoryList[i].id === product.category) {
//         product.category = this.categoryList[i];
//         break;
//       }
//     }
//     this.productService.updateProduct(id, product).subscribe(
//       () => {
//         this.toast.success("Cập nhật thành công");
//         this.router.navigateByUrl("");
//       },
//       (error) => {
//         console.log(error);
//       }
//     );
//   }

//   getAllCategory() {
//     this.categoryService.getAllCategory().subscribe((value) => {
//       this.categoryList = value;
//     });
//   }
// }
