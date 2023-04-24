import React, {useEffect, useState} from "react";
import Button from "../genericComponents/Button";
import DisplayHero from "./components/DisplayHero";
import ItemPlaceHolder from "./components/ItemPlaceHolder";

function Inventory() {


    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })


    const [hero, setHero] = useState({
        link: 'heroes/mage.gif',
        condition: 'SELECTED',
        class: 'bonus',
        hitPoint: 170,
        damage: 90,
        defence: 40,
        movementSpeed: 3,
        ultimatePower: "freeze"
    })


    const [items, setItems] = useState([
        {
            type: 'sword',
            link: 'swords/legendary-demonic-sword.png',
            name: 'Great Sword',
            damage: 15,
            defence: null,
            health: null,
            movementSpeed: null,
            rarity: 'unCommon',
        },
        {
            type: 'bow',
            link: 'bows/legendary-grasp-bow.png',
            name: 'Long Bow',
            damage: 20,
            defence: null,
            health: null,
            movementSpeed: 1,
            rarity: 'unCommon',
        },
        {
            type: 'armor',
            link: 'armors/rare-light-armor.png',
            name: 'Chain Mail',
            damage: null,
            defence: 10,
            health: 20,
            movementSpeed: 1,
            rarity: 'unCommon',
        }
    ])


    return (
        <>
            <Button
                text={'BACK'}
                href={'/main'}
                classes={"refBtn btn-10"}
            />
            <Button
                text={'LUCKY SHOP'}
                href={'/lucky-shop'}
                classes={"refBtn btn-10"}
            />
            <DisplayHero
                hero={hero}
            />
            <div className='placHolderBlock'>
                <div className=''>
                    <ItemPlaceHolder
                        item={items[0]}
                        index={'0'}
                    />
                    <ItemPlaceHolder
                        item={items[1]}
                        index={'1'}
                    />
                    <ItemPlaceHolder
                        item={items[2]}
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
                    item={items[0]}
                    index={20}
                />
                <ItemPlaceHolder
                    item={items[2]}
                    index={21}
                />
            </div>
        </>
    )
}

export default Inventory;