import React, {useState} from "react";
import {useNavigate} from "react-router-dom";
import jwt from "jwt-decode";

function LogInButton({style, setAppUser}) {

    const navigate = useNavigate();

    const [state, setState] = useState('choose')

    let userDetails = {
        name:"",
        password:"",
    };


    async function signUp() {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(userDetails)
        }
        const response = await (await fetch(`/api/app-user/auth/register`, requestOptions)).json();
        await logIn(response.token)
    }

    async function signIn() {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(userDetails)
        }
        const response = await (await fetch(`/api/app-user/auth/authenticate`, requestOptions)).json();
        await logIn(response.token);
    }

    async function logIn(jwtToken) {
        console.log(jwtToken)
        const decodedToken = jwt(jwtToken)
        const requestOptions = {
            method: 'GET',
        }
        const response = await (await fetch(`/api/user/get-${decodedToken.sub}`, requestOptions)).json();
        setAppUser(response)
        navigate('/main')
    }


    if (state === 'choose') {
        return (
            <div style={{display:'inline-flex'}}>
                <button className={style} onClick={()=>{setState('signUp')}}><span>Sign up</span></button>
                <button className={style} onClick={()=>{setState("signIn")}}><span>Sign in</span></button>
            </div>
        )
    } else if (state === 'signUp') {
        return (
            <div>
                <input placeholder='Your name' onChange={(event)=> userDetails.name = event.currentTarget.value}/>
                <input type="password" placeholder='Password' onChange={(event)=> userDetails.password = event.currentTarget.value}/>
                <button className={style} onClick={async()=>{await signUp()}}><span>Sign up</span></button>
            </div>
        )
    } else {
        return (
            <div>
                <input placeholder='Your name' onChange={(event)=> userDetails.name = event.currentTarget.value}/>
                <input type="password" placeholder='Password' onChange={(event)=> userDetails.password = event.currentTarget.value}/>
                <button className={style} onClick={async()=>{await signIn()}}><span>Sign in</span></button>
            </div>
        )
    }
}

export default LogInButton;