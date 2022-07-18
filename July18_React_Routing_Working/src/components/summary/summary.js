import React, {Component} from 'react';
import './summary.scss'
import { withRouter } from '../../withRouter';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as summaryActions from "../../store/summary/actions";
export  class summary extends Component {
  constructor(props) {
    super(props);
    this.firstName=localStorage.getItem("fname");
    this.lastName=localStorage.getItem("lname");
    this.mi=localStorage.getItem("mi");
    this.qual=localStorage.getItem("qual");
    this.city=localStorage.getItem("city"); 
    this.st=localStorage.getItem("st");
  //  alert(localStorage.getItem("company"));
    this.company=localStorage.getItem("company");
    this.instructor=localStorage.getItem("instructor");
    //alert(this.qual);
    this.state = {};
}

prevButton = () => {
  this.props.navigate('/thirdq')
}

submitButton = () => {
  this.props.navigate('/finalSummary')
}

  render() {
      return <div className="component-summary">
      <h2>Summary</h2>
      <table border="3" align="center">
        <tr>
        <th>
          FirstName
        </th>
        <td>
          {this.firstName}
        </td>
        </tr>
        <tr>
        <th>
          LastName
        </th>
        <td>
          {this.lastName}
        </td>
        </tr>
        <tr>
        <th>
          MI
        </th>
        <td>
          {this.mi}
        </td>
        </tr>
        <tr>
        <th>
          Qualification
        </th>
        <td>
          {this.qual}
        </td>
        </tr>
        <tr>
        <th>
          City
        </th>
        <td>
          {this.city}
        </td>
        </tr>
        <tr>
        <th>
          State
        </th>
        <td>
          {this.st}
        </td>
        </tr>
        <tr>
        <th>
          Previous Company
        </th>
        <td>
          {this.company}
        </td>
        </tr>
        <tr>
        <th>
          Manager
        </th>
        <td>
          {this.instructor}
        </td>
        </tr>

      </table>
      <p>
      <input type="button" onClick={this.prevButton} value="Previous Question" />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="button" onClick={this.submitButton} value="Final Submit" />
          </p>
         

    </div>;

          }
  }

  export default withRouter(summary);
  
// export default connect(
//     ({ summary }) => ({ ...summary }),
//     dispatch => bindActionCreators({ ...summaryActions }, dispatch)
//   )( summary );