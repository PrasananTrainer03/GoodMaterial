import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Orders } from '../orders';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrls: ['./customer-orders.component.css']
})
export class CustomerOrdersComponent implements OnInit {

  orders : Orders[];
  cid : number;
  constructor(private _customerService : CustomerService) {
    this.cid = parseInt(localStorage.getItem("cid"));
   
    this._customerService.showCustomerOrders(this.cid).subscribe(x => {
      this.orders=x;
    })
   }

  ngOnInit(): void {
  }

}
