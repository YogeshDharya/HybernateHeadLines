FROM openjdk:17-jdk-slim

LABEL maintainer="yogeshdharya@gmail.com"
LABEL version="1.0"
LABEL description="Dockerfile for Hybernate Head Lines Spring Boot Application"

WORKDIR /app

# Copy the application's JAR file
COPY target/news-application.jar app.jar

# Expose the application's default port
EXPOSE 8080

# Set environment variables for MySQL connection
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/news_app
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root_password

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
