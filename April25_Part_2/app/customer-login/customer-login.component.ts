import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

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
    this._customerService.customerAuthenticate(this.userName,this.passCode).subscribe(x =>{
      if (x=="1") {
        localStorage.setItem("customerUser",this.userName);
        this._router.navigate(['/customerDashBoard']);
      }
    })
    // if (this.userName=="Anmol" && this.passCode=="Anmol") {
    //   this._router.navigate(['/customerDashBoard']);
    // }
  }
  constructor(private _router : Router, private _customerService : CustomerService) { 
   
  }

  ngOnInit(): void {
  }

}
