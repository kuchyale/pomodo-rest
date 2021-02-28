FROM openjdk:11.0.10-jre
COPY ./rest/target/pomodo-rest.jar pomodo-rest.jar
COPY ./entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh
CMD ["/entrypoint.sh"]