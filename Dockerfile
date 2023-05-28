FROM openjdk:11-jre-slim
WORKDIR /myapp
COPY Calculator.jar .
RUN apt-get clean && rm -rf /var/lib/apt/lists/*
CMD ["java", "-jar", "Calculator.jar"]
