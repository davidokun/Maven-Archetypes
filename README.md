# Maven Archetype Examples

This repository contains several examples of maven archetypes to create java projects.

---

## List of Archetypes

---

### 1. Basic Spring Boot Archetype

This archetype is for a basic Spring Boot application. Its main componenst are:

##### DarkApp.java
This is the main java class to init the application.

##### DarkController.java

Is a basic `@RestController` with a simple endpoint `/hello` to recive `GET` requests. 

##### DarkService.java

A `@Service` component to serve responses.

### How to use it

`cd` into `basic-spring-boot-archetype` and run

`mvn clean install`

Then, in another folder outside `basic-spring-boot-archetype` run this command.

```
mvn archetype:generate
	-DarchetypeGroupId=com.darksideofthedev		\
	-DarchetypeArtifactId=dark-spring-boot-app	\
	-DarchetypeVersion=1.0-SNAPSHOT			\
	-DgroupId=com.lightsideofthedev			\
	-DartifactId=light-spring-boot-app		\
```
It'll genrate a folder `light-spring-boot-app`. Open it with an IDE and you'll have a functional Spring Boot Application.

---

