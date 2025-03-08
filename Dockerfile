FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/springboot-app.jar /app/springboot-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-app.jar"]