import './App.css';
import axios from 'axios';

function App() {

    const reqBody = {
      "username" : "trevor",
      "password" : "asdfasdf"
    }

    axios.post('http://localhost:8080/api/auth/login', reqBody, {
      headers: {
        'Content-Type': 'application/json'
      }
    })
    .then((response) => {
      console.log(response.data.token);
    });

  return (
    <div className="App">
      <h1>Hello world</h1>
    </div>
  );
}

export default App;
