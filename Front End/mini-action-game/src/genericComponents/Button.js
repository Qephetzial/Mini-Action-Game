import React from "react";
import {useNavigate} from "react-router-dom";


function Button({text, href, classes, appUser, setAppUser}) {

    const navigate = useNavigate();

    async function update() {
        const requestOptions = {
            method: 'GET',
        }
        const response = await (await fetch(`/api/user/get-${appUser.name}`, requestOptions)).json();
        setAppUser(response);
    }

    async function logOut() {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(appUser)
        }
        await fetch(`/api/user`,requestOptions)
    }

    return (
        <button className={classes} onClick={()=>{if(text==="INVENTORY") {update().then()} else if(text==="Log Out") {logOut().then()} navigate(href)}}><span>{text}</span></button>
    );
}

export default Button