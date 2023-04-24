import React, {useEffect, useState} from "react";
import LogInButton from "./components/LogInButton";

function Login() {
    useEffect(()=>{
        let startButton = document.getElementById('startBtn')
        if (startButton !== null) {
            startButton.style.display = 'None'
        }
    })

    const [logInButtonStyle, setlogInButtonStyle] = useState('btn-10 play')

    return (
        <div style={{textAlign:"center"}}>
            <div className="loginButtons">
                <LogInButton
                style={logInButtonStyle}
                />
            </div>
        </div>
    )
}

export default Login