import React, {Component} from 'react';
import './customerShow.scss'
import  axios  from 'axios';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerShowActions from "../../store/customerShow/actions";
export default class customerShow extends Component {
    constructor(props) {
        super(props);
        this.state = {
          customers : []
        };
    }
    componentDidMount() {
      axios.get("http://localhost:1122/showCustomer")
      .then(response => {
        this.setState({
          customers : response.data 
        })
        console.log(response.data)
      })
    
    }
    render() {
                      const {customers} = this.state
      return <div className="component-customer-service">
        <table border="3" align='center'>
          <tr>
            <th>Customer Id</th>
            <th>Customer Name</th>
            <th>Phone No</th>
            <th>UserName</th>
            <th>Password</th>
            <th>Email</th>
          </tr>
          {
            customers.map( customer => 
              <tr>
                <td>{customer.cusId}</td>
                <td>{customer.cusName}</td>
                <td>{customer.cusPhnNo}</td>
                <td>{customer.cusUsername}</td>
                <td>{customer.cusPassword}</td>
                <td>{customer.cusEmail}</td>
              </tr>
          )
          }
        </table>

        </div>;
    }
  }
// export default connect(
//     ({ customerShow }) => ({ ...customerShow }),
//     dispatch => bindActionCreators({ ...customerShowActions }, dispatch)
//   )( customerShow );