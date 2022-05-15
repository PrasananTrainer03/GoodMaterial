import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Leave } from './leave';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  leaveHistory(empId : number) : Observable<Leave[]> {
    return this._http.get("http://localhost:8080/LmsNew/webapi/leave/leaveHistory/"+empId)
    .map((res: Response) => res.json()).catch(this.handleError);;
  }

  pending(empId : number) : Observable<Leave[]> {
    return this._http.get("http://localhost:8080/LmsNew/webapi/leave/pending/"+empId)
    .map((res: Response) => res.json()).catch(this.handleError);;
  }

  applyLeave(leave : Leave) : Observable<string>{
    return this._http.post("http://localhost:8080/LmsNew/webapi/leave/applyLeave/",leave)
    .map((res: Response) => res.text());
  }
  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
}

  constructor(private _http : Http) { }
}
