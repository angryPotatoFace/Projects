import Counter from 'c:/Users/brunoBonino/Desktop/Vue/03-fundamentos/src/components/Counter.vue';

<template>
  <h2> Counter </h2>
  <p> {{Counter}} </p>
</template>

<script>
export default {
    data(){
        return {
            counter:5
        }
    }
}
</script>

<style>

</style>