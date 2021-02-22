import settings from "./../settings.json";

export function getUsers(){
    return fetch(settings.url + "users")
    .then(response=>response.json())
    .then(data=>{return data});
}

export async function create(user){
    const response = await fetch(settings.url + "user", {
        method: 'POST', // *GET, POST, PUT, DELETE, etc.
        headers: {
          'Content-Type': 'application/json'  
        },
        body: JSON.stringify(user) // body data type must match "Content-Type" header
      });
      return response.json(); // parses JSON response into native JavaScript objects
}