import React, {Component} from 'react';
import './userService.scss'
import  axios  from 'axios';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as userServiceActions from "../../store/userService/actions";
export default class userService extends Component {
    constructor(props) {
        super(props);
        this.state = {
          users : []
        };
    }
    componentDidMount() {
      axios.get("https://jsonplaceholder.typicode.com/users")
      .then(response => {
        this.setState({
          users : response.data 
        })
        console.log(response.data)
      })
    }
    render() {
              const {users} = this.state
      return <div className="component-post-service">
        <table border="3" align='center'>
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Website</th>
          </tr>
          {
            users.map( post => 
              <tr>
                <td>{post.id}</td>
                <td>{post.name}</td>
                <td>{post.username}</td>
                <td>{post.email}</td>
                <td>{post.phone}</td>
                <td>{post.website}</td>
              </tr>
          )
          }
        </table>
        </div>;

    }
  }
// export default connect(
//     ({ userService }) => ({ ...userService }),
//     dispatch => bindActionCreators({ ...userServiceActions }, dispatch)
//   )( userService );