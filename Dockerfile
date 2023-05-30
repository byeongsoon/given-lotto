FROM openjdk:17
LABEL description="given lotto server by JB"

ENV APP_HOME="/usr/app/"
WORKDIR $APP_HOME

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar -Dspring.profiles.active=prod app.jar"]