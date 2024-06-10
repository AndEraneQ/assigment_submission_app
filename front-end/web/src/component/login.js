import React, { useState } from 'react';
import axios from 'axios';

const Login = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [jwt, setJwt] = useState(() => {
        const token = localStorage.getItem('jwt');
        return token ? JSON.parse(token) : "";
    });

    const sendLoginRequest = () => {
        const reqBody = {
            username: username,
            password: password
        };
        axios.post('http://localhost:8080/api/auth/login', reqBody, {
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then((response) => {
            if (response.status === 200) {
                localStorage.setItem('jwt', JSON.stringify(response.data.token));
                setJwt(response.data.token);
                window.location.href = 'dashboard';
            }
        })
        .catch((error) => {
            if (error.response && error.response.status === 401) {
                console.error('Error 401: Unauthorized. Invalid credentials.');
            } else {
                console.error('Login request failed:', error.message);
            }
        });
    };

    return (
        <>
            <div>
                <label htmlFor='username'>Username</label>
                <input 
                    type='email' 
                    id='username' 
                    value={username} 
                    onChange={(event) => setUsername(event.target.value)}
                />
            </div>
            <div>
                <label htmlFor='password'>Password</label>
                <input 
                    type='password' 
                    id='password' 
                    value={password} 
                    onChange={(event) => setPassword(event.target.value)}
                />
            </div>
            <div>
                <button 
                    id='submit' 
                    type='button' 
                    onClick={sendLoginRequest}
                >
                    Login
                </button>
            </div>
        </>
    );
};

export default Login;
