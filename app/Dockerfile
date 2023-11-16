FROM eclipse-temurin:17-jdk-alpine
RUN addgroup -S app && adduser -S app -G app
USER app
VOLUME /tmp
ARG DEPENDENCY=target/dependency
RUN mkdir -p dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]