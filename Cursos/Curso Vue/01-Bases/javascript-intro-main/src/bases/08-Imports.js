//import {owners} from '../src/data/heroes'
import superHeroes from './data/heroes'

const [ heroe ] = superHeroes
const {id,name,owner} = heroe

const valores =  heroe => ({id,name,owner})

console.log(valores(superHeroes))