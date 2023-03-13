import { CustomerService } from './../../service-logic/customer/customer.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from 'src/app/model/customer';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  userFormCustomer: FormGroup;
  customer : Customer;
  

  constructor(private customerService : CustomerService ,
    private activateRoute : ActivatedRoute ,
    private router : Router 
    ) { 
      this.activateRoute.paramMap.subscribe(next => {
        const id  = next.get('id');
        if(id != null){
          this.customer = this.customerService.findByID(id);
        }
      } , error => {

      } , () => {})

      this.userFormCustomer = new FormGroup({
        customerId : new FormControl(this.customer.customerId),
        customerType : new FormControl(this.customer.customerType),
        customerName : new FormControl(this.customer.customerName),
        customerBirthday : new FormControl(this.customer.customerBirthday),
        customerGender : new FormControl(this.customer.customGender),
        customerIdCard : new FormControl(this.customer.customerIdCard),
        customerPhone : new FormControl(this.customer.customerPhone),
        customerEmail : new FormControl(this.customer.customerEmail),
        customerAddress : new FormControl(this.customer.customerAddress)
      })

    }

  ngOnInit(): void {
  }

  updateCustomer(){
    this.customerService.updateCustomer(this.customer.customerId , this.userFormCustomer.value)
    this.router.navigateByUrl('/list-customer');
  }

}
