# Spring Boot & Angular - 'Contact Form'  by Tomasz Gomoradzki

'Contact Form' is relatively simple tool allowing to create client's contact requests using the form,
saving them in the database, review and delete. Application uses embeded H2 database.


Deployment and running:

Project is divided into two parts:
- contact-form directory, angular front-end
- contact-form-rest	directory, back-end rest api

It is set up to be built into one JAR file available in /target directory, to do that:
1. Clone the project
2. Go to project api directory: 
	\spring-boot-angular-contact-form\contact-form-rest
3. Build the project in CMD with command: 
	mvn clean package, 
	mvn install, 
	this will produce one JAR file in target directory
4. Run application with command:
	java -jar target/contact-form-rest-0.0.1-SNAPSHOT.jar

In project directory '/jar-backup' backup .jar file has been saved which is already built for review purposes.

Application is setup in configuration file: 

\contact-form\proxy.conf.json
to be launched at:

'http://localhost:8080'



Technology Stack:

- Java 11
- Spring Boot 2
- Angular 8
- H2 Dataase
- Maven