const characters = ['Goku','Vegeta','Trunks']

const [goku,vegeta,trunks,goten = 'Valor no definido'] = characters

console.log(goten)

const returArray = ([letra, numeros ]) =>[{ letra, numeros} ]

const [letra,numero] = returArray(['ABC',999])

console.log(letra,numero)