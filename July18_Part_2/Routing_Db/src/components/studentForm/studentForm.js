import React, {Component} from 'react';
import './studentForm.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as studentFormActions from "../../store/studentForm/actions";
export default class studentForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
          sname:''
        };
    }
    changeSname(event) {
      this.setState({
        sname : event.target.value
      })
    }
    showResult = () => {
      alert(this.state.sname)
    }
    render() {
      return (
        <form onSubmit={this.showResult}>
          Student Name : 
          <input type="text" id="sname" value={this.state.sname} 
            onChange={this.changeSname.bind(this)} />
          <input type="submit" value="Show Result" />
        </form>
      );
    }
  }
// export default connect(
//     ({ studentForm }) => ({ ...studentForm }),
//     dispatch => bindActionCreators({ ...studentFormActions }, dispatch)
//   )( studentForm );