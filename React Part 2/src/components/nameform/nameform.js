import React, {Component} from 'react';
import './nameform.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as nameformActions from "../../store/nameform/actions";
export default class nameform extends Component {
    constructor(props) {
        super(props);
        this.state = {};
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);    
    }
    
    handleChange(event) {
      this.setState({value: event.target.value});
    }
  
    handleSubmit(event) {
      alert('A name was submitted: ' + this.state.value);
      event.preventDefault();
    }
  
    render() {
      return (
        <form onSubmit={this.handleSubmit}>
          <label>
            Name:
            <input type="text" value={this.state.value} onChange={this.handleChange} />
          </label>
          <input type="submit" value="Submit" />
        </form>
      );
    }
  }
// export default connect(
//     ({ nameform }) => ({ ...nameform }),
//     dispatch => bindActionCreators({ ...nameformActions }, dispatch)
//   )( nameform );