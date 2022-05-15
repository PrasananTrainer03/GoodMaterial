import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employ } from './employ';


@Injectable({
  providedIn: 'root'
})
export class EmployService {

  getEmploys(): Observable<Employ[]> {
       return this._http.get<Employ[]>("http://localhost:8811/")
  }

  public searchEmploy(id : number) : Observable<Employ> {
    return this._http.get<Employ>("http://localhost:8811/search/"+id)
  }


  constructor(private _http : HttpClient) { }
}
