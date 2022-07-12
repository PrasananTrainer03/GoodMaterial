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
    render() {
      return <div className="component-first">Hi I am Prasanna Trainer...This is my First Component</div>;
    }
  }
// export default connect(
//     ({ first }) => ({ ...first }),
//     dispatch => bindActionCreators({ ...firstActions }, dispatch)
//   )( first );