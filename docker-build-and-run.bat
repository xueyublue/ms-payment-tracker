call mvn clean install

call docker rm -f ms-payment-tracker

call docker image rm darren/ms-payment-tracker

call docker build . -t darren/ms-payment-tracker

call docker run -d --name ms-payment-tracker -p 8094:8080 darren/ms-payment-tracker
