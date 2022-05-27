import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import { Employ } from './employ';


@Injectable({
  providedIn: 'root'
})
export class EmployService {

  getEmploys(): Observable<Employ[]> {
    return this._http.get
    ("http://localhost:8080/LmsNew/webapi/employee")
       .map((res: Response) => res.json()).catch(this.handleError);;
  }

  searchEmploy(empId):Observable<Employ> {
    console.log('getEmployees called on employee.service'+empId);
    return this._http.get('http://localhost:8080/LmsNew/webapi/employee/searchemployee/'+empId)
    .map(response => response.json() as Employ)
  }
  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
}



  constructor(private _http : Http) { }
}
