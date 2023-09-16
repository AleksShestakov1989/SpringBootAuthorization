FROM openjdk:17-oracle

EXPOSE 7777

COPY target/SpringBootAuthorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]