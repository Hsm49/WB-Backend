# Etapa de construcción
FROM maven:3.8.5-openjdk-17 AS build

COPY ./src /usr/src/app/src
COPY ./pom.xml /usr/src/app

WORKDIR /usr/src/app

RUN mvn clean package -DskipTests

# Etapa final
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /usr/src/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
