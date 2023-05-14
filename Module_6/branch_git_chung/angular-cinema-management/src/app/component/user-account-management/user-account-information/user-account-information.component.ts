import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {comparePassword} from "../../../validator/comparePassword";
import {AccountService} from "../../../service/account/account.service";
import {ToastrService} from "ngx-toastr";
import {ActivatedRoute} from "@angular/router";
import {CustomerService} from "../../../service/customer/customer.service";
import {checkDateOfBirth} from "../../../validator/checkDateOfBirth";
import {PointService} from "../../../service/point/point.service";

@Component({
  selector: 'app-user-account-information',
  templateUrl: './user-account-information.component.html',
  styleUrls: ['./user-account-information.component.css']
})
export class UserAccountInformationComponent implements OnInit {
  resetPassRequestForm: FormGroup;
  updateCustomerForm: FormGroup;
  totalPoint: number;
  errMessage: string;

  constructor(
    private accountService: AccountService,
    private customerService: CustomerService,
    private activatedRoute: ActivatedRoute,
    private formBuilder: FormBuilder,
    private toastr: ToastrService,
    private pointService: PointService
  ) {
  }

  ngOnInit(): void {
    this.resetPassRequestForm = new FormGroup({
        username: new FormControl('customer4', [Validators.required]),
        oldPassword: new FormControl('', [Validators.required]),
        password: new FormControl('', [Validators.required, Validators.pattern("(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")]),
        confirmPassword: new FormControl('',  [Validators.required]),
      },
      {
        validators: comparePassword
      });

    this.customerService.getCustomerByUsername("customer4").subscribe(customer => {
      this.updateCustomerForm = new FormGroup({
        id: new FormControl(customer.id, [Validators.required]),
        fullName: new FormControl(customer.fullName, [Validators.required, Validators.minLength(5), Validators.maxLength(50), Validators.pattern("^[a-zA-Zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]+(\\s[a-zA-Zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]+)*$")]),
        birthday: new FormControl(customer.birthday.slice(0, 10), [Validators.required, checkDateOfBirth]),
        gender: new FormControl(customer.gender, [Validators.required,]),
        cardId: new FormControl(customer.cardId, [Validators.required, Validators.pattern("[0-9]{9}")]),
        email: new FormControl(customer.email, [Validators.required, Validators.minLength(5), Validators.maxLength(50), Validators.pattern("^\\w{5,}.?\\w+(@\\w{3,8})(.\\w{3,8})+$")]),
        address: new FormControl(customer.address, [Validators.required, Validators.minLength(5), Validators.maxLength(50)]),
        phoneNumber: new FormControl(customer.phoneNumber, [Validators.required, Validators.pattern("^(0\\d{9,10})$")]),
      });
    }, error => {
      console.log(error)
    });
    this.getSumTotalPointByCustomer();
  }


  getSumTotalPointByCustomer() {
    this.pointService.getSumPointByCustomer().subscribe(value => {
      this.totalPoint = value;
    }, error => {
      this.totalPoint = null;
      this.errMessage = "Không có dữ liệu";
    })
  }

  doResetPassword() {
    const resetPassRequest = this.resetPassRequestForm.value;
    this.accountService.doResetPassword(resetPassRequest).subscribe(data => {
        this.toastr.success("Cập nhật thành công!", "Thông báo");
        this.resetPassRequestForm.reset();
      },
      err => {
        this.toastr.error("Mật khẩu cũ không đúng!", "Thông báo");
      });
  }

  updateCustomer() {
    const customer = this.updateCustomerForm.value;
    this.customerService.updateCustomer(customer.id, customer).subscribe(data => {
        this.toastr.success("Cập nhật thành công!", "Thông báo");
      },
      error => {
        this.toastr.error("Cập nhật không thành công!", "Thông báo");
      })
  }

}
