import React, {useEffect, useState} from "react";
import Button from "../genericComponents/Button";
import DisplayHero from "./components/DisplayHero";
import ItemPlaceHolder from "./components/ItemPlaceHolder";

function Inventory({appUser, setAppUser}) {


    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })


    const [items, setItems] = useState([])

    console.log(appUser.items.commonAndUnCommonArmors[0])

    return (
        <>
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
            <div className='placHolderBlock'>
                <div className=''>
                    <ItemPlaceHolder
                        item={appUser.items.commonAndUnCommonArmors[0]}
                        index={'0'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'1'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'2'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'3'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'4'}
                    />
                </div>
                <div className=''>
                    <ItemPlaceHolder
                        item={null}
                        index={'5'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'6'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'7'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'8'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'9'}
                    />
                </div>
                <div className=''>
                    <ItemPlaceHolder
                        item={null}
                        index={'10'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'11'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'12'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'13'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'14'}
                    />
                </div>
                <div className=''>
                    <ItemPlaceHolder
                        item={null}
                        index={'15'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'16'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'17'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'18'}
                    />
                    <ItemPlaceHolder
                        item={null}
                        index={'19'}
                    />
                </div>
            </div>
            <div className='displayHero'>
                <ItemPlaceHolder
                    item={null}
                    index={20}
                />
                <ItemPlaceHolder
                    item={appUser.heroes[0].armor}
                    index={21}
                />
            </div>
        </>
    )
}

export default Inventory;