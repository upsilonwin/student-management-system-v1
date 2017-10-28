#!/bin/sh
mvn clean package && docker build -t com.upsilonwin/SMSV1 .
docker rm -f SMSV1 || true && docker run -d -p 8080:8080 -p 4848:4848 --name SMSV1 com.upsilonwin/SMSV1 
