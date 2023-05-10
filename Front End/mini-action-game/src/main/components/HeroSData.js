import React from "react";

function HeroSData({hero}) {
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
                <h5>{hero.name}</h5>
                <h5>{hero.health}</h5>
                <h5>{hero.strength}</h5>
                <h5>{hero.defence}</h5>
                <h5>{hero.movementSpeed}</h5>
                <h5>None</h5>
            </div>
        </div>
    )
}

export default HeroSData