import React from "react";
import {Outlet} from "react-router-dom";
import Header from "../header/Header";

function Layout({appUser, headerCss, setHeaderCss}) {

    return (
        <>
            <Header
                appUser={appUser}
                headerCss={headerCss}
                setHeaderCss={setHeaderCss}
            />
            <Outlet/>
        </>
    )
}

export default Layout