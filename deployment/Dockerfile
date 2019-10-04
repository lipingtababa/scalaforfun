FROM ubuntu:18.04
WORKDIR /data
#install Java
RUN apt-get update
RUN apt-get -y install default-jdk
#install scala
RUN apt-get remove scala-library scala
RUN apt-get -y install wget
RUN wget http://scala-lang.org/files/archive/scala-2.12.1.deb
RUN dpkg -i scala-2.12.1.deb
RUN apt-get update
RUN apt-get install scala
#install sbt
RUN echo "deb https://dl.bintray.com/sbt/debian /" >> /etc/apt/sources.list.d/sbt.list
RUN apt-get -y install gnupg2
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
RUN apt-get update
RUN apt-get -y install sbt
