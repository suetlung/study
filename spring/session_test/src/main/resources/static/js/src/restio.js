import "https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.js";

let restio = new Restio();

class Restio {


    getConfig() {
        let config = {
             headers: {
                'Content-Type':'application/json;charset=UTF-8',
                'Access-Control-Allow-Origin':'*'
             }
         };
        if (this.x-auth-token != null) {
            config.headers['x-auth-token'] = this.x_auth_token;
        }
        return config;
    }

    get(url, data ) {
        axios.get(url, data, this.getConfig()).then((resp) => {
            if (resp.headers['x-auth-token'] != null) {
                this.x_auth_token = resp.headers['x-auth-token']
            }
            return resp.data;
        });

    }

    put(url, data) {
        axios.put(url, data, this.getConfig()).then((resp) => {
           if (resp.headers['x-auth-token'] != null) {
               this.x_auth_token = resp.headers['x-auth-token']
           }
           return resp.data;
       });
    }

}