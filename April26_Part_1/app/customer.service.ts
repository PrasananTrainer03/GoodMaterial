import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Orders } from './orders';
import { Wallet } from './wallet';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public showCustomer() : Observable<Customer[]> {
    return this._http.get<Customer[]>("http://localhost:1111/showCustomer")

  }
  placeOrder(orderDetails : Orders){
    return this._http.post("http://localhost:1111/placeOrder", orderDetails);
  }
  public showCustomerPendingOrders(cid : number) : Observable<Orders[]> {
    return this._http.get<Orders[]>("http://localhost:1111/customerOrders/"+cid)
  }
  public showCustomerOrders(cid : number) : Observable<Orders[]> {
    return this._http.get<Orders[]>("http://localhost:1111/customerPendingOrders/"+cid)
  }

  public showCustomerWallet(cid : number) : Observable<Wallet[]> {
    return this._http.get<Wallet[]>("http://localhost:1111/showCustomerWallet/"+cid);
  }
  public searchByCustomerUserName(user : string) : Observable<Customer> {
    return this._http.get<Customer>("http://localhost:1111/searchBycustomerUsername/"+user)
  }
  public customerAuthenticate(user : string, pwd:string) : Observable<string> {
    return this._http.get<string>("http://localhost:1111/custAuthenticate/"+user+ "/" +pwd)

  }
  constructor(private _http : HttpClient) { }
}
