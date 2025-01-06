# Stage 1 - Build stage
FROM maven:3.9.6-eclipse-temurin-17-focal AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build the application and skip tests
RUN mvn clean package -DskipTests

# Stage 2 - Runtime stage with JRE only
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy only the built JAR file from the build stage
COPY --from=build /app/target/DockerBasic-0.0.1-SNAPSHOT.jar app.jar

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]