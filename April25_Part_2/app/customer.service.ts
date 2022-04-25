import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public showCustomer() : Observable<Customer[]> {
    return this._http.get<Customer[]>("http://localhost:1111/showCustomer")

  }
  public searchByCustomerUserName(user : string) : Observable<Customer> {
    return this._http.get<Customer>("http://localhost:1111/searchBycustomerUsername/"+user)
  }
  public customerAuthenticate(user : string, pwd:string) : Observable<string> {
    return this._http.get<string>("http://localhost:1111/custAuthenticate/"+user+ "/" +pwd)

  }
  constructor(private _http : HttpClient) { }
}
