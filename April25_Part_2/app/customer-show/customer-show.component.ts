import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-show',
  templateUrl: './customer-show.component.html',
  styleUrls: ['./customer-show.component.css']
})
export class CustomerShowComponent implements OnInit {

  manager : string;
  customers : Customer[];
  constructor(private _customerService : CustomerService) { 
    this.manager = localStorage.getItem("manager")
    this._customerService.showCustomer().subscribe(x => {
      this.customers=x;
    })
  }

  ngOnInit(): void {
  }

}
