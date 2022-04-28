import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName : string;
  passCode : string;
  isFormSubmitted : boolean;
  login(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.isFormSubmitted=true;
    if (this.userName=="hexaware" && this.passCode=="hexaware") {
      alert("Correct Credentials...") 
    } else {
      alert("Invalid Credentials...")
    }
  }
  constructor() { 
    this.isFormSubmitted=false;
  }

  ngOnInit(): void {
  }

}
