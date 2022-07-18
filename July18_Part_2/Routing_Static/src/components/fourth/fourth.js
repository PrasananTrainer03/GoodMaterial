import React, {Component} from 'react';
import './fourth.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as fourthActions from "../../store/fourth/actions";
export default class fourth extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      let trainer = "Prasanna"
      let topic = "React"
      let module = "Module 3"
      return <div className="component-fourth">
        <Menu></Menu>
        Hi Everone {trainer} is taking {topic} on {module}</div>;
    }
  }
// export default connect(
//     ({ fourth }) => ({ ...fourth }),
//     dispatch => bindActionCreators({ ...fourthActions }, dispatch)
//   )( fourth );