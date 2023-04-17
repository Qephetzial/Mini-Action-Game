import React from "react";
import '../style/Buttons.css'
import '../style/Main.css'
import {Outlet} from "react-router-dom";
import SB from "./SB";

function Start() {
    return (
        <>
            <SB
            />
            <Outlet/>
        </>
    )
}

export default Start