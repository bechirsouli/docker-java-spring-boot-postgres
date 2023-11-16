FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
RUN ls
# Copy the JAR file into the image
COPY target/app.jar app.jar

# Create the dependency directory
RUN mkdir -p dependency

# Extract JAR dependencies
RUN java -Djarmode=layertools -jar app.jar extract

# Set the entry point
ENTRYPOINT ["java", "-cp", "app:dependency/dependencies/*", "hello.Application"]
