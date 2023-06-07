import React, {useState} from "react";

function Chest({index, chest, appUser, setCoin}) {

    const [img, setImg] = useState(<img src={chest.png} alt={chest.Type} style={{width:"400px"}}/>)

    const id = "myModal"+index

    const [displayableProps, setDisplayableProps] = useState(chest)
    const[className, setClassName] = useState("modalClose")


    const openModal = ()=> {
        if (chest !== null) {
            setClassName("modalOpen")
        }
    }


    const closeModal = ()=>{setClassName("modalClose")}


    const modal = document.getElementById(id);


    window.onclick = function(event) {
        if (event.target === modal) {
            closeModal()
        }
    }


    let stats = []


    for (const property in displayableProps) {
        if (displayableProps[property] !== null && property !== 'png') {
            stats.push(`${property}: ${displayableProps[property]}`)
        }
    }


    const createItem = async() => {
        let route = null
        switch (index) {
            case '0':
                if (appUser.coin < 150) {
                    return;
                } else {
                    appUser.coin -= 150;
                    setCoin(appUser.coin)
                    route = "iron";
                    break;
                }
            case '1':
                if (appUser.coin < 250) {
                    return;
                } else {
                    appUser.coin -= 250;
                    setCoin(appUser.coin)
                    route = "bronze";
                    break;
                }
            case '2':
                if (appUser.coin < 400) {
                    return;
                } else {
                    appUser.coin -= 400;
                    setCoin(appUser.coin)
                    route = "silver";
                    break;
                }
            case '3':
                if (appUser.coin < 700) {
                    return;
                } else {
                    appUser.coin -= 700;
                    setCoin(appUser.coin)
                    route = "golden";
                    break;
                }
        }
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        const response = await(await fetch(`/api/chest/${route}`, requestOptions)).json();
        setDisplayableProps(response[0])
        setImg(<img src={response[0].png} alt={response[0].Type} style={{width:"400px", backgroundColor:"white"}}/>)
        if (response[0].type == "ARMOR") {
            appUser.armors.push(response[0])
        } else {
            appUser.weapons.push(response[0])
        }
        if (response.size === 2) {setTimeout(() => {
            setImg(<img src={response[1].png} alt={response[1].Type} style={{width:"400px", backgroundColor:"white"}}/>);
            setDisplayableProps(response[0])
        },800)
            if (response[1].type == "ARMOR") {
                appUser.armors.push(response[0])
            } else {
                appUser.weapons.push(response[0])
            }
        }
        localStorage.setItem('appUser', JSON.stringify(appUser));
        setTimeout(() => {
            setImg(<img src={chest.png} alt={chest.Type} style={{width:"400px"}}/>);
            setDisplayableProps(chest)
        },1200)

    }

    return (
        <>
            <div onClick={openModal} style={{display:'inline-flex'}}>
                <img src={chest.png} alt={chest.Type} style={{width:"350px"}}/>
            </div>
            <div id={id} className={className}>
                <div className="modal-content" style={{display:"inline-flex"}}>
                    <span className="inLine">
                        {img}
                    </span>
                    <span style={{alignSelf:"center"}}>
                        <ul className='inLine' style={{textAlign:"left"}}>
                            {stats.map(stat => {
                                return <li>{stat}</li>
                            })}
                        </ul>
                    </span>
                    <span style={{alignSelf:"flex-end"}}>
                        <button className='blockBox btn-10 transparent' onClick={createItem}><span>BUY</span></button>
                    </span>
                    <span onClick={closeModal} className="close">&times;</span>
                </div>
            </div>
        </>
    )
}

export default Chest