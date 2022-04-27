import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerDashBoardComponent } from './customer-dash-board/customer-dash-board.component';
import { CustomerShowComponent } from './customer-show/customer-show.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { CustomerWalletsComponent } from './customer-wallets/customer-wallets.component';
import { RouterModule, Routes } from '@angular/router';
import { VendorLoginComponent } from './vendor-login/vendor-login.component';
import { VendorDashBoardComponent } from './vendor-dash-board/vendor-dash-board.component';
import { VendorShowComponent } from './vendor-show/vendor-show.component';
import { VendorOrdersComponent } from './vendor-orders/vendor-orders.component';
import { VendorPendingOrdersComponent } from './vendor-pending-orders/vendor-pending-orders.component';
import { WalletComponent } from './wallet/wallet.component';
import { PlaceOrderComponent } from './place-order/place-order.component';
import { AcceptRejectOrderComponent } from './accept-reject-order/accept-reject-order.component';

const routes : Routes =
 [
  {path:'',component:HomePageComponent},
  {path:'customerLogin',component:CustomerLoginComponent},
  {path:'vendorLogin',component:VendorLoginComponent},
  {path:'customerDashBoard',component:CustomerDashBoardComponent},
  {path:'vendorDashBoard',component:VendorDashBoardComponent},
  {path:'vendorDashBoard',component:VendorDashBoardComponent,
    children: 
    [
      {path:'vendorShow',component:VendorShowComponent,outlet:'cms'},
      {path:'vendorOrders',component:VendorOrdersComponent,outlet:'cms'},
      {path:'vendorPendingOrders',component:VendorPendingOrdersComponent,outlet:'cms'},
      {path:'acceptreject',component:AcceptRejectOrderComponent,outlet:'cms'},
     // {path:'customerWallet',component:CustomerWalletsComponent,outlet:'cms'},
    ]
  },
  {path:'customerDashBoard',component:CustomerDashBoardComponent,
    children: 
    [
      {path:'customerShow',component:CustomerShowComponent,outlet:'cms'},
      {path:'customerOrders',component:CustomerOrdersComponent,outlet:'cms'},
      {path:'customerPendingOrders',component:CustomerPendingOrdersComponent,outlet:'cms'},
      {path:'customerWallet',component:CustomerWalletsComponent,outlet:'cms'},
      {path:'customerPlaceOrder',component:PlaceOrderComponent,outlet:'cms'},
    ]
  }
]
@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    CustomerLoginComponent,
    CustomerDashBoardComponent,
    CustomerShowComponent,
    CustomerOrdersComponent,
    CustomerPendingOrdersComponent,
    CustomerWalletsComponent,
    VendorLoginComponent,
    VendorDashBoardComponent,
    VendorShowComponent,
    VendorOrdersComponent,
    VendorPendingOrdersComponent,
    WalletComponent,
    PlaceOrderComponent,
    AcceptRejectOrderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
