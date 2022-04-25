import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vendor-login',
  templateUrl: './vendor-login.component.html',
  styleUrls: ['./vendor-login.component.css']
})
export class VendorLoginComponent implements OnInit {
  userName : string;
  passCode : string;

  login() {
    if (this.userName=="Manasvi" && this.passCode=="Manasvi") {
      this._router.navigate(['/vendorDashBoard']);
    }
  }
  constructor(private _router : Router) {
   
   }

  ngOnInit(): void {
  }

}
