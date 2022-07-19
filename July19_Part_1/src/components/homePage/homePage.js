import React, {Component} from 'react';
import './homePage.scss'
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as homePageActions from "../../store/homePage/actions";
export default class homePage extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-home-page">
        <Link to="/login">Customer Login</Link>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <Link to="/vendorLogin">Vendor Login</Link>
        
        </div>;
    }
  }
// export default connect(
//     ({ homePage }) => ({ ...homePage }),
//     dispatch => bindActionCreators({ ...homePageActions }, dispatch)
//   )( homePage );