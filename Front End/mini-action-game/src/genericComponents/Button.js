import React from "react";
import {useNavigate} from "react-router-dom";


function Button({text, href, classes, appUser, setAppUser}) {

    const navigate = useNavigate();

    async function update() {
        const requestOptions = {
            method: 'GET',
        }
        const response = await (await fetch(`/api/user/${appUser.id}`, requestOptions)).json();
        setAppUser(response);
    }

    return (
        <button className={classes} onClick={()=>{if(text==="INVENTORY") {update().then()} navigate(href)}}><span>{text}</span></button>
    );
}

export default Button