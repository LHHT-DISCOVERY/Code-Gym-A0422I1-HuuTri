import {Component, Inject, LOCALE_ID, OnInit} from '@angular/core';
import {Point} from "../../../model/point";
import {PointService} from "../../../service/point/point.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-user-point-history',
  templateUrl: './user-point-history.component.html',
  styleUrls: ['./user-point-history.component.css']
})
export class UserPointHistoryComponent implements OnInit {

  pointList: Point[] = [];
  size = 5;
  indexPagination = 0;
  totalPages = 0;
  totalElements = 0;
  errMessage: string;
  totalPoint: number;
  searchForm: FormGroup;
  validatePage: string;

  getSumTotalPointByCustomer() {
    this.pointService.getSumPointByCustomer().subscribe(value => {
      this.totalPoint = value;
    }, error => {
      this.totalPoint = null;
      this.errMessage = "Không có dữ liệu";
    })
  }


  constructor(private pointService: PointService, @Inject(LOCALE_ID) private locale: string) {
    this.searchForm = new FormGroup({
      startDate: new FormControl('', [Validators.required]),
      endDate: new FormControl('', [Validators.required]),
    }, [this.checkEndDate, this.checkNowStartDate, this.checkNowEndDate])
  }

  ngOnInit(): void {
    // this.getPointList(this.indexPagination);
    this.getSumTotalPointByCustomer();
    this.getPointList(this.indexPagination)
  }

  getPointList(page: number) {
    const startDate = (this.searchForm.controls.startDate.value)
    const endDate = (this.searchForm.controls.endDate.value)
    this.validatePage = ""
    if (this.searchForm.valid) {
      this.pointService.getAllPointByCustomerDateBetween(startDate, endDate, page, this.size).subscribe(value => {
        this.pointList = value.content
        this.indexPagination = value.number;
        this.totalPages = value.totalPages;
        this.totalElements = value.totalElements;

      })
    } else {
      this.pointService.getAllPointByCustomer(page).subscribe(value => {
        this.pointList = value.content;
        this.indexPagination = value.number;
        this.totalPages = value.totalPages;
        this.totalElements = value.totalElements;
      }, error => {
        this.pointList = [];
        this.errMessage = "Không có dữ liệu"
      })
    }
  }

  checkEndDate(form: any) {
    console.log(new Date(form.controls.startDate.value))
    const startDate = new Date(form.controls.startDate.value)
    const endDate = new Date(form.controls.endDate.value)
    if (startDate.getTime() > endDate.getTime()) {
      return {startDateLargerEndDate: true}
    }
  }

  checkNowStartDate(form: any) {
    const nowDate = new Date().getTime()
    const startDate = new Date(form.controls.startDate.value).getTime()
    if ((startDate > nowDate)) {
      return {checkNowStartDate: true}
    }
  }


  checkNowEndDate(form: any) {
    const nowDate = new Date().getTime()
    const endDate = new Date(form.controls.endDate.value).getTime()
    if (endDate > nowDate) {
      return {checkNowEndDate: true}
    }
  }

  getPageChoice(page) {
    if (this.validPage(page)) {
      this.getPointList(page);
    }
  }

  validPage(page: number) {
    if (page >= this.totalPages || page < 0) {
      (document.getElementById("input-page-choice") as HTMLInputElement).value = "";
      this.validatePage = "Trang nhập vào phải nằm trong khoảng từ trang  1 đến trang " + this.totalPages;
      return false;
    }
    if (isNaN(Number(page))) {
      (document.getElementById("input-page-choice") as HTMLInputElement).value = "";
      this.validatePage = "Số trang nhập vào không được chứ kí tự"
      return false;
    }
    if (!Number.isInteger(page)) {
      (document.getElementById("input-page-choice") as HTMLInputElement).value = "";
      this.validatePage = "Số trang nhập vào không chứa số thập phân"
      return false;
    }
    this.validatePage = ""
    return true;
  }

}
