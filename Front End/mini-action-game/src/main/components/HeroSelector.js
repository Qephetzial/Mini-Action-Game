import React, {useState} from "react";
import '../../style/HeroSelector.css'

function HeroSelector({heroes, setHeroes, coin, setCoin, appUser, setAppUser}) {

    const [obtained, setObtained] = useState(heroes[0].obtained);
    const [selected, setSelected] = useState(heroes[0].selected);
    const [buttonText, setButtonText] = useState('SELECTED')


    let btnClass = ''


    if (!selected) {
        btnClass = 'btn-10'
    } else {
        btnClass = 'btn-11'
    }

    const classList = btnClass+" select lineBoxing transparent"


    const rollRight = () => {
        let newHeroes = [...heroes]
        newHeroes.push(newHeroes.shift())
        setSelected(newHeroes[0].selected)
        setObtained(newHeroes[0].obtained)
        setHeroes(newHeroes)
        changeButtonText();
    };


    const rollLeft = () => {
        let newHeroes = [...heroes];
        newHeroes.unshift(newHeroes.pop());
        setSelected(newHeroes[0].selected);
        setObtained(newHeroes[0].obtained);
        setHeroes(newHeroes);
        changeButtonText();
    };

    const changeButtonText = () => {
        if (obtained) {
            if (selected) {
                setButtonText("SELECTED");
            } else {
                setButtonText("SELECT");
            }
        } else {
            setButtonText("BUY");
        }
    }

    const select = async () => {
        if (!obtained && heroes[0].value < coin) {
            let newAppUser = appUser;
            newAppUser.coin = coin - heroes[0].value;
            setAppUser(newAppUser);
            await conditionChanger();
            await updateAppUser();
        } else if (obtained){
            await conditionChanger();
            await updateAppUser();
        }
    };


    async function conditionChanger () {
        let newHeroes = [...heroes]
        for (let i = 0; i < newHeroes.length; i++) {
            if (newHeroes[i].selected) {
                newHeroes[i].selected = false;
            }
        }
        newHeroes[0].obtained = true;
        newHeroes[0].selected = true;
        setSelected(newHeroes[0].selected)
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
        setCoin(response.coin)

    }


  return (
    <div>
        <div>
            <span className="hero"><img className="leftSide" src={heroes[heroes.length-1].png} alt={heroes[heroes.length-1].name} border="0"/></span>
            <span className="hero"><img className="main" src={heroes[0].png} alt={heroes[0].name} border="0"/></span>
            <span className="hero"><img className="rightSide" src={heroes[1].png} alt={heroes[1].name} border="0"/></span>
        </div>
        <div className="fixed">
            <a className="lineBoxing arrow as"  onClick={rollLeft}><span><img className="arrow" src={"pngwing.left.png"} alt="left button" border="0" width="30"/></span></a>
            <button id="selector" className={classList} onClick={select}><span>{buttonText}</span></button>
            <a className="lineBoxing arrow as" onClick={rollRight}><span><img className="arrow" src={"pngwing.right.png"} alt="left button" border="0" width="30"/></span></a>
        </div>
    </div>
  );
}

export default HeroSelector