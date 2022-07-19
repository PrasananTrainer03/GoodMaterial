import logo from './logo.svg';
import './App.css';

import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";

import VendorLogin from './components/vendorLogin/vendorLogin'
import HomePage from './components/homePage/homePage'
import CustomerPendingOrders from './components/customerPendingOrders/customerPendingOrders'
import CustomerOrders from './components/customerOrders/customerOrders'
import CustomerWallet from './components/customerWallet/customerWallet'
import CustomerShow from './components/customerShow/customerShow';
import CustomerDashBoard from './components/customerDashBoard/customerDashBoard';
import Menu from './components/menu/menu';
import Login from './components/login/login';
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
            <h2>Welcome to React Router Tutorial</h2>
      <BrowserRouter>
      {/* <Link to="/">First</Link>{' '}
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/second">Second</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/third">Third</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fourth">Fourth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/fifth">Fifth</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/six">six</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/seven">seven</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/button">Button Example</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/multiForm">MultiForm Example</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/calc">Calculation</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/dropDown">DropDown Example</Link>
 */}
      <Routes>
      <Route path="/" element={<HomePage />} />
        <Route path="/login" element={<Login />} />
        <Route path="/vendorLogin" element={<VendorLogin />} />
        
        <Route path="/customerDashboard" element={<CustomerDashBoard />} />
        <Route path="/customerShow" element={<CustomerShow />} />
        <Route path="/customerWallet" element={<CustomerWallet />} />
        <Route path="/customerOrders" element={<CustomerOrders />} />
        <Route path="/customerPendingOrders" element={<CustomerPendingOrders />} />

        <Route path="/menu" element={<Menu />} />
        <Route path="/first" element={<First />} />
        <Route path="/second" element={<Second />} />
        <Route path="/third" element={<Third />} />
        <Route path="/fourth" element={<Fourth />} />
        <Route path="/fifth" element={ <Fifth></Fifth>} />
        <Route path="/six" element={ <Six user="Prasanna"></Six>} />
        <Route path="/button" element={<ButtonExample />} />
        <Route path="/multiForm" element={<MultiForm />} />
        <Route path="/calc" element={<Calc />} />
        <Route path="/dropDown" element={<DropDown />} />
        <Route path="/seven" element={<Seven firstName="Prasanna" lastName="Pappu"></Seven>
} />
      </Routes>

      </BrowserRouter>
      {/* <header className="App-header">
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
      </header> */}
    </div>
  );
}

export default App;
