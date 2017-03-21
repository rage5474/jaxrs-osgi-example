# Eclipse Micro Service

## Purpose 
This shows an example how a micro service with a JaxRS interface can be implemented with Eclipse tooling. 


## Build

### Prerequisites
- JDK8
- Maven > 3.3.0

### Compile 
- Clone repository
- cd src
- mvn clean verify
- Products can be found in src/de.ragedev.example.jaxrs.service.product/target/products

### Run
- Extract product for your platform
- Run emicroservice executable
- Console should came up with some Jetty notifications (Default port is 7777)

### Verify
- Do a post rest call with one JSON parameter 
- Example can be found in de.ragedev.example.jaxrs.client
- Your JSON parameter should be printed in console.
