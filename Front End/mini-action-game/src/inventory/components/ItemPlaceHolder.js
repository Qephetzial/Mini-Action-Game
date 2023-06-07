import React, {useState} from "react";

function ItemPlaceHolder({item, appUser, setAppUser}) {


    const[className, setClassName] = useState("modalClose")


    const openModal = ()=> {
        if (item !== null) {
            setClassName("modalOpen")
        }
    }


    const closeModal = ()=>{
        setClassName("modalClose")}


    let image = null


    if (item !== null) {
        image = <img style={{width: 100, height: 100}} src={item.png} alt="item"/>
    }


    let mImage = null


    if (item !== null) {
        mImage = <img style={{width: 400, height: 400, backgroundColor:"white"}} src={item.png} alt="item"/>
    }

    const equipItem = async() => {
        let heroesArmor = null;
        let heroesWeapon = null;
        let newAppUser = appUser;
        if (item.itemType === "ARMOR") {
            for (const hero of newAppUser.heroes) {
                if (hero.selected) {
                    heroesArmor = hero.armor;
                    hero.armor = item;
                    newAppUser.armors.push(heroesArmor);
                }
            }
            for (let i = 0; i < newAppUser.armors.length; i++) {
                if (newAppUser.armors[i].id === item.id) {
                    newAppUser.armors.splice(i, 1);
                }
            }
        } else {
            for (const hero of newAppUser.heroes) {
                if (hero.selected) {
                    heroesWeapon = hero.weapon;
                    hero.weapon = item;
                    newAppUser.weapons.push(heroesWeapon);
                }
            }
            for (let i = 0; i < newAppUser.weapons.length; i++) {
                if (newAppUser.weapons[i].id === item.id) {
                    newAppUser.weapons.splice(i, 1);
                }
            }
        }
        setAppUser(newAppUser)
        const requestOptions = {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        await fetch(`/api/user`, requestOptions);
        localStorage.setItem('appUser', JSON.stringify(appUser));

    }


    let stats = []

    let i = -1;

    for (const property in item) {
        if (item[property] !== null && property !== 'png' && property !== 'id') {
            stats.push(`${property}: ${item[property]}`)
        }
    }


    return (
        <>
            <div onClick={openModal} className="placeHolder">
                <span>
                    {image}
                </span>
            </div>
            <div className={className} onClick={event => {
                if (event.target === event.currentTarget)
                    closeModal()}}>
                <div className="modal-content" style={{display:"inline-flex"}}>
                    <span onClick={closeModal} className="close">&times;</span>
                    <span className="inLine">
                        {mImage}
                    </span>
                    <span style={{alignSelf:"center"}}>
                        <ul className='inLine' style={{textAlign:"left"}}>
                            {stats.map(stat => {
                                i++
                                return <li key={i}>{stat}</li>
                            })}
                        </ul>
                    </span>
                    <span style={{alignSelf:"flex-end"}}>
                        <button className='blockBox btn-10 transparent' onClick={equipItem}><span>EQUIP</span></button>
                        <button className='blockBox btn-10 transparent' ><span>SELL</span></button>
                    </span>
                </div>
            </div>
        </>
    )
}

export default ItemPlaceHolder
