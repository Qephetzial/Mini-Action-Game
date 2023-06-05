import React, {useState} from "react";
import Button from "../genericComponents/Button";
import Chest from "./components/Chest";
import Balance from "../genericComponents/Balance";

function LuckyShop({appUser, setAppUser}) {




    const [coin, setCoin] = useState(appUser.coin)


    const [chests, setChests] = useState([
        {
            png: 'chests/iron-chest.png',
            Type: 'IronChest',
            Price: '150G',
            commonDropChance: "80%",
            uncommonDropChance: "15%",
            rareDropChance: "4%",
            epicDropChance: "1%",
            legendaryDropChance: "0%"
        },
        {
            png: 'chests/bronze-chest.png',
            Type: 'BronzeChest',
            Price: '250G',
            commonDropChance: "70.3%",
            uncommonDropChance: "20.2%",
            rareDropChance: "7.2%",
            epicDropChance: "2,2%",
            legendaryDropChance: "0.1%"
        },
        {
            png: 'chests/silver-chest.png',
            Type: 'SilverChest',
            Price: '400G',
            commonDropChance: "60%",
            uncommonDropChance: "25%",
            rareDropChance: "10%",
            epicDropChance: "4.5%",
            legendaryDropChance: "0.5%"
        },
        {
            png: 'chests/golden-chest.png',
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
                classes={"refBtn btn-10 select lineBoxing transparent"}
            />
            <Button
                text={'INVENTORY'}
                href={'/inventory'}
                classes={"refBtn btn-10 select lineBoxing transparent"}
                appUser={appUser}
                setAppUser={setAppUser}
            />
            <div className="Balance">
                <Balance
                    coin={coin}
                />
            </div>
            <div style={{textAlign:'center', marginTop:"1rem"}}>
                <Chest
                    index={'0'}
                    chest={chests[0]}
                    appUser={appUser}
                />
                <Chest
                    index={'1'}
                    chest={chests[1]}
                    appUser={appUser}
                />
            </div>
            <div style={{textAlign:'center'}}>
                <Chest
                    index={'2'}
                    chest={chests[2]}
                    appUser={appUser}
                />
                <Chest
                    index={'3'}
                    chest={chests[3]}
                    appUser={appUser}
                />
            </div>
        </>
    )
}

export default LuckyShop