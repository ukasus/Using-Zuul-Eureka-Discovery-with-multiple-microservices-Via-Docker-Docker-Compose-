This is a microservice articheture based project.
This folder contains four mircorservices-
1.ZuulProxy for the api gateway
2.EurekaServer for the service discovery
3.ServiceOne , a demo rest api application
4.ServiceTwo, a demo rest api application

To run these microservice as a whole application using Docker follow these steps--
1.First of all ,build all four microservices individually.(Using maven goals like 'clean install' in sts or intellij)
2.Build docker images for all four micorservices separatley.(Using docker cli with command 'docker build -t imageName .')
3.Change the apporpriate image name for the services in the docker-compose.yml file like the name of the docker images you used during image building.
4.Now run the 'docker-compose up' command at the location of docker-compoe.yml file.

Thank you.