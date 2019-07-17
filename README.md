# 'Contact Form' - Spring Boot & Angular application by Tomasz Gomoradzki

'Contact Form' is relatively simple tool allowing to create client's contact requests using the form, save them in the database,
 review and delete. Application uses embeded H2 database.


Deployment and running:

Project directory structure is divided into two main parts:

- 'contact-form', which is Angular front-end
- 'contact-form-rest',which is Spring Boot back-end rest api

It is set up to be built using Maven into one JAR file, produced in /target directory To do that:

1. clone the project
2. go to project api directory: '/spring-boot-angular-contact-form/contact-form-rest'
3. build the project in with command: 'mvn clean package', 'mvn install'. This will produce one JAR file in target directory
4. run application with command: 'java -jar target/contact-form-rest-0.0.1-SNAPSHOT.jar'

In project directory '/jar-backup', already built .jar file has been saved for review and testing purposes.

Application is configured to be launched at:

'http://localhost:8080'



Technology Stack:

- Java 11
- Spring Boot 2
- Angular 8
- H2 Database
- Maven 3