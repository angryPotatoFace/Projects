import {getHeroeByID} from './bases/08-2- imports'

const  getHeroeByIDAsyn = (id) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const hero = getHeroeByID(id)
            if(hero){
                resolve(hero)
            }else{
                reject('Hero no existe')
            }
        },1000)
    }) 
}

getHeroeByIDAsyn(30)
    .then( h => console.log(`El hero es ${h.name}`))
    .catch(console.log)   