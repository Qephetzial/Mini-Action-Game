import React, {useEffect, useState} from "react";
import LogInButton from "./components/LogInButton";

function Login({setAppUser}) {
    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })

    const [logInButtonStyle] = useState('btn-10 play select lineBoxing transparent')

    return (
        <div style={{textAlign:"center"}}>
            <div className="loginButtons">
                <LogInButton
                style={logInButtonStyle}
                setAppUser={setAppUser}
                />
            </div>
        </div>
    )
}

export default Login