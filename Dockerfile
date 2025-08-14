
# Step 1: Use an official OpenJDK base image
FROM openjdk:17-jdk-slim

# Step 2: Add metadata (optional but recommended)
LABEL maintainer="raktim@example.com"
LABEL version="1.0"
LABEL description="Docker image for my Java application built with OpenJDK 17"
LABEL build_date="2025-08-14"

# Step 3: Set the working directory inside the container
WORKDIR /app

# Step 4: Copy the JAR file into the container
COPY src/Random_String.java /app/Main.java
# Adjust the path if your JAR file is somewhere else

RUN javac Main.java

CMD ["java", "Main"]
