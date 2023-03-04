import { CustomerService } from './../../service-logic/customer/customer.service';
import { Customer } from './../../model/customer';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList : Customer[] = [];
  constructor(private customerService : CustomerService) { 
    this.customerList = this.customerService.getAll();
    console.log(this.customerList);
   
  }

  ngOnInit(): void {
    // this.customerList = this.customerService.getAll();
    // console.log(this.customerList);
  }

}
