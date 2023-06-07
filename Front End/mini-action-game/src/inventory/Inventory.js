import React, {useState} from "react";
import Button from "../genericComponents/Button";
import DisplayHero from "./components/DisplayHero";
import ItemPlaceHolder from "./components/ItemPlaceHolder";


function Inventory({appUser, setAppUser}) {

    const items = appUser.weapons.concat(appUser.armors);
    let displayableItems = [];
    const [forStart, setForStart] = useState(0);
    const [forEnd, setForEnd] = useState(30)

    for (let i = forStart; i < forEnd; i++) {
        if (items.length <= i) {
            displayableItems.push(null)
        } else {
            displayableItems.push(items[i]);
        }
    }

    const rollLeft=()=> {
        if (forStart === 0) {
        } else {
            const newStart = forStart-30;
            const newEnd = forEnd-30;
            setForStart(newStart);
            setForEnd(newEnd);
        }
    }

    const rollRight=()=> {
        if (items.length <= forStart+30) {
        } else {
            const newStart = forStart+30;
            const newEnd = forEnd+30;
            setForStart(newStart);
            setForEnd(newEnd);
        }
    }


    return (
        <>
            <div className="inLine" style={{width:'50%'}} >
                <Button
                    text={'BACK'}
                    href={'/main'}
                    classes={"refBtn btn-10 select lineBoxing transparent"}
                />
                <Button
                   text={'LUCKY SHOP'}
                   href={'/lucky-shop'}
                   classes={"refBtn btn-10 select lineBoxing transparent"}
               />
                <DisplayHero
                   appUser={appUser}
                />
                <div className='displayHero'>
                    <ItemPlaceHolder
                        item={appUser.heroes[0].weapon}
                        index={'20'}
                    />
                    <ItemPlaceHolder
                        item={appUser.heroes[0].armor}
                        index={'21'}
                        appUser={appUser}
                        setAppUser={setAppUser}
                    />
                </div>
            </div>
            <div className='inLine grid'>
                    {displayableItems.map(item => {
                        return <ItemPlaceHolder
                            item={item}
                            appUser={appUser}
                            setAppUser={setAppUser}
                        />
                    })}
            </div>
            <div style={{textAlign:"center"}}>
                <div className="lineBoxing arrow as" onClick={rollLeft}><span><img className="arrow" src={"supplementary/left-inventory-arrow.png"} alt="left button" border="0" width="30"/></span></div>
                <div style={{float:"right"}} className="lineBoxing arrow as" onClick={rollRight}><span><img className="arrow" src={"supplementary/right-inventory-arrow.png"} alt="right button" border="0" width="30"/></span></div>
            </div>
        </>
    )
}

export default Inventory;