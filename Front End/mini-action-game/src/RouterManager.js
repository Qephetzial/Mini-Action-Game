import {BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./start/Layout";
import Login from "./login/Login";
import Main from "./main/Main";
import Inventory from "./inventory/Inventory";
import LuckyShop from "./luckyShop/LuckyShop";
import React, {useState} from "react";
import StartButton from "./start/components/StartButton";


function RouterManager() {
    const [appUser, setAppUser] = useState();
    const [activeButton, setActiveButton] = useState("easy");
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={
                    <Layout
                        appUser={appUser}
                    />}>
                    <Route path="/" element={<StartButton/>}/>
                    <Route path="login" element={
                        <Login
                            setAppUser={setAppUser}
                        />
                    }/>
                    <Route path="main" element={
                        <Main
                            appUser={appUser}
                            setAppUser={setAppUser}
                            activeButton={activeButton}
                            setActiveButton={setActiveButton}
                        />
                    }/>
                    <Route path="inventory" element={
                        <Inventory
                            appUser={appUser}
                            setAppUser={setAppUser}
                        />
                    }/>
                    <Route path="lucky-shop" element={
                        <LuckyShop
                            appUser={appUser}
                            setAppUser={setAppUser}
                        />}/>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}

export default RouterManager;