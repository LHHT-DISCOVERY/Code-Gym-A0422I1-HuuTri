// import { ProductService } from './../../service/product-service/product.service';
// import { Component, OnInit } from '@angular/core';
// import { ActivatedRoute, ParamMap, Router } from '@angular/router';
// import { CategoryService } from 'src/app/service/category-service/category.service';
// import { FormControl, FormGroup } from '@angular/forms';
// import { Category } from 'src/app/model/category';
// import { ToastrService } from "ngx-toastr";

// @Component({
//   selector: 'app-product-delete',
//   templateUrl: './product-delete.component.html',
//   styleUrls: ['./product-delete.component.css']
// })
// export class ProductDeleteComponent implements OnInit {
//   productForm : FormGroup;
//   id : number;
//   categoryList :  Category[] = []

//   constructor(private productService : ProductService , private categoryService: CategoryService,
//     private activatedRoute: ActivatedRoute,
//     private router: Router , private toast : ToastrService) { 
//       this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
//         this.id = +paramMap.get('id');
//         this.getProduct(this.id);
//       })
//     }

//   ngOnInit(): void {
//     this.getAllCategory();
//   }

//   getProduct(id: number) {
//     return this.productService.findById(id).subscribe(product => {
//       this.productForm = new FormGroup({
//         name: new FormControl(product.name),
//         price: new FormControl(product.price),
//         description: new FormControl(product.description),
//         category: new FormControl(product.category.id)
//       });
//     });
//   }

//   deleteProduct(id: number) {
//     this.productService.deleteProduct(id).subscribe(() => {
//       this.router.navigate(['']);
//       this.toast.success("đã xóa thành công ")
//     }, error => {
//       console.log(error);
//     });
//   }

//   getAllCategory() {
//     return this.categoryService.getAllCategory().subscribe(categoryList => {
//       this.categoryList = categoryList;
//     });
//   }

// }
