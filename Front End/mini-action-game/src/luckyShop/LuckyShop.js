import React, {useState} from "react";
import Button from "../genericComponents/Button";
import Chest from "./components/Chest";
import Balance from "../genericComponents/Balance";

function LuckyShop({appUser, setAppUser}) {




    const [coin, setCoin] = useState(appUser.coin)

    async function getChests() {
        const requestOptions = {
            method: 'GET',
        }
        return await (await fetch(`/api/chest`, requestOptions)).json();
    }

    const chests = getChests();



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
                    setCoin={setCoin}
                />
                <Chest
                    index={'1'}
                    chest={chests[1]}
                    appUser={appUser}
                    setCoin={setCoin}
                />
            </div>
            <div style={{textAlign:'center'}}>
                <Chest
                    index={'2'}
                    chest={chests[2]}
                    appUser={appUser}
                    setCoin={setCoin}
                />
                <Chest
                    index={'3'}
                    chest={chests[3]}
                    appUser={appUser}
                    setCoin={setCoin}
                />
            </div>
        </>
    )
}

export default LuckyShop