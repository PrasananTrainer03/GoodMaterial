import React, {Component} from 'react';
import './about.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as aboutActions from "../../store/about/actions";
export default class about extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-about">Hello! component about</div>;
    }
  }
// export default connect(
//     ({ about }) => ({ ...about }),
//     dispatch => bindActionCreators({ ...aboutActions }, dispatch)
//   )( about );