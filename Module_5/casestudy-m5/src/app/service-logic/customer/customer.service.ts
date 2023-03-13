import { element } from 'protractor';
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

  findByID(id : String){
      return this.customerList.filter(element => element.customerId === id )[0];
  }

  updateCustomer(id : String , customer : Customer){  
      for(let i = 0; i < this.customerList.length; i++){
        if(this.customerList[i].customerId ===id){
          this.customerList[i] = customer;
        }
      }
  }
 
  constructor() { }
}
