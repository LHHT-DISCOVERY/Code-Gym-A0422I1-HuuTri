import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-like1',
  templateUrl: './like.component.html',
  styleUrls: ['./like.component.css']
})
export class LikeComponent implements OnInit {
  like = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  likeThis() {
    this.like++;
  }

}
