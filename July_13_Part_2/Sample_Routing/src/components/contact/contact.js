import React, {Component} from 'react';
import './contact.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as contactActions from "../../store/contact/actions";
export default class contact extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-contact">Hello! component contact</div>;
    }
  }
// export default connect(
//     ({ contact }) => ({ ...contact }),
//     dispatch => bindActionCreators({ ...contactActions }, dispatch)
//   )( contact );