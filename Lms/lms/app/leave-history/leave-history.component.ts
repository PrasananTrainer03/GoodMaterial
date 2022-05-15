import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';

@Component({
  selector: 'app-leave-history',
  templateUrl: './leave-history.component.html',
  styleUrls: ['./leave-history.component.css']
})
export class LeaveHistoryComponent implements OnInit {

  history : Observable<Leave[]>;
  empno : number;
  constructor(private _leaveSerivce : LeaveService) {
    this.empno=parseInt(localStorage.getItem("empId"));
    this.history=this._leaveSerivce.leaveHistory(this.empno);
   }

  ngOnInit() {
  }

}
