import React, {Component} from 'react';
import './first.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as firstActions from "../../store/first/actions";
export default class first extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }

    componentDidMount() {
      const apiUrl = 'https://api.github.com/users/hacktivist123/repos';
      fetch(apiUrl)
        .then((response) => response.json())
        .then((data) => console.log('This is your data', data));
    }
    render() {
      return <div className="component-first">Hi I am Prasanna Trainer...This is my First Component</div>;
    }
  }
// export default connect(
//     ({ first }) => ({ ...first }),
//     dispatch => bindActionCreators({ ...firstActions }, dispatch)
//   )( first );