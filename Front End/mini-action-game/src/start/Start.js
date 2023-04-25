import React from "react";
import {Outlet} from "react-router-dom";
import StartButton from "./components/StartButton";

function Start() {

    return (
        <>
            <StartButton
            />
            <Outlet/>
        </>
    )
}

export default Start