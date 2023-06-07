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
                    />
                </div>
            </div>
            <div className='inLine grid'>
                    {displayableItems.map(item => {
                        return <ItemPlaceHolder item={item}/>
                    })}
            </div>
        </>
    )
}

export default Inventory;