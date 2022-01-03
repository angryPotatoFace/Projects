const app = Vue.createApp({
  //  template: `
    //    <h1> Hola mundo </h1>
   //     <p> Desde app </p> 
   // `

    data(){
        return{
            quote: "I'm batman",
            author: "Bruce Wayne"
        }
    },
    methods:{
        changeQuote(event){
            console.log('Hola Mundo')
            this.author = 'RandomGuy'
            this.quote = ' Say hello'
            this.capitalize()
        },
        capitalize() {
            this.quote=this.quote.toUpperCase()
        }
    },
   

})

app.mount('#myApp')