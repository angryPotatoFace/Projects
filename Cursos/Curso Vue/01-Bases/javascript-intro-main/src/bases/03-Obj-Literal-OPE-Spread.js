//Defino un objeto con su atributos 
const persona = {
    nombre: 'Pancracio',
    apellido: 'Portes',
    edad: 35,
    //Defino un objeto dentro de otro con sus atributos
    direccion: {
        ciudad: 'Buenos Aires',
        partido: 'San isidro' ,
        localidad: 'Villa adelina',
    }
}

//Si quiero definar un objeto nuevo con la misma caracteriticas de otro
 
//Si le asigno la persona ya creada. Se creara un referencia a ese objeto y si modifico uno modifico el otro 
//const persona2  = persona

//Para crear una nueva instancia de ese objeto tengo que usar el operador Spread
const persona2  = {...persona }
persona2.nombre= 'Julian'

console.log(persona)
console.log(persona2)






