import React from 'react';
import useJwt from '../helpers/useJwt';
import { Navigate } from 'react-router-dom';

const PrivateRoute = ( {children }) => {
    const [jwt, setJwt] = useJwt();
    return jwt ? children : <Navigate to ="/login" />;
};

export default PrivateRoute;