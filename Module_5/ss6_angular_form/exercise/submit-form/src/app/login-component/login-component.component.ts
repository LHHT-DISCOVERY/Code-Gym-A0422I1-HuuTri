import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
  message = " ";
  userForm: FormGroup

  constructor() {
    this.userForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.pattern("^(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b$")]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmPassword: new FormControl(''),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern("^(0)+([3-9][0-9]{8})$")]),
    }, [this.confirmPassword]);
  }

  ngOnInit(): void {
  }

  confirmPassword(form: any) {
    const pass = form.controls.password.value;
    const confirmPassword = form.controls.confirmPassword.value;
    if (pass === confirmPassword) {
      return null;
    } else {
      return {passWordNotMatching: true}
    }
  }

  registerUser() {
    if (this.userForm.valid) {
      this.message = "Đăng kí thành công"
    }
    console.log(this.userForm)
  }
}
