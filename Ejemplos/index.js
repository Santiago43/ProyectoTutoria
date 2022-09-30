var numero =5;

if (numero===3){

    console.log("Los números son iguales: ",numero)
}else if(numero>4){
    console.log("Hello world!")
}

var numero =3;
var array = []
array.push(3)

var persona = {
    nombre: "Jaime",
    apellido: "Contreras",
    edad: 40
}


for (let index = 0; index < array.length; index++) {
    const element = array[index];
    
}

var miOtraFuncion= ()=>{
    console.log("Mi otra función")
}
function imprimirMensaje(nombre, apellido, funcion){
    console.log(nombre,apellido)
    funcion()
    return 3;
}

// Jquery
// #
// . 
// 
// Asynchronous javascript and xml
// Hyper Text Transfer Protocol
// CRUD -> Crear (Create), Consultar(Read), actualizar(Update) y eliminar(Delete)
// POST , GET ,PUT, DELETE 


function consultarIP(){
    $.ajax(
        {
        url: "http://ip.jsontest.com/ ",
        type: 'GET',
        dataType: 'json',
        success: function(e){
            console.log(e)
        }
    }
    );
}

$("#MiParrafo").click(function(){
    alert("Diste click");
})


//fetch("http://headers.jsontest.com/").then((r)=> console.log(r))


/*
$.ajax({
            url: url+"/api/Client/save",
            type: 'POST',
            dataType: 'json',
            headers: {
                "Content-Type": "application/json"
            },
            data: JSON.stringify(client),
            statusCode:{
                201:function(){
                    alert('Se ha registrado el cliente');
                    consultarcliente()
                    limpiarCamposCliente()
                },
                555:function(){
                    alert('Ya existe un cliente con ese id')
                }
            }
        });
*/

$.ajax(
        {
        url: "http://ip.jsontest.com/ ",
        type: 'GET',
        dataType: 'json',
        success: function(e){
            console.log(e)
        }
    }
    );