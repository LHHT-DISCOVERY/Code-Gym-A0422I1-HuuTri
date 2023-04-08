import { Component } from '@angular/core';
import {render} from "creditcardpayments/creditCardPayments";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pay-paypal';

  constructor() {
    render({
      id:"#myPaypalButtons",
      currency:"USD",
      value:"5.00",
      onApprove:(details => {
        alert("Pay Successful")
      })
    })

  }

}
