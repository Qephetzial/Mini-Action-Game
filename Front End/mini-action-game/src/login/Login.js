import React, {useState} from "react";
import LogInButton from "./components/LogInButton";
import ReactCurvedText from "react-curved-text";

function Login({setAppUser}) {

    const [logInButtonStyle] = useState('btn-10 play select lineBoxing transparent')

    return (
        <>
            <ReactCurvedText
                width={1700}
                height={300}
                cx={950}
                cy={300}
                rx={700}
                ry={150}
                startOffset={70}
                reversed={true}
                text="MY-MINI-ACTION-GAME"
                textProps={{ style: {fontFamily:'Bungee Inline', fontSize: 100 } }}
                textPathProps={null}
                tspanProps={null}
                ellipseProps={null}
                svgProps={null}
            />
            <div style={{textAlign:"center"}}>
                <div className="loginButtons">
                    <LogInButton
                    style={logInButtonStyle}
                    setAppUser={setAppUser}
                    />
                </div>
            </div>
        </>
    )
}

export default Login