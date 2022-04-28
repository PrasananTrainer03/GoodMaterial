import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employ : Employ;
  isValidFormSubmitted : boolean;
  onFormSubmit(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this.isValidFormSubmitted=true;
  }
  constructor() {
    this.isValidFormSubmitted=false;
    this.employ = new Employ();
   }

  ngOnInit(): void {
  }

}
