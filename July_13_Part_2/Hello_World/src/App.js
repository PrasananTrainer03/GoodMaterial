import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Third from './components/third/third';
import Fourth from './components/fourth/fourth';
import Fifth from './components/fifth/fifth';
import Six from './components/six/six';
import Seven from './components/seven/seven';
import NameForm from './components/nameform/nameform';
import MultiForm from './components/multiform/multiform';
import ButtonExample from './components/buttonexample/buttonexample';
import FormExampleNew from './components/formExampleNew/formExampleNew';
import StudentForm from './components/studentForm/studentForm';
import Calc from './components/calc/calc';
import DropDown from './components/dropdown/dropdown';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          Welcome to ReactJs...Prasanna Trainer Thank You
        </p>
        <First></First>
        <Second></Second>
        <Third></Third>
        <Fourth></Fourth>
        <Fifth></Fifth>
        <ButtonExample></ButtonExample>
        <FormExampleNew></FormExampleNew>
        <StudentForm></StudentForm>
        <Six user="Prasanna"></Six>
        <Seven firstName="Prasanna" lastName="Pappu"></Seven>
        <NameForm></NameForm>
        <MultiForm></MultiForm>
        <Calc></Calc>
        <DropDown></DropDown>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
