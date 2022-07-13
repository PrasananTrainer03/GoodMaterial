import logo from './logo.svg';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";
import './App.css';
import Home from './components/home/home';
import About from './components/about/about'; 
import Contact from './components/contact/contact';

function App() {
  return (
    <div className="App">
      <h2>Welcome to React Router Tutorial</h2>
      <BrowserRouter>
      <Link to="/">Home</Link>{' '}
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to={{pathname: '/about'}}>About</Link>{' '}
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/contact">Contact</Link>
      <br/><br/><hr/>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="contact" element={<Contact />} />
        <Route path="about" element={<About />}>
        </Route>
      </Routes>
    </BrowserRouter>
        </div>
  );
}

export default App;
