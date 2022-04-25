import { Component, OnInit } from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-show',
  templateUrl: './vendor-show.component.html',
  styleUrls: ['./vendor-show.component.css']
})
export class VendorShowComponent implements OnInit {

  vendors : Vendor[];
  constructor(private _vendorServie : VendorService) {
     this._vendorServie.showVendor().subscribe(x => {
      this.vendors=x;
    })
   }

  ngOnInit(): void {
  }

}
