import { Customer } from './../../model/customer';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  customerList : Customer[]  = [
    {
      customerId : "1" ,
      customerType : "Platinium",
      customerName : "Lý Huỳnh Hữu Trí" ,
      customerBirthday:"2001/02/12",
      customGender: true,
      customerIdCard : "0191903819231" ,
      customerPhone :"0333915138",
      customerEmail : "lytri102@gmail.com",
      customerAddress : "Quảng Nam"
    },
    {
      customerId : "1" ,
      customerType : "Platinium",
      customerName : "Lý Huỳnh Hữu Trí" ,
      customerBirthday:"2001/02/12",
      customGender: true,
      customerIdCard : "0191903819231" ,
      customerPhone :"0333915138",
      customerEmail : "lytri102@gmail.com",
      customerAddress : "Quảng Nam"
    },
    {
      customerId : "1" ,
      customerType : "Platinium",
      customerName : "Lý Huỳnh Hữu Trí" ,
      customerBirthday:"2001/02/12",
      customGender: true,
      customerIdCard : "0191903819231" ,
      customerPhone :"0333915138",
      customerEmail : "lytri102@gmail.com",
      customerAddress : "Quảng Nam"
    },
    {
      customerId : "1" ,
      customerType : "Platinium",
      customerName : "Lý Huỳnh Hữu Trí" ,
      customerBirthday:"2001/10/20",
      customGender: true,
      customerIdCard : "0191903819231" ,
      customerPhone :"0333915138",
      customerEmail : "lytri102@gmail.com",
      customerAddress : "Quảng Nam"
    },
  ]

  getAll(){
    return this.customerList;
  }
 
  constructor() { }
}
