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
  constructor(private _http : HttpClient) { }
}
