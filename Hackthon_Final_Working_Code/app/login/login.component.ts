import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  empno : number;
  pwd : string;
  constructor(private _router : Router) {
    this.empno=parseInt(localStorage.getItem("empId"));
   }

   validate() {
    this._router.navigate(['/dashBoard']);
   }
  ngOnInit() {
  }

}
