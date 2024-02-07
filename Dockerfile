FROM amazoncorretto:17
EXPOSE 8080
WORKDIR /opt
ENV PORT 8080
COPY target/*.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
#ENTRYPOINT ["java", ".jar", "/dockerdemo:0.0.1.jar "]