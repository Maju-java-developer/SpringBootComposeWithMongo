FROM openjdk:17
ADD target/springboot-compose-mongodb.jar springboot-compose-mongodb.jar
ENTRYPOINT ["java","-jar","springboot-compose-mongodb.jar"]