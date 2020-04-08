# spring-boot-angular-archetype
Archetype to build a Spring Boot service and Angular as FE

### How to use it

`cd` into `spring-boot-angular-archetype` and run

`mvn clean install`

Then, in another folder outside `spring-boot-angular-archetype` run this command.

```
mvn archetype:generate \
	-DarchetypeGroupId=com.darksideofthedev	\
	-DarchetypeArtifactId=spring-boot-angular-app \
	-DarchetypeVersion=0.0.1-SNAPSHOT \
	-DgroupId=com.singletonapps \
	-DartifactId=light-spring-boot-angular-app \
```

It'll genrate a folder `spring-boot-angular-app`. Open it with an IDE and you'll have a functional Spring Boot Application.
