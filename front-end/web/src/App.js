import { useEffect} from 'react';
import './App.css';
import axios from 'axios';
import { Route, Routes } from 'react-router-dom';
import Dashboard from './component/dashboard';
import React, { useState } from 'react';
import Homepage from './component/homepage';


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
    }, [jwt]);

  return (
    <Routes>
      <Route path="/" element = { <Homepage/> } />
      <Route path ="/dashboard" element = { <Dashboard />}/>
    </Routes>
    
  );
}

export default App;
