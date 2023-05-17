import React, {useEffect, useState} from "react";

function DisplayHero({appUser}) {
    const[heroGif, setHeroGif] = useState();
    useEffect(()=> {
        for (const hero of appUser.heroes) {
            if (hero.selected) {
                setHeroGif(hero.gif);
            }
        }
    })

    return (
        <img className='displayHero' src={heroGif} alt="selected hero"/>
    )
}

export default DisplayHero