FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ./var/jenkins_home/workspace/cli/target /usr/local/bin/cli
WORKDIR /usr/local/bin
CMD ["java", "-jar", "cli-0.0.1-SNAPSHOT.jar"]
