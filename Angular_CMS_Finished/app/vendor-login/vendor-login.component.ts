import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-login',
  templateUrl: './vendor-login.component.html',
  styleUrls: ['./vendor-login.component.css']
})
export class VendorLoginComponent implements OnInit {
  userName : string;
  passCode : string;

  login() {
    this._vendorService.vendorAuthenticate(this.userName,this.passCode)
      .subscribe(x => {
        if (x=="1") {
          localStorage.setItem("vendorUser",this.userName);
          this._router.navigate(['/vendorDashBoard']);
        }
    })
    // if (this.userName=="Manasvi" && this.passCode=="Manasvi") {
    //   this._router.navigate(['/vendorDashBoard']);
    // }
  }
  constructor(private _router : Router, private _vendorService : VendorService) {
   
   }

  ngOnInit(): void {
  }

}
