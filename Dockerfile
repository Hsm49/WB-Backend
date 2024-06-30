FROM maven:3.10.1-eclipse-temurin-17-alpine as builder

COPY ./src src/
COPY ./pom pom.xml

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --from=builder target/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","/app.jar"]

