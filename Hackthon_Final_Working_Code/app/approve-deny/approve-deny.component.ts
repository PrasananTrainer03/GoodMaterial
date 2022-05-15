import { Component, OnInit } from '@angular/core';
import { LeaveService } from '../leave.service';

@Component({
  selector: 'app-approve-deny',
  templateUrl: './approve-deny.component.html',
  styleUrls: ['./approve-deny.component.css']
})
export class ApproveDenyComponent implements OnInit {

  empId : number;
  leaveId : number;
  status : string;
  mgrComments : string;
  result : any;
  constructor(private _leaveService : LeaveService) {
    this.empId=parseInt(localStorage.getItem("empId"));
    this.leaveId=parseInt(localStorage.getItem("leaveId"))
   }

   action() {
    this._leaveService.approveDeny(this.leaveId,this.empId,this.status,this.mgrComments).subscribe(x =>{
      this.result=x;
    }
      )
   }

  ngOnInit() {
  }

}
