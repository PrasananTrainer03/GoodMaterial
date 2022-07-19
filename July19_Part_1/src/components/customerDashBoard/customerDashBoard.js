import React, {Component} from 'react';
import './customerDashBoard.scss'
import Menu from '../menu/menu';
import axios from 'axios';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerDashBoardActions from "../../store/customerDashBoard/actions";
export default class customerDashBoard extends Component {
    constructor(props) {
        super(props);
        this.state = {
          customer : {}
        };
    }
    componentDidMount() {
      let user = localStorage.getItem("cuser")
      axios.get("http://localhost:1111/searchByUser/"+user)
      .then(response => {
        this.setState({
          customer : response.data
        })
        console.log(response.data)
        localStorage.setItem("cid",response.data.cusId);
   //     alert(localStorage.getItem("cid"))
      })
    }
    render() {
      const {customer} = this.state
      return <div className="component-customer-dash-board">
        <Menu></Menu>
        <br/>
        <p>
          Customer Id : {customer.cusId}
        </p>
        <p>
          Customer Name : {customer.cusName}
        </p>
        <p>
          Customer Phone No : {customer.cusPhnNo}
        </p>
        <p>
          Customer User Name : {customer.cusUsername}
        </p>
        <p>
          Customer Password : {customer.cusPassword}
        </p>
        <p>
          Customer Email : {customer.cusEmail}
        </p>
        Hello! component customerDashBoard</div>;
    }
  }
// export default connect(
//     ({ customerDashBoard }) => ({ ...customerDashBoard }),
//     dispatch => bindActionCreators({ ...customerDashBoardActions }, dispatch)
//   )( customerDashBoard );