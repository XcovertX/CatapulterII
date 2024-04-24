import React, { useEffect, useState } from 'react';
import axios from 'axios';
import TextAreaComponent from './components/TextAreaComponent';

interface SelectorProps {
  type: string;
}

interface MapBuilderProps {
  mapLayout: Array<string>;
}

function App() {
  const [message, setMessage] = useState('');
  const [m, setM] = useState([]);

  useEffect(() => {
    // Fetch message from backend every second
    const interval = setInterval(() => {
      
      axios.get('http://localhost:8080/api/room')
        .then(response => {
          setMessage(response.data);
          setM(response.data);
          console.log(response.data);
        })
        .catch(error => {
          console.error('Error fetching message:', error);
        });
      }, 5000)
    return () => clearInterval(interval)
  }, []);

  function Selector() {
    let arr: JSX.Element[] = [];
    m.forEach((element, index) => {
      if(element === '[x]') {
        arr.push(<button key={index} className = 'p-2 bg-red-500'></button>);
      } else if(element === '[[]' || element === '[]]') {
        arr.push(<button key={index} className = 'p-2 bg-blue-500'></button>)
      } else if(element === ' . ') {
        arr.push(<button key={index} className = 'p-2 bg-green-500'></button>)
      } else {
        arr.push(<button key={index} className = 'p-2 bg-gray-200'></button>)
      }
    });

    return arr;
  }

  return (
    <div>
      <div className='grid grid-cols-10 gap-4'>
        {Selector()}
      </div>
      <textarea
        value={message}
        rows={10}
        cols={30}
        className='p-5 text-center border border-red-500 font-mono'
      />
    </div>
  );
}

export {};

export default App;
