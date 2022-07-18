import React, {Component} from 'react';
import './thirdQuestion.scss'
import { withRouter } from '../../withRouter';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as thirdQuestionActions from "../../store/thirdQuestion/actions";
export  class thirdQuestion extends Component {
  summary = () => {
    //alert(this.state.companyName);
    //alert(this.state.instructor);
    localStorage.setItem("company",this.state.companyName);
    localStorage.setItem("instructor",this.state.instructor);
    this.props.navigate('/summary')  
  }

  prevButton = () => {
    this.props.navigate('/secondq')
  }

  constructor(props) {  
    super(props);  
   // alert(localStorage.getItem("company"));
    if(localStorage.getItem("company")!==undefined) {
      this.state = {  
        companyName: localStorage.getItem("company"),
        instructor : localStorage.getItem("instructor"),
    };  
    } else {
      this.state = {  
        companyName: '',
        instructor : '',
    };    
    }
    
}  

changeText(event) {  
    this.setState({  
        companyName: event.target.value
    });  
}
changeInstructor(event) {  
  this.setState({  
      instructor: event.target.value
  });  
}  

    render() {
      return         <div>  
      <h2>Work History</h2>
      <table border="3" align='center'>
        <tr>
          <th>
          <label htmlFor="name">Previous company : </label>  
          </th>
          <td>
          <input type="text" id="companyName" value={this.state.companyName} onChange={this.changeText.bind(this)}/>
          </td>
        </tr>
        <tr>
          <th>
          <label htmlFor="instructor">Manager Name</label>
          </th>
          <td>
          <input type="text" id="instructorName" value={this.state.instructor} onChange={this.changeInstructor.bind(this)} />
          </td>
        </tr>
        <tr>
          <th colSpan="2">
          <input type="button" onClick={this.prevButton} value="Prev Question" />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="button" onClick={this.summary} value="Summary" />
          </th>
          </tr>
        </table>  
  </div>  

    }
  }
  export default withRouter(thirdQuestion);
  
// export default connect(
//     ({ thirdQuestion }) => ({ ...thirdQuestion }),
//     dispatch => bindActionCreators({ ...thirdQuestionActions }, dispatch)
//   )( thirdQuestion );