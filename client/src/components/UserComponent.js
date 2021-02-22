const UserComponent=(props)=>{
    //preparing table of users
    const users=props.users.map((user, key)=>{
        return <tr key={key}><td>{user.name}</td><td>{user.email}</td><td>{user.phone}</td></tr> 
    })

    
    return(
    <div>
        <h2>Users</h2>
        <table  style={{marginLeft:"15%"}}><tbody>{users}</tbody></table>
        <hr/>
        Name<input type="text" name="name" onChange={e=>props.handleChange(e)} value={props.user.name}></input><br/>
        Email<input type="text" name="email" onChange={e=>props.handleChange(e)} value={props.user.email}></input><br/>
        Phone<input type="text" name="phone" onChange={e=>props.handleChange(e)} value={props.user.phone}></input><br/>
        <button  onClick={props.handleSubmit}>Save</button>
    </div>);
}

export default UserComponent;