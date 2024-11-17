# Use a base image with Java installed
FROM openjdk:22

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file into the container
COPY target/Log_output-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
