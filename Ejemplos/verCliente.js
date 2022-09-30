let queryStrings = new URLSearchParams(window.location.search)
let parametrosGet = Object.fromEntries(queryStrings.entries())

$(document).ready(function(){
    //GET ajax cliente/:id
    console.log("Se ve el cliente con el id ", parseInt(parametrosGet.id))
})