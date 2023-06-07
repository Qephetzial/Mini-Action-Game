import React from "react";
import '../../style/HeroSelector.css'

const getButtonText = ({selected, obtained}) => {
    if (selected && obtained) {
        return "SELECTED";
    } else if (!selected && obtained) {
        return "SELECT";
    } else { return "BUY"}
}

function HeroSelector({heroes, setHeroes, coin, setCoin, appUser, setAppUser}) {
    const obtained = heroes[0].obtained;
    const selected = heroes[0].selected;
    const buttonText = getButtonText({selected, obtained});

    let btnClass = ''


    if (!heroes[0].selected) {
        btnClass = 'btn-10'
    } else {
        btnClass = 'btn-11'
    }

    const classList = btnClass+" select lineBoxing transparent"


    const rollRight = () => {
        let newHeroes = [...heroes]
        newHeroes.push(newHeroes.shift())
        setHeroes(newHeroes)
    };


    const rollLeft = () => {
        let newHeroes = [...heroes];
        newHeroes.unshift(newHeroes.pop());
        setHeroes(newHeroes);
    };


    const select = async () => {
        if (!obtained && heroes[0].value <= coin) {
            let newAppUser = appUser;
            newAppUser.coin = coin - heroes[0].value;
            setAppUser(newAppUser);
            setCoin(newAppUser.coin)
            await conditionChanger();
            await updateAppUser();
        } else if (obtained){
            await conditionChanger();
            await updateAppUser();
        }
    };


    async function conditionChanger() {
        let newHeroes = [...heroes]
        for (let i = 0; i < newHeroes.length; i++) {
            if (newHeroes[i].selected) {
                newHeroes[i].selected = false;
            }
        }
        newHeroes[0].obtained = true;
        newHeroes[0].selected = true;
        setHeroes(newHeroes)
        await updateAppUser()
    }


    async function updateAppUser(){
        const requestOptions = {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        await fetch(`/api/user`, requestOptions);
        localStorage.setItem('appUser', JSON.stringify(appUser));
    }


  return (
    <div>
        <div>
            <span className="hero"><img className="leftSide" src={heroes[heroes.length-1].png} alt={heroes[heroes.length-1].name} border="0"/></span>
            <span className="hero"><img className="main" src={heroes[0].png} alt={heroes[0].name} border="0"/></span>
            <span className="hero"><img className="rightSide" src={heroes[1].png} alt={heroes[1].name} border="0"/></span>
        </div>
        <div className="fixed">
            <div className="lineBoxing arrow as"  onClick={rollLeft}><span><img className="arrow" src={"supplementary/left-heroSelector-arrow.png"} alt="left button" border="0" width="30"/></span></div>
            <button id="selector" className={classList} onClick={select}><span>{buttonText}</span></button>
            <div className="lineBoxing arrow as" onClick={rollRight}><span><img className="arrow" src={"supplementary/right-heroSelector-arrow.png"} alt="right button" border="0" width="30"/></span></div>
        </div>
    </div>
  );
}

export default HeroSelector