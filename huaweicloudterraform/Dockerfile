FROM ubuntu:16.04
WORKDIR /data

#Call this before you can install anything
RUN apt-get update

#install needed tools
RUN apt-get -y install wget
RUN apt-get -y install vim
RUN apt-get -y install git
RUN apt-get -y install make
RUN apt-get -y install zip

#install go
RUN wget https://storage.googleapis.com/golang/go1.11.5.linux-amd64.tar.gz
RUN tar -C /usr/local -xzf go1.11.5.linux-amd64.tar.gz
RUN export PATH=$PATH:/usr/local/go/bin
RUN echo 'PATH=$PATH:/usr/local/go/bin' >>~/.bashrc
RUN go version


#install terraform 
RUN wget https://releases.hashicorp.com/terraform/0.12.12/terraform_0.12.12_linux_amd64.zip
RUN unzip terraform_0.12.12_linux_amd64.zip
RUN mv terraform /usr/local/go/bin
RUN terraform version

#install huaweicloudstack provider
RUN git clone https://github.com/huaweicloud/terraform-provider-huaweicloudstack ~/go/src/github.com/terraform-providers/terraform-provider-huaweicloudstack
RUN cd ~/go/src/github.com/terraform-providers/terraform-provider-huaweicloudstack/
RUN make build
RUN export PATH=$PATH:~/go/bin
RUN echo 'PATH=$PATH:~/go/bin' >>~/.bashrc
