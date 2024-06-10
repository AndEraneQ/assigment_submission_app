import { useEffect, useState} from 'react';
import './App.css';
import axios from 'axios';

function App() {
    const [jwt, setJwt] = useState(() => {
      const token = localStorage.getItem('jwt');
      return token ? JSON.parse(token) : "";
    });

    useEffect(() => {
      if(!jwt){
        const reqBody = {
          username : "trevor",
          password : "asdfasdf"
       };
        axios.post('http://localhost:8080/api/auth/login', reqBody, {
         headers: {
           'Content-Type': 'application/json'
          }
        })
        .then((response) => {
          localStorage.setItem('jwt', JSON.stringify(response.data.token));
          setJwt(JSON.stringify(response.data.token));
        });
      }
    }, []);

  return (
    <div className="App">
      <h1>{jwt}</h1>
    </div>
  );
}

export default App;
