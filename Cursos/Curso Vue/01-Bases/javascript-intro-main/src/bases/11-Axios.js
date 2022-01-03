import axios from "axios";

const apiKey = 'tlAOBS0vzDRhjidrA9dEH6hY2oJLwQCe'

// https://api.giphy.com/v1/gifs/random?api_key=tlAOBS0vzDRhjidrA9dEH6hY2oJLwQCe

const giphyApi = axios.create({
    baseURL: 'https://api.giphy.com/v1/gifs',
    params: {
        api_key: apiKey
    }
    
})

/*giphyApi.get('/random')
    .then( resp =>{
      
        const url = resp.data.data.images.original.url
        console.log(url)
        const img = document.createElement('img')
        img.src= url
        document.body.append(img)
    })*/

export default giphyApi

