//Defino mi objeto de prueba
const person = {
    name: 'Tony',
    age: 45,
    codeName: 'IronMan',
    power: 'Money'
}
// Creo una funcion y lo hago es desectructurar el argumento que me pasan en este caso la persona y me quedo con los elementos que necesito del mismo.
// Despues devuelvo los elementos destructurados y le defini un elemento mas.     
const  createHeroe = ({name,age,codeName,power }) => ({ id: 135, name, age,codeName,power })

// Muestro la funcion    
console.log(createHeroe(person))
