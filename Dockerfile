FROM bellsoft/liberica-openjdk-alpine:11
COPY build/libs/ghoul-0.0.1-SNAPSHOT.jar /data/ghoul.jar
COPY entrypoint.sh /data/entrypoint.sh
RUN chmod 755 /data/entrypoint.sh
EXPOSE 8080
ENTRYPOINT ["/data/entrypoint.sh"]