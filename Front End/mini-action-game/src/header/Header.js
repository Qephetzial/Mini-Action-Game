import React from "react";
import Button from "../genericComponents/Button";

function Header({appUser}) {
    return(
        <div>
            <p style={{display:"inline"}} className="appName" >MY-MINI-ACTION-GAME</p>
            <Button
                text={"Log Out"}
                href={"/login"}
                appUser={appUser}
                classes={'refBtn btn-10 select lineBoxing transparent logOut'}
            />
        </div>
    )
}

export default Header;