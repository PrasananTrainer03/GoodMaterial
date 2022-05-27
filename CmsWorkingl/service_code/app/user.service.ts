import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  public showUsers() : Observable<User[]> {
    return this._http.get<User[]>("https://jsonplaceholder.typicode.com/users")

  }
  constructor(private _http : HttpClient) { }
}
