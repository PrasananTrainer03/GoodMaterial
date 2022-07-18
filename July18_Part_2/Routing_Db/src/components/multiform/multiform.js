import React, {Component} from 'react';
import './multiform.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as multiformActions from "../../store/multiform/actions";
export default class multiform extends Component {
  constructor(props) {  
    super(props);  
  //  alert(localStorage.getItem("fname"));
    // if(localStorage.getItem("fname")!==undefined) {
    //   //alert("Setting State Upd");
    //   this.state = {  
    //     firstName: localStorage.getItem("fname") ,
    //     lastName : localStorage.getItem("lname") ,
    //     mi : localStorage.getItem("mi")
    //   };    
    // } else {
      this.state = {  
        firstName: '',
        lastName : '',
        mi : '',
        fullName:''
      };  
    
}  
nextButton = () => {
   let result = this.state.firstName + ' ' + this.state.mi + ' ' 
    + this.state.lastName;
   this.setState({
    fullName: result
   })
 }


changeFirstName(event) {  
    this.setState({  
        firstName: event.target.value
    });  
}

changeFullName(event) {  
  this.setState({  
      fullName: event.target.value
  });  
}
changeLastName(event) {  
  this.setState({  
      lastName: event.target.value
  });  
}  


changeMi(event) {  
  this.setState({  
      mi: event.target.value
  });  
}  

  render() {
      return (  
       
        <div>  
           <Menu></Menu>
            <h2>Personal Information</h2> 
            <table border="3" align='center'>
              <tr>
                <th>
                <label htmlFor="firstName">First name: </label>        
                </th>
                <td>
                <input type="text" id="firstName"
                 value={this.state.firstName} 
                 onChange={this.changeFirstName.bind(this)}/>                    
                  </td>
              </tr>
              <tr>
                <th>
                <label htmlFor="lastName">Last Name</label>
                </th>
                <td>
                <input type="text" id="lastName" value={this.state.lastName} onChange={this.changeLastName.bind(this)} />
                </td>
              </tr>
              <tr>
                <th>
                <label htmlFor="mi">MI</label>      
                </th>
                <td>
                <input type="text" id="mi" value={this.state.mi} 
                onChange={this.changeMi.bind(this)} />            
                </td>
              </tr>
              <tr>
                <th>
                <label htmlFor="fullName">Full Name</label>      
                </th>
                <td>
                <input type="text" id="fullName" 
                    value={this.state.fullName} 
                    onChange={this.changeFullName.bind(this)}
                     />            
                </td>
              </tr>
              <tr>
                <th colspan="2">
                <input type="button" onClick={this.nextButton} 
              value="Show" />                  
                </th>
              </tr>
              </table>  

        </div>  
    );


    }
  }
// export default connect(
//     ({ multiform }) => ({ ...multiform }),
//     dispatch => bindActionCreators({ ...multiformActions }, dispatch)
//   )( multiform );