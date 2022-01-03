//Defino un Array de numero
const arreglo = [1,2,3,4]
// Para agregar un nuevo item y enviarlo a la ultima posicion puedo usar push que es un metodo de la clase array
arreglo.push(5)

//Y al igual que los objetos para tener una nueva instancia tengo que usar el spread
const arreglo2 = [...arreglo ] 
arreglo2.push(6)

const arreglo3 = arreglo2.map(function(n){
    return n*2;
})

console.log(arreglo)
console.log(arreglo2)
console.log(arreglo3)



