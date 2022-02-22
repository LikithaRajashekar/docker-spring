FROM openjdk:8
EXPOSE 8085
ADD target/docker-spring.jar docker-spring.jar 
ENTRYPOINT ["java","-jar","/docker-spring.jar"]