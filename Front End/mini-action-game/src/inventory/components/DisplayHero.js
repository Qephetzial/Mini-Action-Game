import React from "react";

function DisplayHero({appUser}) {
    let heroGif = '';
    for (const hero of appUser.heroes) {
        if (hero.condition === 'SELECTED') {
            heroGif = hero.gif
        }
    }
    return (
        <img className='displayHero' src={"heroes/"+ heroGif} alt="selected hero"/>
    )
}

export default DisplayHero