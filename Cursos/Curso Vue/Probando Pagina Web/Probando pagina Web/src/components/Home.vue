<template>
  <div class="home-title">
      <h1 id="title">I<span class="span-title">'</span>m<br>Bruno<br>Bonino<span class="span-title">.</span> </h1>
      <div>
      <p id="description" >
          Management <br>Information system <br>Students <br>Consultant
      </p>
      </div>
  </div>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Lato:ital,wght@1,700&display=swap" rel="stylesheet">
</template>

<script>
export default {
    
    data(){
        return{ 
            question: null,
            img: null,
            answer: null,
            isValidQuestion:null
        }
    },
    methods: {
        async getAswerd(){
            this.answer= 'Pensando'
            const { answer, image} =  await fetch("https://yesno.wtf/api").then(r => r.json() )
            this.answer = answer=='yes' ? 'Si' : answer
            this.img=image
        }
    },
    watch:{
        question(value,oldValue){
            this.isValidQuestion=false;
            if(!value.includes("?")) return
            this.isValidQuestion=true;
            this.getAswerd()
        }
    }
}
</script>

<style >

.home-title {
  position: fixed;  
  padding-left: 20em;
  text-align: left;
}
.span-title{
    color: #FFC300;
    border-radius: 10em;
}

#description{
    color: #001E84;
    font-family: 'Opens Sans';
    font-size: 1.5em;
}

#title {
    color: #001E84;
    font-family: 'Bebas Neue',cursive;
    font-size: 6em;
}

 body{
     background-image: url("https://www.wallpapertip.com/wmimgs/81-810818_1920x1080-minimalism-desktop-background-hd-wallpaper-high-resolution.jpg"); 
     background-size: 100vw;
 }
</style>