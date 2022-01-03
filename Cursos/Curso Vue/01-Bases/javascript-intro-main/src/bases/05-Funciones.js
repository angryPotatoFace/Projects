// Creo un array con dos objetos

const heroes = [{
    id: 1,
    name: 'batman'   
},{
    id: 2,
    name: 'superman'
}]

// Creo una funcion de flecha y digo que si encuentra un elemento con esa condicion devuelva true
const hayHeroe = (element) => element.id === 1;

//Muestro en pantalla y uso el metodo de los arrays some que evalua todos los elementos y si alguno se cumple devuelve true
console.log(heroes.some(hayHeroe))

