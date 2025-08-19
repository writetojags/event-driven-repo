FROM openjdk:17-jdk-slim 
WORKDIR /app
COPY target/event-driven-repo-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
