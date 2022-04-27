import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import {Orders} from '../orders';
@Component({
  selector: 'app-place-order',
  templateUrl: './place-order.component.html',
  styleUrls: ['./place-order.component.css']
})
export class PlaceOrderComponent implements OnInit {
  cid : number;
  vid : number;
  mid : number;
  walSource : string;
  customer : Customer;
  orders : Orders;
  ordQty : number;
  ordComments : string;
  result : any;
  placeOrder() {
    this.orders.cusId=this.cid;
    this.orders.menId=this.mid;
    this.orders.venId=this.vid;
    this.orders.walSource=this.walSource;
    this.orders.ordQuantity=this.ordQty;
    this.orders.ordStatus="PENDING";
    this.orders.ordComments=this.ordComments;

    this._customerService.placeOrder(this.orders).subscribe(x => {
        this.result=x;
    })
  }
  constructor(private _customerService : CustomerService) {
    this.orders= new Orders();
    this.cid= parseInt(localStorage.getItem("cid"))
   }

  ngOnInit(): void {
  }

}
