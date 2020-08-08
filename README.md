after having database and runnig Gateway server just clean build and run your service

to check functionality

your gateway server is runnig on port :8080 and an API which is written in service is called via gateway server for this, open your browser and hit below url

http://localhost:8080/api/v1

this is working well because of the configuration done in Gateway server's application.property file

zuul.prefix=/api
zuul.routes.middleware.path=/v1/**
zuul.routes.middleware.url=http://localhost:8081/

above code specify that all the comming resquests from "http://localhost:8080/" url with prefix "/api" and followed by "/v1/" are forwareded to 
zuul.routes.middleware.url=http://localhost:8081/ url.

and an API is written in service which will response you the same.

