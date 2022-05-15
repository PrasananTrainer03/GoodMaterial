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

  employs : Employ[];
  
  constructor(private _employSerivce : EmployService, private _router : Router) {
    this._employSerivce.getEmploys().subscribe(x =>{
      this.employs=x;
    })
   }

   login(empId : number,mgrId : number) {
    localStorage.setItem("empId",empId.toString());
    localStorage.setItem("mgrId",mgrId.toString());
    this._router.navigate(['/login']);
   }

  ngOnInit() {
  }

}
