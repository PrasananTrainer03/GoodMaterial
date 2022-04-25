import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customer-dash-board',
  templateUrl: './customer-dash-board.component.html',
  styleUrls: ['./customer-dash-board.component.css']
})
export class CustomerDashBoardComponent implements OnInit {

  manager : string;
  constructor() {
    this.manager = localStorage.getItem("manager")
   }

  ngOnInit(): void {
  }

}
