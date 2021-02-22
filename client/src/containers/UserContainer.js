import {useState, useEffect} from "react";
import UserComponent from "../components/UserComponent";
import {getUsers, create} from './../controllers/UserController';

const UserContainer=()=>{
    const [users, setUsers]= useState([]);
    const [user, setUser]= useState({});

    //Getting the users from database
    useEffect(()=>{
        getUsers()
        .then(users=>{setUsers(users)})
        .catch((error) => {
            alert('Error: Palvelin ei vastaa, tarkista VPN', error);
        });
    },[]);

    const handleChange = (e) => {
        let aNew = {...user};   //avoid mutation
        aNew[e.target.name]=e.target.value; //getting the value from User interface (component)
        setUser(aNew); //storing to the memory of container
    };


    const handleSubmit=()=>{
        const result =create(user);
        if(result.id>0){
            alert("Saved  " +JSON.stringify(user));
        }
    }

    //calling component to render the users
    return(
        <div>
            <UserComponent user={user} users={users} handleChange={handleChange} handleSubmit={handleSubmit} />
        </div>
    );
}

export default UserContainer;