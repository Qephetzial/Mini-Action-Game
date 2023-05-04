import React, { useState } from "react";

function Difficulty() {
    const [activeButton, setActiveButton] = useState("easy");

    const handleClick = (difficulty) => {
        setActiveButton(difficulty);
    };

    return (
        <div>
            <h1>DIFFICULTY</h1>
            <button
                className={`blockBox ${activeButton === "easy" ? "btn-11" : "btn-10"} transparent`}
                onClick={() => handleClick("easy")}
            >
                <span>EASY</span>
            </button>
            <button
                className={`blockBox ${activeButton === "medium" ? "btn-11" : "btn-10"} transparent`}
                onClick={() => handleClick("medium")}
            >
                <span>MEDIUM</span>
            </button>
            <button
                className={`blockBox ${activeButton === "hard" ? "btn-11" : "btn-10"} transparent`}
                onClick={() => handleClick("hard")}
            >
                <span>HARD</span>
            </button>
        </div>
    );
}

export default Difficulty;