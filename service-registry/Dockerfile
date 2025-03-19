FROM gradle:7.5.0-jdk17 as build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

FROM openjdk:17
COPY --from=build /app/build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]