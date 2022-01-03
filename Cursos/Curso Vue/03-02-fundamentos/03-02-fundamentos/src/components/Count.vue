<template>
    <h2> {{customTitle}} <small>{{fecha}} </small> </h2>
    <p> {{counter}} <sup>2</sup> = {{squareCounter }} </p>
    <div>
        <button v-on:click ="incrementValue"> Increment </button>
        <button v-on:click ="decrementValue" > Decrement </button>
    </div>
    <div> <input type='date' v-model="fecha" > </div>
</template>

<script>
export default {
    
   props:['title'],
    data(){
        return {
            counter:5,
            fecha:'2017-07-04'
        }
    }, methods: {
    getSquareValue(){
      console.log('getSquareValue')
      return this.counter *this.counter
      
    },
    incrementValue(){
        this.counter++
    },
    decrementValue(){
        this.counter--
    },
    mostrarFecha(){
        return this.fecha
        }
    },
    computed: {
     squareCounter(){
         return this.counter*this.counter
    },
    customTitle(){
        return this.title || 'Counter'
    }
  }
}
</script>

<style>
    button{
        background-color: #64B867;
        border-radius: 5px;
        border: 1px solid white;
        color: white;
        cursor: pointer;
        margin: 0 5px;
        padding: 5px 15px;
        transition: 0.3s ease-in-out;

    }

    button:hover{
        background-color: #5aa67b;
        transition: 0.3s;
    }

</style>