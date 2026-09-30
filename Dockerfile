#------------------------------------
#stage 1: Build
#-------------------------------------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package


#------------------------------------
#stage 2: Run
#----------------------------------

FROM eclipse-temurin:21-jre-alpine
WORKDIR /opt/app
COPY --from=build /build/target/manab-technologies.jar app.jar

RUN adduser -D appuser && chown -R appuser /opt/app
USER appuser

EXPOSE  8080
ENTRYPOINT ["java", "-jar", "app.jar"]

