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
                <h5>{heroes[0].class}</h5>
                <h5>{heroes[0].hitPoint}</h5>
                <h5>{heroes[0].damage}</h5>
                <h5>{heroes[0].defence}</h5>
                <h5>{heroes[0].movementSpeed}</h5>
                <h5>{heroes[0].ultimatePower}</h5>
            </div>
        </div>
    )
}

export default HeroSData