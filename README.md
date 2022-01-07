The land route problem is solved by DFS algorithm. 
Also Get API is cached by Spring @Cacheable for tuning the performance.

The time complexity of the solution is O(C + B), where C and B are the total number of countries and borders in the map.

The used some techs:
- Spring Boot 2.5.2
- Java 11
- Lombok
- Swagger

Test
- Download the project to the local.
- Open it by IDE (IntelliJ, etc.)
- Set the project SDK to the Java 11.
- Run the project.
- After startup, go to the following URL by the browser;
http://localhost:8080/swagger-ui/index.html#/route-controller/findRouteUsingGET
- Test API with the origin and destination parameters.
