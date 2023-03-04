import { FacilityService } from './../../service-logic/facility/facility.service';
import {Component, OnInit} from '@angular/core';
import { Facility } from 'src/app/model/facility';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  serviceList : Facility[] = [];
  constructor(private facilityService : FacilityService) {
    this.serviceList = this.facilityService.getAll();
  }

  

  ngOnInit(): void {
  }

}
