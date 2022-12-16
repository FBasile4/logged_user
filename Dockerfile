FROM openjdk:19-alpine
RUN addgroup -S spring && adduser -S spring -G spring
VOLUME /tmp
EXPOSE 8084
ARG DEPENDENCY=target
ADD ${DEPENDENCY}/*.jar appuserlogged.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/appuserlogged.jar"]
