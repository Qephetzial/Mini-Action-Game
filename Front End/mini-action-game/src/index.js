import React from 'react';
import ReactDOM from 'react-dom/client';
import './style/index.css';
import './style/Buttons.css'
import './style/Main.css';
import RouterManager from "./RouterManager";


ReactDOM.createRoot(document.getElementById("root")).render(
    <React.StrictMode>
            <RouterManager/>
    </React.StrictMode>
);
