import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CalcComponent } from './calc/calc.component';
import { EmployComponent } from './employ/employ.component';
import { LoginReactiveComponent } from './login-reactive/login-reactive.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CalcComponent,
    EmployComponent,
    LoginReactiveComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
