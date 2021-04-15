FROM php:7.2-apache
RUN apt update
RUN mkdir -p /usr/share/man/man1
RUN apt install -y openjdk-11-jre wget
WORKDIR /var/www/html
RUN rm -rf *
COPY ./web/ /var/www/html
RUN wget -O j8086cc.jar https://github.com/bjrjk/j8086cc/releases/download/v0.3/j8086cc-v0.3.jar
ENTRYPOINT ["bash","/var/www/html/startup.sh"]
EXPOSE 80