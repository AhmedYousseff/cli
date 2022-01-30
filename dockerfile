FROM openjdk:8-jre-slim
EXPOSE 8080
COPY ./target/cli-0.0.1-SNAPSHOT.jar /usr/local/bin/cli
WORKDIR /usr/local/bin
CMD ["java", "-jar", "cli-0.0.1-SNAPSHOT.jar"]
