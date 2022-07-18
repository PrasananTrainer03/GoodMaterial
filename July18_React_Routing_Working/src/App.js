import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";
 import FirstQuestion from './components/firstQuestion/firstQuestion';
 import Welcome from './components/welcome/welcome';
 import SecondQuestion from './components/secondQuestion/secondQuestion';
 import ThirdQuestion from './components/thirdQuestion/thirdQuestion';
 import Summary from './components/summary/summary';
 import FinalSummary from './components/finalSummary/finalSummary';
function App() {
  return (
    <div className="App">
          <Router>
    
    <Routes>
      <Route exact path="/" element={<Welcome />} />
      <Route exact path="/firstq" element={<FirstQuestion></FirstQuestion>}/>
      <Route exact path="/secondq" element={<SecondQuestion></SecondQuestion>}/>
      <Route exact path="/thirdq" element={<ThirdQuestion></ThirdQuestion>}/>
      <Route exact path="/summary" element={<Summary></Summary>}/>
      <Route exact path="/finalSummary" element={<FinalSummary></FinalSummary>}/>
      
      {/* <Route exact path="/recovery-password" element={<RecoveryPassword/>}/>
      <Route path="*" element={<NotFound/>}/> */}
    </Routes>
  
</Router>
  
    </div>
  );
}

export default App;
