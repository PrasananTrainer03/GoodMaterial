import React, {Component} from 'react';
import './fifth.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as fifthActions from "../../store/fifth/actions";
export default class fifth extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-third">
        <Menu></Menu>
      <h1>Student Names are  {this.props.name}</h1>
      <ul>
        <li>Vinay</li>
        <li>Vijay</li>
        <li>Vishnu</li>
        <li>Subham</li>
        <li>Kavya</li>
        <li>Shrivas</li>
      </ul>
    </div>;
    }
  }
// export default connect(
//     ({ fifth }) => ({ ...fifth }),
//     dispatch => bindActionCreators({ ...fifthActions }, dispatch)
//   )( fifth );