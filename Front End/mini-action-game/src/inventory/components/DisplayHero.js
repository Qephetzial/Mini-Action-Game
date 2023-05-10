import React from "react";

function DisplayHero({appUser}) {
    let heroGif = '';
    if (appUser.heroes.fighter.condition === 'SELECTED') {
        heroGif = appUser.heroes.fighter.gif;
    } else if (appUser.heroes.ranger.condition === 'SELECTED') {
        heroGif = appUser.heroes.ranger.gif;
    } else if (appUser.heroes.mage.condition === 'SELECTED') {
        heroGif = appUser.heroes.mage.gif;
    }  else if (appUser.heroes.demon.condition === 'SELECTED') {
        heroGif = appUser.heroes.demon.gif;
    }

    return (
        <img className='displayHero' src={"heroes/"+ heroGif} alt="selected hero"/>
    )
}

export default DisplayHero