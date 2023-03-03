import { ContractListComponent } from './contract/contract-list/contract-list.component';
import { ContractAddComponent } from './contract/contract-add/contract-add.component';
import { EditServiceComponent } from './service/edit-service/edit-service.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { CustomerAddComponent } from './customer/customer-add/customer-add.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { ServiceListComponent } from './service/service-list/service-list.component';
import { ServiceAddComponent } from './service/service-add/service-add.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';


const routes: Routes = [
  {path: 'add-service', component: ServiceAddComponent},
  {path: '', component: ServiceListComponent},
  {path: 'edit-service', component: EditServiceComponent},
  {path: 'list-customer', component: CustomerListComponent},
  {path: 'add-customer', component: CustomerAddComponent},
  {path: 'edit-customer', component: CustomerEditComponent},
  {path: 'add-contract', component: ContractAddComponent},
  {path: 'list-contract', component: ContractListComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
