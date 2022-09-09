FROM openjdk8:latest
ADD target/bmp-sim-connectivity-bussiness-service-1.0.jar bmp-sim-connectivity-bussiness-service.jar
RUN sh -c 'target/bmp-sim-connectivity-bussiness-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bmp-sim-connectivity-bussiness-service.jar"]
