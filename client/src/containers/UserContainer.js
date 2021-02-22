import {useState, useEffect} from "react";
import UserComponent from "../components/UserComponent";
import {getUsers} from './../controllers/UserController';

const UserContainer=()=>{
    const [users, setUsers]= useState([]);

    //Getting the users from database
    useEffect(()=>{
        getUsers()
        .then(users=>{setUsers(users)})
        .catch((error) => {
            alert('Error:', error);
        });
    },[])

    //calling component to render the users
    return(
        <div>
            <UserComponent users={users}/>
        </div>
    );
}

export default UserContainer;