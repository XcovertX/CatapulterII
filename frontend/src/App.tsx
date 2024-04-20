import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    // Fetch message from backend every second
    const interval = setInterval(() => {
      
      axios.get('http://localhost:8080/api/room')
        .then(response => {
          setMessage(response.data);
        })
        .catch(error => {
          console.error('Error fetching message:', error);
        });
      }, 1000)
    return () => clearInterval(interval)
  }, []);

  return (
    <div>
      <h1>Welcome to My App</h1>
      <p>Message from the backend: {message}</p>
    </div>
  );
}

export default App;
