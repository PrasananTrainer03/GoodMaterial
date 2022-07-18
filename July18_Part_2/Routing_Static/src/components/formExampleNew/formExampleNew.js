import React, {Component} from 'react';
import './formExampleNew.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as formExampleNewActions from "../../store/formExampleNew/actions";
export default class formExampleNew extends Component {
    constructor(props) {
        super(props);
        this.state = {
          name:''
        };
    }
    changeName(event) {  
      this.setState({  
          name: event.target.value
      });  
  }
  showResult = () => {
    alert(this.state.name);
  }
    render() {
      return (
        <form onSubmit={this.showResult}>
          
            Name:
            <input type="text" id="name" value={this.state.name} 
              onChange={this.changeName.bind(this)}/>                    

          <input type="submit" value="Submit" />
        </form>
      );
    }
  }
// export default connect(
//     ({ formExampleNew }) => ({ ...formExampleNew }),
//     dispatch => bindActionCreators({ ...formExampleNewActions }, dispatch)
//   )( formExampleNew );