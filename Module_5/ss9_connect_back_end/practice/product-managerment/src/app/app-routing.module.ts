import { LohangCreateComponent } from './component/lohang-create/lohang-create.component';
import { LohangListComponent } from './component/lohang-list/lohang-list.component';
// import { CategoryEditComponent } from './component/category-edit/category-edit.component';
// import { ProductDeleteComponent } from './component/product-delete/product-delete.component';
// import { ProductEditComponent } from './component/product-edit/product-edit.component';
// import { CategoryListComponent } from './component/category-list/category-list.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './component/product-list/product-list.component';
// import {ProductCreateComponent} from "./component/product-create/product-create.component";


const routes: Routes = [

  {
    path: '', component: LohangListComponent
    
  },
  {
    path: 'createLoHang', component: LohangCreateComponent
    
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
