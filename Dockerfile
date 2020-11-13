FROM openjdk:8
ADD target/dockertest.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
