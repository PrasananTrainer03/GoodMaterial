import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-pending-history',
  templateUrl: './pending-history.component.html',
  styleUrls: ['./pending-history.component.css']
})
export class PendingHistoryComponent implements OnInit {

  pending : Observable<Leave[]>;
  employs : Observable<Employ[]>;
  mgrNo : number;
  showButton : boolean;
  constructor(private _leaveService : LeaveService, private _employService : EmployService) {
    this.mgrNo=parseInt(localStorage.getItem("empId"));
    alert(this.mgrNo);
    this.employs=this._employService.getEmploys();
    this.pending=this._leaveService.pending(this.mgrNo);
    // this.empData=this._empService.getEmploys();

   }
   setClickRowDup(leaveId, empId) {
    this.showButton=true;
   alert(leaveId);
   alert(empId);
   localStorage.setItem("leaveId",leaveId);
   localStorage.setItem("lempId",empId);
  }

  ngOnInit() {
  }

}
