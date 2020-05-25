FROM openjdk:8-jdk-alpine
ADD target/socialpet.jar socialpet.jar
ENTRYPOINT [ "java", "-jar", "socialpet.jar"]
