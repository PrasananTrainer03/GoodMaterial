import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent implements OnInit {

  userName : string;
  passCode : string;

  login() {
    localStorage.setItem("manager","Murugan");
    if (this.userName=="Anmol" && this.passCode=="Anmol") {
      this._router.navigate(['/customerDashBoard']);
    }
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}
