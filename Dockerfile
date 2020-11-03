FROM java:8

EXPOSE 8080

ADD target/boot-docker-kubernetes.jar boot-docker-kubernetes.jar

ENTRYPOINT ["java","-jar","boot-docker-kubernetes.jar"]