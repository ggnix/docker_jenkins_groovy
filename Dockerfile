FROM jenkins:1.651.3

MAINTAINER Gleb Golubyatnikov
USER root

# Install plugins
COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt
COPY *.json /usr/share/jenkins/ref/init.groovy.d/job-dsl/
COPY *.groovy /usr/share/jenkins/ref/init.groovy.d/
