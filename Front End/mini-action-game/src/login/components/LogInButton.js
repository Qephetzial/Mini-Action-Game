import React, {useState} from "react";
import {useNavigate} from "react-router-dom";

function LogInButton({style, setAppUser}) {

    const navigate = useNavigate();

    const [users, setUsers] = useState([])

    const [state, setState] = useState('choose')

    let newUser = {
        name:'',
        gold:0,
        heroes:null
    };

    async function getUsers() {
        const requestOptions = {
            method: 'GET'
        }
        const response = await (await fetch(`/api/user/get-users`, requestOptions)).json();
        setUsers(response)
        setState('logIn')
        setAppUser(response[0])
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

    const handleChange = event => {
        const user = {selectValue: event.currentTarget.value};
        for (let i = 0; i < users.length; i++) {
            if (users[i].name === user.selectValue){
                setAppUser(users[i])
            }
        }
    }


    if (state === 'choose') {
        return (
            <div style={{display:'inline-flex'}}>
                <button className={style} onClick={()=>{setState('signUp')}}><span>Sign up</span></button>
                <button className={style} onClick={async()=>{await getUsers()}}><span>Sign in</span></button>
            </div>
        )
    } else if (state === 'signUp') {
        return (
            <div>
                <input placeholder='Your name' onChange={(event)=> newUser.name = event.currentTarget.value}/>
                <button className={style} onClick={async()=>{await saveUser()}}><span>Sign up</span></button>
            </div>
        )
    } else {
        return (
            <div>
                <select onChange={handleChange}>
                    {users.map(user => {
                        return <option key={user.id}>{user.name}</option>
                    })}
                </select>
                <button className={style} onClick={()=>navigate('/main')}><span>Sign in</span></button>
            </div>
        )
    }
}

export default LogInButton;