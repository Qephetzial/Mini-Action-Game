import React, {useEffect, useState} from "react";
import Difficulty from "./components/Difficulty";
import Balance from "../genericComponents/Balance";
import HeroSelector from "./components/HeroSelector";
import Button from "../genericComponents/Button";
import HeroSData from "./components/HeroSData";


function Main({appUser, setAppUser}) {



    const [gold, setGold] = useState();
    useEffect(()=>setGold(appUser.gold))

    const [heroes, setHeroes] = useState(appUser.heroes)

    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })


  return (
      <>
          <div id="main" className="App">
              <div className="Balance">
                <Balance
                    gold={gold}
                />
              </div>
              <Button
                text={'INVENTORY'}
                href={'/inventory'}
                classes={'refBtn btn-10 select lineBoxing transparent'}
              />
              <Button
                text={'LUCKY SHOP'}
                href={'/lucky-shop'}
                classes={"refBtn btn-10 select lineBoxing transparent"}
              />
              <HeroSelector
                  heroes={heroes}
                  setHeroes={setHeroes}
                  gold={gold}
                  setGold={setGold}
                  appUser={appUser}
                  setAppUser={setAppUser}
              />
              <div className="Difficulty">
                <Difficulty/>
              </div>
              <Button
                text={'PLAY'}
                classes={"play btn-10"}
              />
              <HeroSData
                heroes={heroes}
              />
          </div>
      </>
  );
}

export default Main;
