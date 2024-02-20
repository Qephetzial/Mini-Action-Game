import React from "react";
import {useNavigate} from "react-router-dom";


function Button({text, href, classes, appUser, setAppUser, setHeaderCss, setLayerOne, setLayerTwo, setPlayerCoords}) {

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
        setHeaderCss("hide")
    }

    async function startGame() {
        const requestOptions = {
            method: 'GET'
        }
        const response = await (await fetch(`/api/map`, requestOptions)).json();
        let layerOne = [];
        let layerTwo = []
        for (const row of response.map) {
            let layerOneRow = [];
            let layerTwoRow = [];
            for (const rowElement of row) {
                switch (rowElement) {
                    case "G":
                        layerOneRow.push("supplementary/tiles/grass_center_NK.png");
                        layerTwoRow.push("supplementary/tiles/nothing_center_NK.png")
                        break;
                    case "W":
                        layerOneRow.push("supplementary/tiles/water_center_NK.png");
                        layerTwoRow.push("supplementary/tiles/nothing_center_NK.png")
                        break;
                    case "R":
                        layerOneRow.push("supplementary/tiles/grass_center_NK.png");
                        layerTwoRow.push("supplementary/tiles/rocks_dirt_NK.png")
                        break;
                }
            }
            layerOne.push(layerOneRow)
            layerTwo.push(layerTwoRow)
        }
        let playerCoords = []
        const y = layerTwo.length-3
        const x = Math.floor(layerTwo[0].length/2)
        playerCoords.push(y)
        playerCoords.push(x)
        setPlayerCoords(playerCoords)
        layerTwo[y][x] = "supplementary/p1_front.png";
        setLayerOne(layerOne)
        setLayerTwo(layerTwo)
        setHeaderCss("hide")
    }

    return (
        <button className={classes} onClick={()=>{if(text==="INVENTORY") {update().then()} else if(text==="Log Out") {logOut().then()} else if(text==="PLAY") {startGame().then()} navigate(href)}}><span>{text}</span></button>
    );
}

export default Button