const UserComponent=(props)=>{
    //preparing table of users
    const users=props.users.map((user, key)=>{
        return <tr><td>{user.name}</td><td>{user.email}</td><td>{user.phone}</td></tr> 
    })
    return(<div>
        <h2>Users</h2>
        <table  style={{marginLeft:"45%"}}>{users}</table>
    </div>)
}

export default UserComponent;