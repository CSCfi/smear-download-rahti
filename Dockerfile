FROM openjdk
MAINTAINER Pekka Järveläinen
ADD target/download-0.0.1-jar-with-dependencies.jar
RUN chmod 777 download-0.0.1-jar-with-dependencies.jar
EXPOSE 8080:8887
ENTRYPOINT ["java","-jar","download-0.0.1-jar-with-dependencies.jar"]
