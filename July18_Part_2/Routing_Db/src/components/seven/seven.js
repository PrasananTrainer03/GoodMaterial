import React, {Component} from 'react';
import './seven.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as sevenActions from "../../store/seven/actions";
export default class seven extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-seven">
        <Menu></Menu>
        Hi My FirstName is {this.props.firstName} Last Name is {this.props.lastName}</div>;
    }
  }
// export default connect(
//     ({ seven }) => ({ ...seven }),
//     dispatch => bindActionCreators({ ...sevenActions }, dispatch)
//   )( seven );