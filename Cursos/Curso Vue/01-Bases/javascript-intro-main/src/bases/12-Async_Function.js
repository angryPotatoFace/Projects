
const miPromesa = () =>{
    return new Promise( resolve => {
        setTimeout(() => {
            resolve('Tenemos un valor en la promesa')
        },1000)
    })
}


const medirTiempoAsync = async() => {

    
    console.log("Inicio")
    const respuesta = await miPromesa()

    console.log('Fin')

    return 'Fin de medir tiempo Async'

}

medirTiempoAsync()
.then(valor => console.log())
//.catch(err => console.log())
