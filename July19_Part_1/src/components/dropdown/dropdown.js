import React, {Component} from 'react';
import './dropdown.scss'
import Menu from '../menu/menu';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as dropdownActions from "../../store/dropdown/actions";
export default class dropdown extends Component {
    constructor(props) {
        super(props);
        this.state = {value: 'kavya'};
    
        this.handleChange = this.handleChange.bind(this);
        //this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleChange(event) {
      this.setState({value: event.target.value});
      alert('Selected Student Name is : ' + this.state.value);
    }
  
    render() {
      return (
        <div>
          <Menu></Menu>
        <form>
        <label>
          Select Student Name :
          <select value={this.state.value} onChange={this.handleChange}>
            <option value="Shubham">Shubham</option>
            <option value="Kavya">Kavya</option>
            <option value="Srikanth">Srikanth</option>
            <option value="Shrivas">Shrivas</option>
          </select>
        </label>
        
      </form>
      </div>
      );
    }
  }
// export default connect(
//     ({ dropdown }) => ({ ...dropdown }),
//     dispatch => bindActionCreators({ ...dropdownActions }, dispatch)
//   )( dropdown );