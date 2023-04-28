import React from "react";

function HeroSData({heroes}) {
    return (
        <div className='place'>
            <div className='data inLine'>
                <h5>Class:&nbsp;</h5>
                <h5>HitPoint:&nbsp;</h5>
                <h5>Damage:&nbsp;</h5>
                <h5>Defence:&nbsp;</h5>
                <h5>Movement Speed:&nbsp;</h5>
                <h5>UltimatePower:&nbsp;</h5>
            </div>
            <div className='data2 inLine'>
                <h5>{heroes[0].name}</h5>
                <h5>{heroes[0].health} + <span style={{color:"green"}}>{heroes[0].armor.health}</span></h5>
                <h5>{heroes[0].strength}</h5>
                <h5>{heroes[0].defence} + <span style={{color:"green"}}>{heroes[0].armor.defence}</span></h5>
                <h5>{heroes[0].movementSpeed}</h5>
                <h5>None</h5>
            </div>
        </div>
    )
}

export default HeroSData