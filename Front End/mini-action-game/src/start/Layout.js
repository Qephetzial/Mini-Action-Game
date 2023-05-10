import React from "react";
import {Outlet} from "react-router-dom";
import StartButton from "./components/StartButton";

function Layout() {

    return (
        <>
            <Outlet/>
        </>
    )
}

export default Layout