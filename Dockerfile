

FROM openjdk:17-jdk-slim

LABEL maintainer="raktim@example.com"
LABEL version="1.0"
LABEL description="Docker image for my Java application built with OpenJDK 17"
LABEL build_date="2025-08-14"

WORKDIR /app


COPY src/Random_String.java /app/Random_String.java


RUN javac Random_String.java

CMD ["java", "Random_String"]
