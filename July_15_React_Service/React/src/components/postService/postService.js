import React, {Component} from 'react';
import  axios  from 'axios';
import './postService.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as postServiceActions from "../../store/postService/actions";
export default class postService extends Component {
    constructor(props) {
        super(props);
        this.state = {
          posts : []
        };
    }

    componentDidMount() {
      axios.get("https://jsonplaceholder.typicode.com/posts")
      .then(response => {
        this.setState({
          posts : response.data 
        })
        console.log(response.data)
      })
    }

    render() {
      const {posts} = this.state
      return <div className="component-post-service">
        <table border="3" align='center'>
          <tr>
            <th>User Id</th>
            <th>Id</th>
            <th>Title</th>
            <th>Body</th>
          </tr>
          {
            posts.map( post => 
              <tr>
                <td>{post.id}</td>
                <td>{post.userId}</td>
                <td>{post.title}</td>
                <td>{post.body}</td>
              </tr>
          )
          }
        </table>
        </div>;
    }
  }
// export default connect(
//     ({ postService }) => ({ ...postService }),
//     dispatch => bindActionCreators({ ...postServiceActions }, dispatch)
//   )( postService );