import {BrowserRouter, Route, Routes} from "react-router-dom";
import Start from "./start/Start";
import Login from "./login/Login";
import Main from "./main/Main";
import Inventory from "./inventory/Inventory";
import LuckyShop from "./luckyShop/LuckyShop";
import React, {useState} from "react";


function RouterManager() {
    const [appUser, setAppUser] = useState();
    console.log(appUser+"...")
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Start/>}>
                    <Route path="login" element={
                        <Login
                            setAppUser={setAppUser}
                        />
                    }/>
                    <Route path="main" element={
                        <Main
                            appUser={appUser}
                            setAppUser={setAppUser}
                        />
                    }/>
                    <Route path="inventory" element={
                        <Inventory
                            appUser={appUser}
                            setAppUser={setAppUser}
                        />
                    }/>
                    <Route path="lucky-shop" element={<LuckyShop/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}

export default RouterManager;