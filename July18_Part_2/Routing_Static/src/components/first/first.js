import React, {Component} from 'react';
import './first.scss'
import Menu from '../menu/menu';
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
      return <div className="component-first">
          <Menu></Menu>
        Hi I am Prasanna Trainer...This is my First Component</div>;
    }
  }
// export default connect(
//     ({ first }) => ({ ...first }),
//     dispatch => bindActionCreators({ ...firstActions }, dispatch)
//   )( first );