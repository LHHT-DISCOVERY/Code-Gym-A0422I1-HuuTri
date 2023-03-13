import { ProductDeleteComponent } from './component/product-delete/product-delete.component';
import { ProductEditComponent } from './component/product-edit/product-edit.component';
import { CategoryListComponent } from './component/category-list/category-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './component/product-list/product-list.component';
import {ProductCreateComponent} from "./component/product-create/product-create.component";


const routes: Routes = [

  {
    path: '', component: ProductListComponent
  },
  {
    path:"createProduct" , component : ProductCreateComponent
  },
  {
    path:"categoryList" , component : CategoryListComponent
  },
  {
    path:"updateProduct/:id" , component : ProductEditComponent
  },
  {
    path:"deleteProduct/:id" , component : ProductDeleteComponent
  } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
