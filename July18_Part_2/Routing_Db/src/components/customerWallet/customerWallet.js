import React, {Component} from 'react';
import './customerWallet.scss'
import Menu from '../menu/menu';
import  axios  from 'axios';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerWalletActions from "../../store/customerWallet/actions";
export default class customerWallet extends Component {
    constructor(props) {
        super(props);
        this.state = {
          wallet : []
        };
    }

    componentDidMount() {
      let cid = localStorage.getItem("cid")
      axios.get("http://localhost:1111/showCustomerWallet/"+cid)
      .then(response => {
        this.setState({
          wallet : response.data
        })
        console.log(response.data)
       // localStorage.setItem("cid",response.data.cusId);
   //     alert(localStorage.getItem("cid"))
      })
    }

    render() {
      const {wallet} = this.state
      return <div className="component-customer-wallet">
        <Menu></Menu>
        <table border="3" align='center'>
      <tr>
        <th>Customer Id</th>
        <th>Wallet Id</th>
        <th>Wallet Source</th>
        <th>Wallet Amount</th>
      </tr>
      {
        wallet.map( w => 
          <tr>
            <td>{w.cusId}</td>
            <td>{w.walId}</td>
            <td>{w.walSource}</td>
            <td>{w.walAmount}</td>
            
          </tr>
      )
      }
    </table>

      </div>;
    }
  }
// export default connect(
//     ({ customerWallet }) => ({ ...customerWallet }),
//     dispatch => bindActionCreators({ ...customerWalletActions }, dispatch)
//   )( customerWallet );