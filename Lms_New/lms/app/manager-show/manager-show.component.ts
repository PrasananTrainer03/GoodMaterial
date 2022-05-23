import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';

@Component({
  selector: 'app-manager-show',
  templateUrl: './manager-show.component.html',
  styleUrls: ['./manager-show.component.css']
})
export class ManagerShowComponent implements OnInit {

  mgrId : number;
  manager : Observable<Employ>;
  constructor(private _employService : EmployService) {
    this.mgrId=parseInt(localStorage.getItem("mgrId"));
    alert(this.mgrId);
    this.manager=this._employService.searchEmploy(this.mgrId);
   }

  ngOnInit() {
  }

}
