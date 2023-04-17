import React, {useState} from "react";

function ItemPlaceHolder({item}) {


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
        image = <img style={{width: 100, height: 100}} src={item.link} alt="item"/>
    }


    let mImage = null


    if (item !== null) {
        mImage = <img style={{width: 400, height: 400, backgroundColor:"white"}} src={item.link} alt="item"/>
    }


    let stats = []


    for (const property in item) {
        if (item[property] !== null && property !== 'link') {
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
                                return <li>{stat}</li>
                            })}
                        </ul>
                    </span>
                </div>
            </div>
        </>
    )
}

export default ItemPlaceHolder
