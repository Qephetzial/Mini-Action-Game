import React from 'react';
import ReactDOM from 'react-dom/client';
import {createBrowserRouter, createRoutesFromElements, Route, RouterProvider} from "react-router-dom";
import './style/index.css';
import Main from './main/Main';
import Inventory from './inventory/Inventory'
import LuckyShop from "./luckyShop/LuckyShop";
import Start from "./Start/Start";


const router = createBrowserRouter(
    createRoutesFromElements(
        <Route path="/" element={<Start />}>
            <Route path="main" element={<Main />} />
            <Route path="inventory" element={<Inventory />} />
            <Route path="lucky-shop" element={<LuckyShop />} />
        </Route>
    )
);

ReactDOM.createRoot(document.getElementById("root")).render(
    <React.StrictMode>
        <RouterProvider router={router} />
    </React.StrictMode>
);
