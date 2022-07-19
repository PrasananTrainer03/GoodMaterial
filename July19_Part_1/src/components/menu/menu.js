import React, {Component} from 'react';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";

import './menu.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as menuActions from "../../store/menu/actions";
export default class menu extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-menu">
              {/* <Link to="/">First</Link>{' '}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; */}
      <Link to="/first">First</Link>

      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerDashboard">Customer Dashboard</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerShow">Customer Show</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerWallet">Customer Wallet</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerOrders">Customer Orders</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerPendingOrders">Customer Pending Orders</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/second">Second</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/third">Third</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fourth">Fourth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fifth">Fifth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/six">six</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/seven">seven</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/button">Button Example</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/multiForm">MultiForm Example</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/calc">Calculation</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/dropDown">DropDown Example</Link>

        </div>;
    }
  }
// export default connect(
//     ({ menu }) => ({ ...menu }),
//     dispatch => bindActionCreators({ ...menuActions }, dispatch)
//   )( menu );