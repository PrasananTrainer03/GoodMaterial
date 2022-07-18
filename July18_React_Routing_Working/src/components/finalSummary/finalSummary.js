import React, {Component} from 'react';
import './finalSummary.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as finalSummaryActions from "../../store/finalSummary/actions";
export default class finalSummary extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-final-summary">
        Hello! component finalsummary...You successfully submitted exam.
        We will announce results soon...
        </div>;
    }
  }
// export default connect(
//     ({ finalSummary }) => ({ ...finalSummary }),
//     dispatch => bindActionCreators({ ...finalSummaryActions }, dispatch)
//   )( finalSummary );