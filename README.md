
# Vine Getaway Service

Spring boot application that provides single access point to Vine PET project

## Service Requirements

- verify that port 8760 not in use or change port in [application.yml](src/main/resources/application.yml)

## How to run

1. ```bash mvn clean install```
2. run [eureka service ](https://github.com/Volodymyr2907/vine-registration-service)
3. run [vine service](https://github.com/Volodymyr2907/vine-service)
4. run [user service](https://github.com/Volodymyr2907/user-service)
5. run [gateway service](src/main/java/com/mentorship/vinegatewayservice/VineGatewayServiceApplication.java);