import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {


  constructor() {
  }

  hamSo(number: number): void {
    let a = document.getElementById("Result");
    a.innerHTML += number;
  }

  hamTinh(tinh:string): void {
    let b = document.getElementById("Result");
    b.innerHTML += tinh;
  }

  del() {
    let e = document.getElementById("Result").innerHTML = " ";
  }

  ketQuaTinhToan(): void {
    let c = document.getElementById("Result").innerHTML;
    document.getElementById('Result').innerHTML = eval(c);
  }

  ngOnInit(): void {
  }

}
