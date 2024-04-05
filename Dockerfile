# define base docker image

FROM openjdk:17
EXPOSE 8080
LABEL maintainer = "https://anuradhap.com/"
ADD target/spring-github-actions.jar spring-github-actions.jar
ENTRYPOINT ["java", "-jar", "spring-github-actions.jar"]