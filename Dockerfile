#------------------------------------
# Stag 1: Build JAR with Maven
#-----------------------------------

FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /build
COPY pom.xml .

RUN mvn dependency:go-offline
COPY src ./src

RUN mvn clean package -DskipTests
#-----------------------------------
#Stag 2 : RUN the JAR with small jre
#-----------------------------------

FROM eclipse-temurin:21-jre-alpine

WORKDIR /opt/app
COPY --from=build /build/target/manab-technologies.jar app.jar

RUN adduser -D appuser && chown -R appuser /opt/app
USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

