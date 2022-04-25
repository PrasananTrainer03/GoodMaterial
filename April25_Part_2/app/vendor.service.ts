import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';import { Vendor } from './vendor';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  public vendorAuthenticate(user : string, pwd:string) : Observable<string> {
    return this._http.get<string>("http://localhost:1111/vendorAuthenticate/"+user+ "/" +pwd)

  }
  public showVendor() : Observable<Vendor[]> {
    return this._http.get<Vendor[]>("http://localhost:1111/showVendor")
  }
  constructor(private _http : HttpClient) { }
}
