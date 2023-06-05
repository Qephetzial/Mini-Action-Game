import React from "react";
import Button from "../genericComponents/Button";

function Header({appUser}) {
    return(
        <Button
            text={"Log Out"}
            href={"/login"}
            appUser={appUser}
            classes={'refBtn btn-10 select lineBoxing transparent'}
        />
    )
}

export default Header;