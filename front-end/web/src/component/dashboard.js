import React, { useState } from 'react';
import axios from 'axios';

const Dashboard = () => {

    const jwt = localStorage.getItem('jwt');

    function createAssigment () {
        axios.post("http://localhost:8080/api/assignments", {}, {
            headers: {
                'Content-Type': 'application/json',
                Authorization: 'Bearer '+ jwt
            }
        }).then(response => {
            if (response.status === 200) {
                console.log(response.data);
            }
        })
        .catch(error => {
            console.error('Error creating assignment:', error.message);
        });
    }

    
    return (
        <div style = {{margin: '2em'}}>  
            <button onClick={() => createAssigment()}>Submit New Assignment</button>
        </div>
    );
};

export default Dashboard;