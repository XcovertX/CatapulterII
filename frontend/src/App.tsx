import React, { useEffect, useState } from 'react';
import axios from 'axios';
import TextAreaComponent from './components/TextAreaComponent';

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
      }, 5000)
    return () => clearInterval(interval)
  }, []);

  return (
    <div>
      <textarea
        value={message}
        rows={10}
        cols={30}
        className='p-5 text-center border border-red-500 font-mono'
      />
    </div>
  );
}

export default App;
