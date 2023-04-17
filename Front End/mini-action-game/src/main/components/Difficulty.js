import React from "react";

function Difficulty() {
    const handleClick = event => {
        const element = document.getElementById('11')
        element.classList.replace('btn-11', 'btn-10')
        element.id = '10';
        event.currentTarget.classList.replace('btn-10', 'btn-11')
        event.currentTarget.id = "11"
    };


    return <div>
        <h1>DIFFICULTY</h1>
        <button id='11' className='blockBox btn-11 transparent' onClick={handleClick}><span>EASY</span></button>
        <button id='10' className='blockBox btn-10 transparent' onClick={handleClick}><span>MEDIUM</span></button>
        <button id='10' className='blockBox btn-10 transparent' onClick={handleClick}><span>HARD</span></button>
    </div>
}

export default Difficulty