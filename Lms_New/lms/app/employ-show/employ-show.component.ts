import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrls: ['./employ-show.component.css']
})
export class EmployShowComponent implements OnInit {

  employ : Observable<Employ>;
  empno : number;
  constructor(private _employService : EmployService) {
      this.empno=parseInt(localStorage.getItem("empId"));
      this.employ=this._employService.searchEmploy(this.empno);
   }

  ngOnInit() {
  }

}
