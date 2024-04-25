import React, { ChangeEvent, useState } from 'react';


interface TileSelectorProps {
    tileTypes: string[];
}

function TileSelector({tileTypes}: TileSelectorProps) {
    let arr: JSX.Element[] = [];
    tileTypes.forEach((element, index) => {
      if(element === '[x]') {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-amber-500'>{element}</button>);
      } else if(element === ' @ ') {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-emerald-500'>{element}</button>)
      } else if(element === ' c ') {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-emerald-500'>{element}</button>)
      } else if(element === '[[]' || element === '[]]') {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-blue-500'>{element}</button>)
      } else if(element === ' . ') {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-green-500'>{element}</button>)
      } else {
        arr.push(<button key={index} className = 'p-2 w-12 h-12 bg-gray-200'>{element}</button>)
      }
    });

    return arr;
  }

  export default TileSelector;