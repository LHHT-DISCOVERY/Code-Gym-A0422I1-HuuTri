import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-test-list',
  templateUrl: './test-list.component.html',
  styleUrls: ['./test-list.component.css']
})
export class TestListComponent implements OnInit {

  constructor(private toast : ToastrService) { }

  ngOnInit(): void {
  }

  click(){
    this.toast.success("message")
  }

}
