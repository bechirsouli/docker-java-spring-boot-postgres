# Stage 1: Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Stage 2: Final stage
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY --from=build /app/target/dependency /app/dependency
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-cp", "app.jar:dependency/BOOT-INF/lib/*", "hello.Application"]
