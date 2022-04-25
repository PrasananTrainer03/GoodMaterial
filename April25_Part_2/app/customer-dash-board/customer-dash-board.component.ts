import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-dash-board',
  templateUrl: './customer-dash-board.component.html',
  styleUrls: ['./customer-dash-board.component.css']
})
export class CustomerDashBoardComponent implements OnInit {

  manager : string;
  customer : Customer;
  user : string;
  constructor(private _customerSerivce : CustomerService) {
    this.manager = localStorage.getItem("manager")
    this.user = localStorage.getItem("customerUser")
    this._customerSerivce.searchByCustomerUserName(this.user).subscribe(x => {
      this.customer=x;
      localStorage.setItem("cid",x.cusId.toString())
    })
   }

  ngOnInit(): void {
  }

}
