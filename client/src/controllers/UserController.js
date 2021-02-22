import settings from "./../settings.json";

export function getUsers(){
    return fetch(settings.url + "users")
    .then(response=>response.json())
    .then(data=>{return data});
}