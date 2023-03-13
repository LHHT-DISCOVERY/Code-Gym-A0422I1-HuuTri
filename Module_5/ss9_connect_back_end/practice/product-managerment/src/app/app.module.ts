import { ToastrModule } from 'ngx-toastr';
import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { HttpClientModule } from "@angular/common/http";
import { ProductListComponent } from "./component/product-list/product-list.component";
import { ProductEditComponent } from "./component/product-edit/product-edit.component";
import { ProductDeleteComponent } from "./component/product-delete/product-delete.component";
import { ProductCreateComponent } from "./component/product-create/product-create.component";
import { CategoryListComponent } from "./component/category-list/category-list.component";
import { CategoryCreateComponent } from "./component/category-create/category-create.component";
import { CategoryEditComponent } from "./component/category-edit/category-edit.component";
import { ReactiveFormsModule } from "@angular/forms";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";



@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductEditComponent,
    ProductDeleteComponent,
    ProductCreateComponent,
    CategoryListComponent,
    CategoryCreateComponent,
    CategoryEditComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({
      timeOut: 3500,
      positionClass: 'toast-top-right',
      preventDuplicates: true,
}),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
