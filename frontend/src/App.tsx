import React, { useEffect, useState } from 'react';
import axios from 'axios';
import TextAreaComponent from './components/TextAreaComponent';
import TileSelector from './components/TileSelector';
import Actions from './components/Actions';

interface MapBuilderProps {
  mapLayout: Array<string>;
}

function App() {
  const [message, setMessage] = useState('');
  const [tileTypes, setTileTypes] = useState([]);

  useEffect(() => {
    // Fetch message from backend every second
    const interval = setInterval(() => {
      
      axios.get('http://localhost:8080/api/room')
        .then(response => {
          setMessage(response.data);
          setTileTypes(response.data);
          console.log(response.data);
        })
        .catch(error => {
          console.error('Error fetching message:', error);
        });
      }, 1000)
    return () => clearInterval(interval)
  }, []);

  return (
    <div className='flex pt-5 justify-center'>
      <div className='grid grid-cols-8 gap-2 w-96 h-96'>
        {TileSelector({tileTypes})}
      </div>
      {/* <Actions />
      <textarea
        value={message}
        rows={10}
        cols={30}
        className='p-5 text-center border border-red-500 font-mono'
      /> */}
    </div>
  );
}

export default App;
