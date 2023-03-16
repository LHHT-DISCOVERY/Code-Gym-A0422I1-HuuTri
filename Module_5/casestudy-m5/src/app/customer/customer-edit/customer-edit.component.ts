import {CustomerService} from './../../service-logic/customer/customer.service';
import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Customer} from 'src/app/model/customer';
import {loadavg} from "os";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  userFormCustomer: FormGroup;
  customer: Customer;


  constructor(private customerService: CustomerService,
              private activateRoute: ActivatedRoute,
              private router: Router
  ) {
    this.activateRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      console.log("id là : " + id)
      if (id != null) {
        this.customer = this.customerService.findByID(id);
      }
    }, error => {
      console.log(error)

    }, () => {
      console.log("thành công")
    })

    this.userFormCustomer = new FormGroup({
      customerId: new FormControl(this.customer.customerId, [
        Validators.required,
        Validators.pattern("^(KH-)(\\d{4})$"),
      ]),
      customerType: new FormControl(this.customer.customerType, [Validators.required]),
      customerName: new FormControl(this.customer.customerName, [Validators.required]),
      customerBirthday: new FormControl(this.customer.customerBirthday, [Validators.required]),
      customerGender: new FormControl(this.customer.customGender, [Validators.required]),
      customerIdCard: new FormControl(this.customer.customerIdCard, [
        Validators.required,
        Validators.pattern("^([0-9]{9})|([0-9]{12})$"),
      ]),
      customerPhone: new FormControl(this.customer.customerPhone, [
        Validators.required,
        Validators.pattern("^(0|(\\(84\\)\\+))+([9][0-1][0-9]{7})$"),
      ]),
      customerEmail: new FormControl(this.customer.customerEmail, [
        Validators.required,
        Validators.pattern(
          "^(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b$"
        ),
      ]),
      customerAddress: new FormControl(this.customer.customerAddress, [Validators.required])
    })

  }

  ngOnInit(): void {
  }

  updateCustomer() {
    console.log(this.userFormCustomer.value)
    this.customerService.updateCustomer(this.customer.customerId, this.userFormCustomer.value)
    this.router.navigateByUrl('/list-customer');
  }

}
