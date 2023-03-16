import { FormControl, Validators } from "@angular/forms";
import { Component, OnInit } from "@angular/core";
import { FormGroup } from "@angular/forms";
import { FacilityService } from "src/app/service-logic/facility/facility.service";
import { Router } from "@angular/router";

@Component({
  selector: "app-service-add",
  templateUrl: "./service-add.component.html",
  styleUrls: ["./service-add.component.css"],
})
export class ServiceAddComponent implements OnInit {
  userServiceForm: FormGroup;

  constructor(
    private facilityService: FacilityService,
    private router: Router
  ) {
    this.userServiceForm = new FormGroup({
      serviceName: new FormControl("", [
        Validators.required,
        Validators.pattern("^[^0-9]+$"),
      ]),
      image: new FormControl("", [Validators.required]),
      serviceArea: new FormControl("", [Validators.required]),
      serviceCost: new FormControl("", [Validators.required]),
      serviceStandardRoom: new FormControl("", [Validators.required]),
      serviceMaxPeople: new FormControl("", [
        Validators.required,
        Validators.pattern("^[0-9]+$"),
      ]),
      descriptionOtherConvenience: new FormControl("", [Validators.required]),
      servicePoolArea: new FormControl("", [
        Validators.required,
        Validators.pattern("^[0-9()]+$"),
      ]),
      serviceNumberOfFloors: new FormControl("", [
        Validators.required,
        ,
        Validators.pattern("^[0-9()]+$"),
      ]),
      serviceType: new FormControl("", [Validators.required]),
      serviceRentType: new FormControl("", [Validators.required]),
    });
  }

  addNewService() {
    this.userServiceForm.value.image = '../assets/service/' + this.userServiceForm.value.image.substr(12);
    if (this.userServiceForm.valid) {
      this.facilityService.addNewService(this.userServiceForm.value);
      this.router.navigateByUrl("");
    }
    console.log(this.userServiceForm.value);

  }

  ngOnInit(): void {}
}
