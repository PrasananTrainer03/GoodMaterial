import React, {Component} from 'react';
import './welcome.scss'
import { withRouter } from '../../withRouter';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as welcomeActions from "../../store/welcome/actions";
export class welcome extends Component {
    constructor(props) {
        super(props);
        this.firstquestion = this.firstquestion.bind(this);
        this.state = {};
    }
    firstquestion() {
      this.props.navigate("/firstq")
    }
    render() {
      return <div className="component-welcome">
        Welcome to Interview Wizard...
      Please Click on Start-Test Button to Start the Test...All the best. 
      <br/>
      Please Start test &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" onClick={this.firstquestion} value="Start Test" />

        </div>;
    }
  }
  export default withRouter(welcome);
// export default connect(
//     ({ welcome }) => ({ ...welcome }),
//     dispatch => bindActionCreators({ ...welcomeActions }, dispatch)
//   )( welcome );