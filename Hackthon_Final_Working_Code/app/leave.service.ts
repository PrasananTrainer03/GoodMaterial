import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Leave } from './leave';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  public leaveHistory(id : number) : Observable<Leave[]> {
    return this._http.get<Leave[]>("http://localhost:8811/leaveHistory/"+id)
  }
  // leaveHistory(empId : number) : Observable<Leave[]> {
  //   return this._http.get("http://localhost:8080/LmsNew/webapi/leave/leaveHistory/"+empId)
  //   .map((res: Response) => res.json()).catch(this.handleError);;
  // }

  pending(id : number) : Observable<Leave[]> {
    return this._http.get<Leave[]>("http://localhost:8811/pendingLeaves/"+id)
  }

  applyLeave(leaveDetails : Leave){
    return this._http.post("http://localhost:8811/applyLeave", leaveDetails);
  }

  public approveDeny(lid : number,eid : number,status: string,mgrComments : string) { 
    return this._http.post("http://localhost:8811/approveDeny/"+lid+"/"+eid+"/"+status+ "/"+mgrComments,null)
   }
  // applyLeave(leaveDetails : Leave){
  //   return this._http.post("http://localhost:1111/placeOrder", orderDetails);
  // }

  // applyLeave(leave : Leave) : Observable<string>{
  //   return this._http.post("http://localhost:8080/LmsNew/webapi/leave/applyLeave/",leave)
  //   .map((res: Response) => res.text());
  // }

constructor(private _http : HttpClient) { }
}
