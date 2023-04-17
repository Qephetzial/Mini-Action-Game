import React from "react";


function Button({text, href, classes}) {
    return (
        <a className={classes} href={href}><span>{text}</span></a>
    );
}

export default Button