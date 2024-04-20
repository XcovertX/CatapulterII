# Use a base image with Java 11 support
FROM openjdk:17-oracle
RUN microdnf install findutils

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle wrapper files and Gradle dependencies
COPY gradlew .
COPY gradlew.bat .
COPY build.gradle .
COPY settings.gradle .
COPY gradle/ ./gradle/

# Copy the source code
COPY src ./src/

COPY files ./files/

# Build the application
RUN ./gradlew build

# Copy the packaged JAR file into the container at the specified path
COPY build/libs/*.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
