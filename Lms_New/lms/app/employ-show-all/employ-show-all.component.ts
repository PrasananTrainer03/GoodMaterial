import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employ-show-all',
  templateUrl: './employ-show-all.component.html',
  styleUrls: ['./employ-show-all.component.css']
})
export class EmployShowAllComponent implements OnInit {

  employs : Observable<Employ[]>;
  constructor(private _employSerivce : EmployService, private _router : Router) {
    this.employs=this._employSerivce.getEmploys();
   }

   login(empId,mgrId) {
    localStorage.setItem("empId",empId);
    localStorage.setItem("mgrId",mgrId);
    this._router.navigate(['/login']);
   }

  ngOnInit() {
  }

}
