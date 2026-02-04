FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# 👇 THIS IS THE FIX
RUN chmod +x mvnw

RUN ./mvnw -B dependency:go-offline

COPY src src
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/item-api-0.0.1-SNAPSHOT.jar"]
