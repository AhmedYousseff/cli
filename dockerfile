From docker pull openjdk:8-jre-slim
Expose 8080
copy ./target/cli-0.0.1-SNAPSHOT.jar /usr/local/bin/cli
WORKDIR /usr/local/bin
CMD ["java", "-jar", "cli-0.0.1-SNAPSHOT.jar"]
