import React, {Component} from 'react';
import './vendorLogin.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as vendorLoginActions from "../../store/vendorLogin/actions";
export default class vendorLogin extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-vendor-login">Hello! component vendorLogin</div>;
    }
  }
// export default connect(
//     ({ vendorLogin }) => ({ ...vendorLogin }),
//     dispatch => bindActionCreators({ ...vendorLoginActions }, dispatch)
//   )( vendorLogin );