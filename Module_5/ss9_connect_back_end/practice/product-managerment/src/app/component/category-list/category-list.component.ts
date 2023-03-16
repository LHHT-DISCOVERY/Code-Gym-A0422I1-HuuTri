// import { Router } from '@angular/router';
// import { CategoryService } from "src/app/service/category-service/category.service";
// import { Component, OnInit } from "@angular/core";
// import { Category } from "src/app/model/category";

// @Component({
//   selector: "app-category-list",
//   templateUrl: "./category-list.component.html",
//   styleUrls: ["./category-list.component.css"],
// })
// // một
// export class CategoryListComponent implements OnInit {
//   categories: Category[] = [];

//   constructor(private categoryService: CategoryService, private router: Router) {}

//   ngOnInit(): void {
//     this.getAllProduct();
//   }
//   getAllProduct() {
//     this.categoryService.getAllCategory().subscribe((value) => {
//       this.categories = value;
//       console.log(this.categories);
//     });
//   }

//   showEditPage(id: number) {
//     this.router.navigate(["updateCategory", id]);
//   }
// }
