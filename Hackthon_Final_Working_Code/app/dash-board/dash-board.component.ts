import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dash-board',
  templateUrl: './dash-board.component.html',
  styleUrls: ['./dash-board.component.css']
})
export class DashBoardComponent implements OnInit {

  applyLeave() {
    this._router.navigate(['/applyLeave']);
  }
  constructor(private _router : Router) { }

  ngOnInit() {
  }

}
