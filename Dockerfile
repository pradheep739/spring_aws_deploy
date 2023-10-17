FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/SpringAwsDeploy-service.jar SpringAwsDeploy-service-service.jar
ENTRYPOINT ["java","-jar","/SpringAwsDeploy-service-service.jar"]
