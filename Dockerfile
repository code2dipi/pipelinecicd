FROM openjdk:8
EXPOSE 8080
ADD target/cicd-images-integration.jar cicd-images-integration.jar
ENTRYPOINT ["java","-jar","/cicd-images-integration.jar"]