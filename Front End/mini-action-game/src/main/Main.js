import React, {useEffect, useState} from "react";
import '../style/Main.css';
import Difficulty from "./components/Difficulty";
import Balance from "../genericComponents/Balance";
import HeroSelector from "./components/HeroSelector";
import Button from "../genericComponents/Button";
import HeroSData from "./components/HeroSData";
import '../style/Buttons.css';
import {Outlet} from "react-router-dom";


function Main() {


    const [gold, setGold] = useState('100000')


    const [heroes, setHeroes] = useState([
        {
            link: 'heroes/fighter.png',
            condition: 'SELECTED',
            class: 'fighter',
            hitPoint: 150,
            damage: 30,
            defence: 25,
            movementSpeed: 2,
            ultimatePower: "none",
            price: 0
        },
        {
            link: 'heroes/mage.png',
            condition: 'SELECT',
            class: 'mage',
            hitPoint: 100,
            damage: 60,
            defence: 10,
            movementSpeed: 1,
            ultimatePower: "aoe damage",
            price: 5000
        },
        {
            link: 'heroes/multi-class.png',
            condition: 'BUY',
            class: 'bonus',
            hitPoint: 170,
            damage: 90,
            defence: 40,
            movementSpeed: 3,
            ultimatePower: "freeze",
            price: 10000
        },
        {
            link: 'heroes/ranger.png',
            condition: 'SELECT',
            class: 'ranger',
            hitPoint: 120,
            damage: 40,
            defence: 15,
            movementSpeed: 3,
            ultimatePower: "multiShot",
            price: 2000
        }])


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
                classes={'refBtn btn-10'}
              />
              <Button
                text={'LUCKY SHOP'}
                href={'/lucky-shop'}
                classes={"refBtn btn-10"}
              />
              <HeroSelector
                  heroes={heroes}
                  setHeroes={setHeroes}
                  gold={gold}
                  setGold={setGold}
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
          <Outlet/>
      </>
  );
}

export default Main;
