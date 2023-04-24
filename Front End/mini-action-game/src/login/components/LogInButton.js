import React, {useState} from "react";
import {useNavigate} from "react-router-dom";

function LogInButton({style}) {

    const navigate = useNavigate();

    const [users, setUsers] = useState([])

    const [state, setState] = useState('choose')

    let newUser = {
        name:''
    };

    async function getUsers() {
        const requestOptions = {
            method: 'GET'
        }
        const response = await fetch(`/api/user/get-users`, requestOptions);
        setUsers(await response.json())
        setState('logIn')
    }

    async function saveUser() {
        const requestOptions = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(newUser)
        }
        await fetch(`/api/user/save`, requestOptions);
        navigate('/main')
    }

    function logIn(){
        navigate('/main')
    }



    if (state === 'choose') {
        return (
            <div style={{display:'inline-flex'}}>
                <button className={style} onClick={()=>{setState('signUp')}}>Sign up</button>
                <button className={style} onClick={async()=>{await getUsers()}}><span>Log in</span></button>
            </div>
        )
    } else if (state === 'signUp') {
        return (
            <div>
                <input placeholder='Your name' onChange={(event)=> newUser.name = event.currentTarget.value}/>
                <button className={style} onClick={async()=>{await saveUser()}}>Sign up</button>
            </div>
        )
    } else {
        return (
            <div>
                <select>
                    {users.map(user => {
                        return <option key={user.id}>{user.name}</option>
                    })}
                </select>
                <button className={style} onClick={()=>logIn()}>Log in</button>
            </div>
        )
    }
}

export default LogInButton