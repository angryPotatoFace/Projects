


describe('Example Component', () => {

  test( 'Debe ser mayor a 10', () => {

    //Arreglar
    let value = 5; 

    //Estimulo
    value += 2

    //Observar Resultado

    if(value>10){
      "Todo bien"
    }else{
      throw `${ value}  no es mayor a 10`
    }  
    
  })



})