import React, { ChangeEvent, useState } from 'react';

const Look = () => {

    return (
        <div>
            <button className='bg-blue-300 p-2 m-2'>Look</button>
        </div>
    )
}

const Take = () => {

    return (
        <div>
            <button className='bg-blue-300 p-2 m-2'>Take</button>
        </div>
    )
}

const MoveWest = () => {

    return (
        <div>
            <button className='bg-blue-300 p-2 m-2'>W</button>
        </div>
    )
}

const MoveEast = () => {

    return (
        <div>
            <button className='bg-blue-300 p-2 m-2'>E</button>
        </div>
    )
}

const MoveNorth = () => {

    return (
        <div>
            <button className='bg-blue-300 p-2 m-2'>N</button>
        </div>
    )
}

const MoveSouth = () => {

    return (
        <button className='bg-blue-300 p-2 m-2'>S</button>
    )
}

const Actions = () => {

    return (
        <div>
            <div className='flex flex-row'>
                <MoveWest/>
                <MoveNorth/>
                <MoveSouth/>
                <MoveEast/>
            </div>
            <div className='flex flex-row'>
                <Look/>
                <Take/>
            </div>
        </div>
    )
}

export default Actions;