import React, {useState} from "react";
import '../../style/HeroSelector.css'

function HeroSelector({heroes, setHeroes, gold, setGold, appUser, setAppUser}) {

    const [condition, setCondition] = useState(heroes[0].condition)


    let btnClass = ''


    if (condition !== 'SELECTED') {
        btnClass = 'btn-10'
    } else {
        btnClass = 'btn-11'
    }

    const classList = btnClass+" select lineBoxing transparent"


    const rollRight = () => {
        let newHeroes = [...heroes]
        newHeroes.push(newHeroes.shift())
        setCondition(newHeroes[0].condition)
        setHeroes(newHeroes)
    };


    const rollLeft = () => {
        let newHeroes = [...heroes]
        newHeroes.unshift(newHeroes.pop())
        setCondition(newHeroes[0].condition)
        setHeroes(newHeroes)
    };


    const select = async () => {
        if (heroes[0].condition === 'BUY' && heroes[0].value < gold) {
            await conditionChanger()
            await updateAppUser(gold-heroes[0].value)
        } else if (heroes[0].condition !== 'BUY'){
            await conditionChanger()
            await updateAppUser(gold)
        }
    };


    async function conditionChanger () {
        let newHeroes = [...heroes]
        for (let i = 0; i < newHeroes.length; i++) {
            if (newHeroes[i].condition === 'SELECTED') {
                newHeroes[i].condition = 'SELECT'
            }
        }
        newHeroes[0].condition = 'SELECTED'
        setCondition(newHeroes[0].condition)
        setHeroes(newHeroes)
        await updateHeroes()
    }


    async function updateHeroes() {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        await fetch(`/api/user/update-heroes`, requestOptions);
    }

    async function updateAppUser(){
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        const response = await (await fetch(`/api/user/update-appUser`, requestOptions)).json();
        setAppUser(response)
        setGold(response.gold)

    }


  return (
    <div>
        <div>
            <span className="hero"><img className="leftSide" src={"heroes/"+heroes[heroes.length-1].png} alt={heroes[heroes.length-1].name} border="0"/></span>
            <span className="hero"><img className="main" src={"heroes/"+heroes[0].png} alt={heroes[0].name} border="0"/></span>
            <span className="hero"><img className="rightSide" src={"heroes/"+heroes[1].png} alt={heroes[1].name} border="0"/></span>
        </div>
        <div className="fixed">
            <a className="lineBoxing arrow as"  onClick={rollLeft}><span><img className="arrow" src={"pngwing.left.png"} alt="left button" border="0" width="30"/></span></a>
            <button id="selector" className={classList} onClick={select}><span>{condition}</span></button>
            <a className="lineBoxing arrow as" onClick={rollRight}><span><img className="arrow" src={"pngwing.right.png"} alt="left button" border="0" width="30"/></span></a>
        </div>
    </div>
  );
}

export default HeroSelector