import React, {Component} from 'react';
import './third.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as thirdActions from "../../store/third/actions";
export default class third extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      let trainer = "Prasanna"
      return <div className="component-third">
        <Menu />
        {trainer}</div>;
    }
  }
// export default connect(
//     ({ third }) => ({ ...third }),
//     dispatch => bindActionCreators({ ...thirdActions }, dispatch)
//   )( third );