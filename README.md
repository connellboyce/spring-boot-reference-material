# Spring Boot Reference Material
Review guide for developing with Spring Boot Framework

## Table of Contents
- [What is Spring Boot?](#what-is-spring-boot)
- [Features of Spring Boot](#features-of-spring-boot)
- [Why Spring Boot?](#why-spring-boot)
- [Spring vs. Spring Boot](#spring-vs-spring-boot)
- [Initializing a Spring Boot Project](#initializing-a-spring-boot-project)
- [Dependency Injection](#dependency-injection)
- [Making a Simple Web App](#making-a-simple-web-app)
- [Making a Simple API](#making-a-simple-api)
- [Sources](#sources)

### What is Spring Boot?
- Spring Boot is a Spring module to simplify the use of Spring Framework for Java Development.
- Spring Boot allows you to make standalone Spring Boot applications which can just be run.
- Removes many configurations and dependencies to assist in rapid development.
- Spring Boot comes with embedded servers, auto-configurations, and Spring Boot CLI.
- "Takes an opinionated view of the Spring Platform".

### Features of Spring Boot
- Spring Boot CLI
- Spring Initializr
- Spring Actuator
- Starter Dependency
- Auto-configuration
- Logging and Security

### Why Spring Boot?
- Stability
- Based on JVM
- Connectivity
- Cloud Native
- Flexibility
- Open Sourced

### Spring vs. Spring Boot
- Spring applications take time to get up and running whereas Spring Boot applications have much faster startup times.
- Spring "manages lifecycle of Java" while Spring Boot doesn't need to have a configured data source.
  - Spring Boot's auto-configuration measures are the reason why!
- Spring has a "dependency injection framework" but Spring Boot has pre-configured technology and frameworks.
- Spring Boot allows us to create a web application which can simply be run or executed. It is less complex than Spring. 

### Initializing a Spring Boot Project
- Can be done with the [Spring Initializr](https://start.spring.io/).
  - Your machine will need to meet the system requirements for the technologies selected in the Initializr.

![Spring Initializr Image](images/springinitializr.png)

- Once you have selected your preferences, you have the option to add dependencies based on what your project will require. Don't worry, if you decide you need a dependency later on in the process you can add it easily later!
- The Initializr will allow the user to download a complete generated Spring Boot project matching their preferences. Open this in an IDE and you are ready to begin Spring Boot development.
- Another option is to generate a Spring Boot project from your IDE. This varies from IDE to IDE and will require you to do some independent research.

### Dependency Injection
- The ability of an object to supply dependencies to another object.
  - A class will use methods/access data of another class.
- Classes used in dependency injection
  - Client class
    - the dependent class
  - Service Class
    - provides a service to the client class
  - Injector Class
    - injects the service class into the client class
- Based on: <u>Inversion of Control</u>
  - "A class should not configure its dependencies statically but should be configured by some other class from outside"
- Types of Dependency Injection
  - Constructor Injection
    - Injector class supplies dependency through the constructor
  - Setter/Property Injection
    - Injects to the setter method exposed by the client
  - Interface Injection
    - Injector uses an interface to provide the dependency to the client class and clients must implement an interface with a setter method that will accept the dependency.
- Benefits:
  - Easier way to connect components
  - Application is easier to extend
  - Unit testing is made easier
  - Reduces boiler plate code
> [Example Package](src/main/java/com/connellboyce/springbootreferencematerial/dependencyinjection)
    
### Making a Simple Web App
- This is how to make a simple multi-page web app.
- You will need the Thymeleaf dependency for this tutorial
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
- You will need a controller which allows Spring Boot to return the HTML to the user.
  - This will require the @Controller Spring Boot annotation
- You will need to add libraries to your resources directory. It should look like this:
> resources
>>templates
>>>index.html
>
>>static
>>>css
>>>>app.css
>
>>>js
>>>>app.js
>
>>>images
>>>>example.jpeg

- Naming conventions are extremely important. Improperly named directories will not be found by Thymeleaf.
- The controller should have a method for each html page it should be able to access and each method should have the @GetMapping annotation. This annotation takes a parameter which should be the endpoint the HTML page is accessed on.
  - For example: the Blog page would have
    - @GetMapping("/blog) &
    - return "blog";
    
- You can configure what port the app should run on in the application.properties file. Just set server.port equal to the desired port.
    
> [Example Package](src/main/java/com/connellboyce/springbootreferencematerial/simplewebapp)
    
### Making a Simple API
- Similar to Web App except returning/accepting values.
- Create a controller with the @RestController annotation. The controller also gets a @RequestMapping annotation, and for simplicity set this to ("/api").
- Within the body of the controller, you can have @GetMapping like the web app, but in addition can use @PostMapping, @PutMapping, and @DeleteMapping.
  - You can use as many of each as you want.
- The example I have used includes a validation dependency from Spring Boot:
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```
- For things like Post, Put and Delete, a request object is needed. This should have field(s) to be accepted as parameter(s) and a getter for each field. These fields are accompanied by validation annotations such as @Email, @NotBlank, @NotNull and more. If the JSON body attached to the API request is invalid, it will throw an exception.
> [Example Package](src/main/java/com/connellboyce/springbootreferencematerial/simpleapi)
    
### Sources
- [Edureka! Spring Boot Lesson](https://www.youtube.com/watch?v=UfOxcrxhC0s)
