# spring-boot-weather

This project is a small weather forecast application using the Weather Stack API and OpenWeatherMap API as secondary.
To run this application:

* make sure Java is installed
* clone this repository
* open the application in any IDE eg. Eclipse 
* run Java Application

after successful startup:
* open browser and navigate to http://localhost:8080/v1/weather

Response:{
    "wind_speed": "17",
    "temperature": "14"
}


Notes:
1. Here Weather Stack is the primary source for forecast and secondary is OpenWeatherMap.
2. I have used @Primary annotation of Spring to support this feature.
3. Becase of time constraints, I have not implemented caching but I would do the same in the service class WeatherService.java
   Here the check the DB datetime value of the first api call. If its less than 3 mins use the laste fetched value from DB else make a real
   time API call.
   
Recommendations
1. From scalibility and perfomance prespectivce, Choosing which fucntion to behave as an indivdual microservice depends on the NFR(Non-functional Requirements) and other KPI.
2. Having each thrid party service as a microservice  makes it easier to scale up when required.
3. From an orchestration level, we need to add security in our headers to understand the request comes through an authenticated and authorized service. This can be achieved in many ways and it also depends how API gateways are used in a particular organization. One way to achieve is to configure clientId level access to that service.
