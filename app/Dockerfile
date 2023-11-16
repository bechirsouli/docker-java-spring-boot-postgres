# FROM maven:3.8.5-openjdk-17 # for Java 17
FROM maven:3.8.2-jdk-8

WORKDIR /app
COPY . .
RUN mvnw clean install

CMD mvnw spring-boot:run