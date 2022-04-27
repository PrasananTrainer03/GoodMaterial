import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Orders } from '../orders';

@Component({
  selector: 'app-customer-pending-orders',
  templateUrl: './customer-pending-orders.component.html',
  styleUrls: ['./customer-pending-orders.component.css']
})
export class CustomerPendingOrdersComponent implements OnInit {

  orders : Orders[];
  cid : number;
  constructor(private _customerService : CustomerService) {
    this.cid=parseInt(localStorage.getItem("cid"));
    this._customerService.showCustomerPendingOrders(this.cid).subscribe(x => {
        this.orders=x;
    })
   }

  ngOnInit(): void {
  }

}
