import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http';
import {FormsModule} from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployShowAllComponent } from './employ-show-all/employ-show-all.component';
import { LoginComponent } from './login/login.component';
import { DashBoardComponent } from './dash-board/dash-board.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { ManagerShowComponent } from './manager-show/manager-show.component';
import { LeaveHistoryComponent } from './leave-history/leave-history.component';
import { PendingHistoryComponent } from './pending-history/pending-history.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { ApproveDenyComponent } from './approve-deny/approve-deny.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployShowAllComponent,
    LoginComponent,
    DashBoardComponent,
    EmployShowComponent,
    ManagerShowComponent,
    LeaveHistoryComponent,
    PendingHistoryComponent,
    ApplyLeaveComponent,
    ApproveDenyComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      { path: 'login', component:LoginComponent },
      { path: 'applyLeave', component:ApplyLeaveComponent },
      { path: 'dashBoard', component:DashBoardComponent },
     { path: 'approvedeny', component:ApproveDenyComponent },
     // { path :'ShowLeaveDetails',component:ShowLeaveDetailComponent },
     // {path :'applyleave',component:ApplyLeaveComponent},
      {path: '',component:EmployShowAllComponent}

    ]),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
