#### Body expected for request
  ##### `POST localhost:8080//getHouseProperties`
  ##### 
          {
            "name": "Casa",
            "district": "Trindade",
            "rooms": [
                {
                    "name": "Quartoum",
                    "width": "2.0",
                    "length": "1.0"
                },
                {
                    "name": "Quartodois",
                    "width": "1.0",
                    "length": "3.0"
                },
                {
                    "name": "Quartotres",
                    "width": "2.0",
                    "length": "2.0"
                },
                {
                    "name": "Quartoquatro",
                    "width": "2.0",
                    "length": "3.0"
                }
            ]
        }

#### District names available
  #### `Trindade, Pantanal, Campeche, Canasvieiras, Coqueiros`

##### **Tests failed when using the repository (it returns a null map)
