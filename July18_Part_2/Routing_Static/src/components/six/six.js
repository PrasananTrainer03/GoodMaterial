import React, {Component} from 'react';
import './six.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as sixActions from "../../store/six/actions";
export default class six extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-six">
        <Menu></Menu>
        <h2>Hello {this.props.user}</h2> 
        </div>;
    }
  }
// export default connect(
//     ({ six }) => ({ ...six }),
//     dispatch => bindActionCreators({ ...sixActions }, dispatch)
//   )( six );