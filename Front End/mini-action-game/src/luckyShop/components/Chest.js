import React, {useState} from "react";

function Chest({index, chest, appUser}) {


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
        if (chest[property] !== null && property !== 'link') {
            stats.push(`${property}: ${chest[property]}`)
        }
    }


    const createItem = async() => {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        switch (index) {
            case '0':
                await fetch(`/api/chest/iron`, requestOptions);
                break;
            case '1':
                await fetch(`/api/chest/bronze`, requestOptions);
                break;
            case '2':
                await fetch(`/api/chest/silver`, requestOptions);
                break;
            case '3':
                await fetch(`/api/chest/golden`, requestOptions);
                break;
        }

    }

    return (
        <>
            <div onClick={openModal} style={{display:'inline-flex'}}>
                <img src={chest.link} alt={chest.Type} style={{width:"350px"}}/>
            </div>
            <div id={id} className={className}>
                <div className="modal-content" style={{display:"inline-flex"}}>
                    <span onClick={closeModal} className="close">&times;</span>
                    <span className="inLine">
                        <img src={chest.link} alt={chest.Type} style={{width:"400px"}}/>
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
                </div>
            </div>
        </>
    )
}

export default Chest