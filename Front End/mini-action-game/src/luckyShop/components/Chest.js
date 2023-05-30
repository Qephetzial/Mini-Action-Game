import React, {useState} from "react";

function Chest({index, chest, appUser}) {

    const [img, setImg] = useState(<img src={chest.png} alt={chest.Type} style={{width:"400px"}}/>)

    const id = "myModal"+index


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


    for (const property in chest) {
        if (chest[property] !== null && property !== 'png') {
            stats.push(`${property}: ${chest[property]}`)
        }
    }


    const createItem = async() => {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        let route = null
        switch (index) {
            case '0':
                route = "iron";
                break;
            case '1':
                route = "bronze";
                break;
            case '2':
                route = "silver";
                break;
            case '3':
                route = "golden";
                break;
        }
        const response = await(await fetch(`/api/chest/${route}`, requestOptions)).json();
        setImg(<img src={response[0].png} alt={response[0].Type} style={{width:"400px", backgroundColor:"white"}}/>)
        if (response[0].type == "ARMOR") {
            appUser.armors.push(response[0])
        } else {
            appUser.weapons.push(response[0])
        }
        if (response.size === 2) {setTimeout(() => {setImg(<img src={response[1].png} alt={response[1].Type}
                                                                style={{width:"400px", backgroundColor:"white"}}/>)},5000)
            if (response[1].type == "ARMOR") {
                appUser.armors.push(response[0])
            } else {
                appUser.weapons.push(response[0])
            }
        }
        setTimeout(() => {setImg(<img src={chest.png} alt={chest.Type} style={{width:"400px"}}/>)},5000)

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