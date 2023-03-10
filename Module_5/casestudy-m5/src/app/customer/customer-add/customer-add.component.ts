import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";

@Component({
  selector: "app-customer-add",
  templateUrl: "./customer-add.component.html",
  styleUrls: ["./customer-add.component.css"],
})
export class CustomerAddComponent implements OnInit {
  userFormCustomer: FormGroup;

  constructor() {
    this.userFormCustomer = new FormGroup({
      IdCustomer: new FormControl("", [
        Validators.required,
        Validators.pattern("^(KH-)(\\d{4})$"),
      ]),
      nameCustomer: new FormControl("", [Validators.required]),
      customerType: new FormControl("", [Validators.required]),
      customerBirthday: new FormControl("", [Validators.required]),
      customerGender: new FormControl("", [Validators.required]),
      customerIdCard: new FormControl("", [
        Validators.required,
        Validators.pattern("^([0-9]{9})|([0-9]{12})$"),
      ]),
      customerPhone: new FormControl("", [
        Validators.required,
        Validators.pattern("^(0|(\\(84\\)\\+))+([9][0-1][0-9]{7})$"),
      ]),
      customerEmail: new FormControl("", [
        Validators.required,
        Validators.pattern(
          "^(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b$"
        ),
      ]),
      customerAddress: new FormControl("", [Validators.required]),
    });
  }

  ngOnInit(): void {}

  createUser() {}
}
