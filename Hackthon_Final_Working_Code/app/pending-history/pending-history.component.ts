import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pending-history',
  templateUrl: './pending-history.component.html',
  styleUrls: ['./pending-history.component.css']
})
export class PendingHistoryComponent implements OnInit {

  pending : Leave[];
  employs : Employ[];
  mgrNo : number;
  showButton : boolean;
  constructor(private _leaveService : LeaveService,
    private _router : Router,
    private _employService : EmployService) {
    this.mgrNo=parseInt(localStorage.getItem("empId"));
    alert(this.mgrNo);
    this._employService.getEmploys().subscribe(x => {
      this.employs=x;
    })
    this._leaveService.pending(this.mgrNo).subscribe(x => {
      this.pending=x;
    })
    // this.empData=this._empService.getEmploys();

   }
   setClickRowDup(leaveId : number, empId : number) {
    this.showButton=true;
   alert(leaveId);
   alert(empId);
   localStorage.setItem("leaveId",leaveId.toString());
   localStorage.setItem("lempId",empId.toString());
  }
  doApproveDeny() {
    this._router.navigate(['/approvedeny']);
  }

  ngOnInit() {
  }

}
