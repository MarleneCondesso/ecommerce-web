<template>
    <div class="container d-flex flex-column">
        <h3 class="text-center d-flex align-self-center mt-5 ">New Category</h3>
        <div class="form p-5 d-flex flex-column align-self-center col-6">
            <div class="form-group flex-row">
                <label class="form-label">Name</label>
                <input class="form-control mb-4" v-model="category_name">
            </div>
            <div class="form-group flex-row">
                <label class="form-label">Description</label>
                <textarea class="form-control mb-4" v-model="category_description"/>
            </div>
            <div class="form-group flex-row">
                <label class="form-label">Image</label>
                <input class="form-control mb-4" v-model="category_image">
            </div>
            <button type="button" class="btn btn-dark btn-lg mt-4" @click="create">Create</button>
        </div>
    </div>
</template>

<script>

    const axios = require("axios");
    const sweetalert = require("sweetalert");
    export default {
        data() {
            return {
                category_name: "",
                category_description: "",
                category_image: ""
            }
        },
        methods: {
            create() {
                console.log(this.category_name, this.category_description,this.category_image);
                const category = {
                    category_name: this.category_name,
                    category_description: this.category_description,
                    category_image: this.category_image
                };

                const baseUrl = "https://ecommerce-web-api-mysql-server.codwkqia4gse.eu-north-1.rds.amazonaws.com";

                axios({
                    method:"POST",
                    URL: `${baseUrl}/category/create`,
                    data: JSON.stringify(category),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(() => {
                    sweetalert({
                        text: 'Category added sucessfully',
                        icon: 'sucess'
                    })
                }).catch((error) => {
                    console.log(error);
                });
            }
        }
        
    }
</script>