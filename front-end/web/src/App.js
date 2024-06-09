import { useEffect, useState} from 'react';
import './App.css';
import axios from 'axios';
import { useLocalState } from './util/useLocalStorage';

function App() {
    const [jwt, setJwt] = useLocalState("","jwt");

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
          setJwt(response.data.token);
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
