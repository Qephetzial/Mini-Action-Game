import React from "react";
import {Outlet} from "react-router-dom";
import Header from "../header/Header";

function Layout({appUser}) {

    return (
        <>
            <Header
                appUser={appUser}
            />
            <Outlet/>
        </>
    )
}

export default Layout