import React from "react";
import {useNavigate} from "react-router-dom";


function Button({text, href, classes}) {

    const navigate = useNavigate();

    return (
        <button className={classes} onClick={()=>{navigate(href)}}><span>{text}</span></button>
    );
}

export default Button