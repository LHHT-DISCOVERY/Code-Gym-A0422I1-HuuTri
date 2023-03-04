import { Facility } from 'src/app/model/facility';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  serviceList : Facility[] = [
    {
      id :1 ,
      image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    } ,
    {
      id :2 ,
     image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month>",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    } ,
    {
      id :3 ,
     image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month>",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    },
    {
      id :4,
     image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month>",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    },
    {
      id :5 ,
     image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month>",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    },
    {
      id :6 ,
     image : "../assets/service/1.png",
      serviceName : "Phòng Họp" ,
      serviceArea : 4 ,
      serviceCost : 1000 ,
      serviceMaxPeople : 12 ,
      rentType : "Month>",
      serviceType : "villa" ,
      standardRoom : "VIP" ,
      descriptionOtherConvenience : "Bếp Nướng" ,
      poolArea:900  ,
      numberOfFloors : 12
      
    }
  ];


  getAll() {
    return this.serviceList ;
  }

  constructor() { }
}
