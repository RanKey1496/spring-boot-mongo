FROM maven:3.5-jdk-8
COPY . .
RUN mvn clean package -DskipTests
CMD ["java","-jar","./target/spring-mongo-example-0.0.1.jar"]