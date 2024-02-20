import {BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./start/Layout";
import Login from "./login/Login";
import Main from "./main/Main";
import Inventory from "./inventory/Inventory";
import LuckyShop from "./luckyShop/LuckyShop";
import Map from "./map/Map";
import React, {useState} from "react";
import StartButton from "./start/components/StartButton";


function RouterManager() {
    const storedAppUser = localStorage.getItem('appUser');
    const [appUser, setAppUser] = useState(JSON.parse(storedAppUser));
    const [headerCss, setHeaderCss] = useState("hide")
    const [layerOne, setLayerOne] = useState();
    const [layerTwo, setLayerTwo] = useState();
    const [playerCoords, setPlayerCoords] = useState()

    const [activeButton, setActiveButton] = useState("easy");
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={
                    <Layout
                        appUser={appUser}
                        headerCss={headerCss}
                        setHeaderCss={setHeaderCss}
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
                            setHeaderCss={setHeaderCss}
                            setLayerOne={setLayerOne}
                            setLayerTwo={setLayerTwo}
                            setPlayerCoords={setPlayerCoords}
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
                    <Route path="map" element={
                        <Map
                            layerOne={layerOne}
                            layerTwo={layerTwo}
                            setLayerTwo={setLayerTwo}
                            playerCoords={playerCoords}
                            setPlayerCoords={setPlayerCoords}
                        />}></Route>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}

export default RouterManager;