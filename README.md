The land route problem is solved by DFS algorithm. 
Also Get API is cached by Spring @Cacheable for tuning the performance.

The time complexity of the solution is O(C + B), where C and B are the total number of countries and borders in the map.

The used some techs:
- Spring Boot 2.5.2
- Java 11
- Lombok
- Swagger

The application can be tested by Swagger-UI.
The following URL provides to test the route API.

http://localhost:8080/swagger-ui/index.html#/route-controller/findRouteUsingGET
