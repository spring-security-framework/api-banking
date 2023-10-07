FROM openjdk:17

LABEL MAINTAINER=tongochung1809@gmail.com

ARG JAR_FILE=/target/*.jar

WORKDIR /app

ADD $JAR_FILE ./api-spring.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/app/api-spring.jar" ]