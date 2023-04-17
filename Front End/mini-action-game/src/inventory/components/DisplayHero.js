import React from "react";

function DisplayHero({hero}) {
    return (
        <img className='displayHero' src={hero.link} alt="selected hero"/>
    )
}

export default DisplayHero