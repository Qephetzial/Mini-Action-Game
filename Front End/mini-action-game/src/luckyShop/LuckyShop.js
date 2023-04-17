import React, {useEffect, useState} from "react";
import Button from "../genericComponents/Button";
import Chest from "./components/Chest";
import Balance from "../genericComponents/Balance";

function LuckyShop() {


    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })


    const [gold, setGold] = useState('1000')


    const [chests, setChests] = useState([
        {
            link: 'chests/iron-chest.png',
            Type: 'IronChest',
            Price: '150G',
            commonDropChance: "80%",
            uncommonDropChance: "15%",
            rareDropChance: "4%",
            epicDropChance: "1%",
            legendaryDropChance: "0%"
        },
        {
            link: 'chests/bronze-chest.png',
            Type: 'BronzeChest',
            Price: '250G',
            commonDropChance: "70.3%",
            uncommonDropChance: "20.2%",
            rareDropChance: "7.2%",
            epicDropChance: "2,2%",
            legendaryDropChance: "0.1%"
        },
        {
            link: 'chests/silver-chest.png',
            Type: 'SilverChest',
            Price: '400G',
            commonDropChance: "60%",
            uncommonDropChance: "25%",
            rareDropChance: "10%",
            epicDropChance: "4.5%",
            legendaryDropChance: "0.5%"
        },
        {
            link: 'chests/golden-chest.png',
            Type: 'goldenChest',
            Price: '700G',
            commonDropChance: "50%",
            uncommonDropChance: "25%",
            rareDropChance: "15%",
            epicDropChance: "9%",
            legendaryDropChance: "1%",
            chanceForBonusDrop: "0,5%"
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
                text={'Inventory'}
                href={'/inventory'}
                classes={"refBtn btn-10"}
            />
            <div className="Balance">
                <Balance
                    gold={gold}
                />
            </div>
            <div style={{textAlign:'center', marginTop:"1rem"}}>
                <Chest
                    index={'0'}
                    chest={chests[0]}
                />
                <Chest
                    index={'1'}
                    chest={chests[1]}
                />
            </div>
            <div style={{textAlign:'center'}}>
                <Chest
                    index={'2'}
                    chest={chests[2]}
                />
                <Chest
                    index={'3'}
                    chest={chests[3]}
                />
            </div>
        </>
    )
}

export default LuckyShop