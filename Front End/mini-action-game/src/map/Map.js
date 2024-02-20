import React from "react";

function Map({layerOne, layerTwo, setLayerTwo, playerCoords, setPlayerCoords}) {
    
    function move(e) {
        if (e.key === "ArrowUp") {
            console.log("...")
        }
    }

    return (
        <>{layerOne ?
            <div className="layerOne">
            {layerOne.map(row => {
                return <div className='map' >{row.map(tile => {
                    return <span style={{margin:"-1px"}}><img style={{maxWidth:"89px", maxHeight:"86px"}} src={tile} alt={tile}/></span>
                })}</div>
            })}
            </div>: "Broken"
        }
            {layerTwo ?
                <div className="layerTwo">
                    {layerTwo.map(row => {
                        return <div className='map' >{row.map(tile => {
                            return <span style={{margin: "-1px"}}><img style={{maxWidth: "89px", maxHeight:"86px"}} src={tile} alt={tile}/></span>
                        })}</div>
                    })}
                </div>: "Loading..."
            }
        </>
    );
}

export default Map;