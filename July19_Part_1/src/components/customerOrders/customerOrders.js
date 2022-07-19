import React, {Component} from 'react';
import './customerOrders.scss'
import axios from 'axios';
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerOrdersActions from "../../store/customerOrders/actions";
export default class customerOrders extends Component {
  constructor(props) {
    super(props);
    this.state = {
      orders : []
    };
}

componentDidMount() {
  let cid = localStorage.getItem("cid")
 // alert(cid)
  axios.get("http://localhost:1111/customerOrders/"+cid)
  .then(response => {
    this.setState({
      orders : response.data
    })
    console.log(response.data)
  })
}

render() {
  const {orders} = this.state
  return <div className="component-customer-wallet">
    <Menu></Menu>
    <table border="3" align='center'>
  <tr>
    <th>Order Id</th>
    <th>Customer Id</th>
    <th>Menu Id</th>
    <th>Vendor Id</th>
    <th>Wallet Source</th>
    <th>Order Quantity</th>
    <th>Bill Amount</th>
    <th>Order Status</th>
    <th>Order Comments</th>
  </tr>
  {
    orders.map( order => 
      <tr>
        <td>{order.ordId}</td>
        <td>{order.cusId}</td>
        <td>{order.menId}</td>
        <td>{order.venId}</td>
        <td>{order.walSource}</td>
        <td>{order.ordQuantity}</td>
        <td>{order.ordBillamount}</td>
        <td>{order.ordStatus}</td>
        <td>{order.ordComments}</td>
        
      </tr>
  )
  }
</table>

  </div>;
}
  }
// export default connect(
//     ({ customerOrders }) => ({ ...customerOrders }),
//     dispatch => bindActionCreators({ ...customerOrdersActions }, dispatch)
//   )( customerOrders );