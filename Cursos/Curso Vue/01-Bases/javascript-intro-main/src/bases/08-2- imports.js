import superHeroes from '../data/heroes'

export const getHeroeByID     = (id) => superHeroes.find  ( heroe => heroe.id == id )
export const getHeroesByOwner = (owner) => superHeroes.filter( heroe => heroe.owner == owner )


/* Instrucciones si lo llamaramos desde el index
import {getHeroeByID,getHeroesByOwner} from './bases/08-2- imports' 

console.log( getHeroeByID('4') )
console.log( getHeroesByOwner('DC'))*/