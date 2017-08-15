# Spring cloud bus client using kafka 

## Getting Started

This application acts as a client that uses the server to obtain its own configuration

### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

Then run the jar you got in your target : java -jar spring-cloud-server-0.0.1-SNAPSHOT


## Test

for test a rest controller was created that return a value retrieved from server

localhost:8002/lucky-word

if the config file in [this](https://github.com/karimohsen/SpringCloudConfig) repository changed no need to redeploy the server or the client

you just have to updated them

http://localhost:8001/bus/refresh  -- to update the server

http://localhost:8002/refresh --to update the client (sometimes not required)

all the @RefreshScope anotation placed in your code over a method or class gets the updates fetched from the server

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
*[kafka](https://kafka.apache.org/) -kafka server

Contact me : karim.abdelmohsen.1992@gmail.com