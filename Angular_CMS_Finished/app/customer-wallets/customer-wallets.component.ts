import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Wallet } from '../wallet';

@Component({
  selector: 'app-customer-wallets',
  templateUrl: './customer-wallets.component.html',
  styleUrls: ['./customer-wallets.component.css']
})
export class CustomerWalletsComponent implements OnInit {

  wallets : Wallet[];
  cid : number;
  constructor(private _customerService : CustomerService) { 
    this.cid=parseInt(localStorage.getItem("cid"));
    this._customerService.showCustomerWallet(this.cid).subscribe(x => {
      this.wallets = x;
    })
  }

  ngOnInit(): void {
  }

}
