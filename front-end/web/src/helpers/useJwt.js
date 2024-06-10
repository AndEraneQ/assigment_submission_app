import { useState, useEffect } from 'react';
import axios from 'axios';

const useJwt = () => {
    // const [jwt, setJwt] = useState(() => {
    //     const token = localStorage.getItem('jwt');
    //     return token ? JSON.parse(token) : "";
    // });

    // useEffect(() => {
    //     if (!jwt) {
    //         const reqBody = {
    //             username: "trevor",
    //             password: "asdfasdf"
    //         };
    //         axios.post('http://localhost:8080/api/auth/login', reqBody, {
    //             headers: {
    //                 'Content-Type': 'application/json'
    //             }
    //         })
    //         .then((response) => {
    //             localStorage.setItem('jwt', JSON.stringify(response.data.token));
    //             setJwt(response.data.token);
    //         });
    //     }
    // }, [jwt]);

    // return [jwt, setJwt];
};

export default useJwt;
