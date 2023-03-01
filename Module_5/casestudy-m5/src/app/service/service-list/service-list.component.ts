import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  serviceList = [

    {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }, {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }, {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }, {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }, {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }, {
      name: "PHÒNG SUITE HƯỚNG BIỂN",
      area: 85.8,
      image: "../../assets/service/1.png"
    }

  ]

  constructor() {
  }

  ngOnInit(): void {
  }

}
