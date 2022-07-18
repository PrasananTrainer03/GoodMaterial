import React, {Component} from 'react';
import './secondQuestion.scss'
import { withRouter } from '../../withRouter';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as secondQuestionActions from "../../store/secondQuestion/actions";
export class secondQuestion extends Component {
  constructor(props) {  
    super(props);  
    if(localStorage.getItem("qual") !==undefined) {
      this.state = {  
        qualification: localStorage.getItem("qual"),
        city : localStorage.getItem("city"),
        state : localStorage.getItem("st")
      };  
    } else {
      this.state = {  
        qualification: '',
        city : '',
        state : ''
      };    
    }    
}  

nextButton = () => {
  // alert(this.state.firstName);
 // alert(this.state.qualification);
   localStorage.setItem("qual",this.state.qualification);
   localStorage.setItem("city",this.state.city);
   localStorage.setItem("st",this.state.state);
   this.props.navigate('/thirdq')
 }

 prevButton = () => {
  this.props.navigate("/firstq")
}


    changeQualification(event) {  
      this.setState({  
          qualification: event.target.value
      });  
  }
  changeCity(event) {  
    this.setState({  
        city: event.target.value
    });  
  }  
  
  
  changeState(event) {  
    this.setState({  
        state: event.target.value
    });  
  }  
  
    render() {
      return <div className="component-second-question">
        <h2>Qualification Details</h2>
            <table border="3" align='center'>
              <tr>
                <th>
                <label htmlFor="Qualification">Qualification </label>
                </th>
                <td>
                <input type="text" id="qualification" value={this.state.qualification} 
                  onChange={this.changeQualification.bind(this)}/>
                </td>
              </tr>
              <tr>
                <th>
                <label htmlFor="City">City</label>
                  </th>
                  <td>
                  <input type="text" id="city" value={this.state.city} onChange={this.changeCity.bind(this)} />
                  </td>
                </tr> 
                <tr>
                <th>
                <label htmlFor="mi">Enter State</label>
                </th>
                <td>
                <input type="text" id="state" value={this.state.state} onChange={this.changeState.bind(this)} />
                </td>
                </tr>
                <tr>
                  <th colspan="2">
                  <input type="button" onClick={this.prevButton} value="Previous Question" />
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <input type="button" onClick={this.nextButton} value="Next Question" />
                  </th>
                </tr>
            </table>
        </div>;
    }
  }

  export default withRouter(secondQuestion);
  
// export default connect(
//     ({ secondQuestion }) => ({ ...secondQuestion }),
//     dispatch => bindActionCreators({ ...secondQuestionActions }, dispatch)
//   )( secondQuestion );