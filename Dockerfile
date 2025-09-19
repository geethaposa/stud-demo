FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/student-demo-1.0-SNAPSHOT.jar"]
