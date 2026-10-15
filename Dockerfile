FROM openjdk:22-jdk

COPY target/student-app.jar /tmp/student-app.jar

ENTRYPOINT ["java", "-jar", "/tmp/student-app.jar"]