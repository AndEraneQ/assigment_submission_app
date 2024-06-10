import React, { useState } from 'react';

const Dashboard = () => {

    const [jwt, setJwt] = useState(() => {
        const token = localStorage.getItem('jwt');
        return token ? JSON.parse(token) : "";
      });
  
    return (
        <div>
            <h1>{jwt}</h1>
        </div>
    );
};

export default Dashboard;