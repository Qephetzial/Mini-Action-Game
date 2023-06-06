import React from "react";
import {useNavigate} from "react-router-dom";
import ReactCurvedText from 'react-curved-text';


function StartButton() {
    const navigate = useNavigate();

    return (
        <>
            <ReactCurvedText
                width={2000}
                height={300}
                cx={950}
                cy={200}
                rx={700}
                ry={100}
                startOffset={70}
                reversed={true}
                text="MY-MINI-ACTION-GAME"
                textProps={{ style: {fontFamily:'Bungee Inline', fontSize: 100 } }}
                textPathProps={null}
                tspanProps={null}
                ellipseProps={null}
                svgProps={null}
            />
            <button className="btn-10 transparent play" onClick={()=>{navigate("/login")}}><span>START</span></button>
        </>
    )
}

export default StartButton