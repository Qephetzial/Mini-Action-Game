import React, {useState} from "react";
import Difficulty from "./components/Difficulty";
import Balance from "../genericComponents/Balance";
import HeroSelector from "./components/HeroSelector";
import Button from "../genericComponents/Button";
import HeroSData from "./components/HeroSData";


function Main({appUser, setAppUser, activeButton, setActiveButton}) {
    const [coin, setCoin] = useState(appUser.coin);
    const [heroes, setHeroes] = useState(appUser.heroes)

  return (
          <div id="main" className="App">
              <div className="Balance">
                <Balance
                    coin={coin}
                />
              </div>
              <Button
                text={'INVENTORY'}
                href={'/inventory'}
                classes={'refBtn btn-10 select lineBoxing transparent'}
                appUser={appUser}
                setAppUser={setAppUser}
              />
              <Button
                text={'LUCKY SHOP'}
                href={'/lucky-shop'}
                classes={"refBtn btn-10 select lineBoxing transparent"}
              />
              <HeroSelector
                  heroes={heroes}
                  setHeroes={setHeroes}
                  coin={coin}
                  setCoin={setCoin}
                  appUser={appUser}
                  setAppUser={setAppUser}
              />
              <div className="Difficulty">
                <Difficulty
                    activeButton={activeButton}
                    setActiveButton={setActiveButton}
                />
              </div>
              <Button
                text={'PLAY'}
                classes={"play btn-10"}
              />
              <HeroSData
                hero={heroes[0]}
              />
          </div>
  );
}

export default Main;
