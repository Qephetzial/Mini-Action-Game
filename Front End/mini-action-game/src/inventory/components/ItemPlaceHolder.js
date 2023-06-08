import React, {useState} from "react";

function ItemPlaceHolder({item, appUser, setAppUser, setEquippedWeapon, setEquippedArmor, items, setItems}) {


    const[className, setClassName] = useState("modalClose")

    let buttonClass = "blockBox btn-10 transparent";

    if (appUser === null) {
        buttonClass = "hide";
    }

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

    async function equipItem() {
        let heroesArmor = null;
        let heroesWeapon = null;
        let newAppUser = appUser;
        if (item.itemType === "ARMOR") {
            for (const hero of newAppUser.heroes) {
                if (hero.selected) {
                    heroesArmor = hero.armor;
                    hero.armor = item;
                    newAppUser.armors.push(heroesArmor);
                    setEquippedArmor(item)
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
                    setEquippedWeapon(item)
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
        closeModal();
    }

    async function sellItem() {
        switch (item.rarity) {
            case "COMMON":
                appUser.coin += 15;
                break;
            case "UNCOMMON":
                appUser.coin += 45;
                break;
            case "RARE":
                appUser.coin += 150;
                break;
            case "EPIC":
                appUser.coin += 450;
                break;
            case "LEGENDARY":
                appUser.coin += 900;
                break;
        }
        if (item.itemType === "ARMOR") {
            for (let i = 0; i < appUser.armors.length; i++) {
                if (appUser.armors[i].id === item.id) {
                    appUser.armors.splice(i, 1);
                }
            }
        } else {
            for (let i = 0; i < appUser.weapons.length; i++) {
                if (appUser.weapons[i].id === item.id) {
                    appUser.weapons.splice(i, 1);
                }
            }
        }
        const requestOptions = {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        await fetch(`/api/user/${item.id}`, requestOptions);
        localStorage.setItem('appUser', JSON.stringify(appUser));
        let newItems = [...items]
        for (let i = 0; i < newItems.length; i++) {
            if (newItems[i].id === item.id) {
                newItems.splice(i, 1);
            }
        }
        setItems(newItems);
        closeModal()
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
                        <button className={buttonClass} onClick={equipItem}><span>EQUIP</span></button>
                        <button className={buttonClass} onClick={sellItem} ><span>SELL</span></button>
                    </span>
                </div>
            </div>
        </>
    )
}

export default ItemPlaceHolder
