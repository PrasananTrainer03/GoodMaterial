import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent implements OnInit {

  firstNo : number;
  secondNo : number;
  result1 : number;
  result2 : number;
  result3 : number;
  isFormSubmmitted : boolean;
  calc(calcForm : NgForm) {
    if (calcForm.invalid) {
      return;
    }
    this.isFormSubmmitted=true;
    this.result1=this.firstNo+this.secondNo;
    this.result2=this.firstNo-this.secondNo;
    this.result3=this.firstNo*this.secondNo;
  }
  constructor() {
    this.isFormSubmmitted=false;
   }

  ngOnInit(): void {
  }

}
