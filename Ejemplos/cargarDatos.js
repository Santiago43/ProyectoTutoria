var clientes = [
    {
        id: 1,
        name: "Jaimito",
        age: 20
    },
    {
        id: 2,
        name: "Lucrecia",
        age: 19
    }
]

$(document).ready(function(){
    //Aquí va el llamado Ajax
    for (let i = 0; i < clientes.length; i++) {
        const cliente = clientes[i];
        
        $("#table-body").append(`
        <tr>
            <td>${cliente.name}</td>
            <td>${cliente.age}</td>
            <td> <a href="editar.html?id=${cliente.id}">Editar</a> </td>
        </tr>`)
    }
})