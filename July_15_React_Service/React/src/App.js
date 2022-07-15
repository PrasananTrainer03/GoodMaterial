import logo from './logo.svg';
import './App.css';
import PostService from './components/postService/postService';
import UserService from './components/userService/userService';
import CustomerShow from './components/customerShow/customerShow';
function App() {
  return (
    <div className="App">
      <PostService></PostService>
      <UserService></UserService>
      <CustomerShow></CustomerShow>
         </div>
  );
}

export default App;
