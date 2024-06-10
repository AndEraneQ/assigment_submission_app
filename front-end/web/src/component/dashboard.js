import React, { useState } from 'react';
import useJwt from '../helpers/useJwt';

const Dashboard = () => {

    const [jwt] = useJwt();
  
    return (
        <div>
            <h1>{jwt}</h1>
        </div>
    );
};

export default Dashboard;