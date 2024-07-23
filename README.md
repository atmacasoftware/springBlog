# Spring Boot Blog App use Swagger

The dependency that needs to be installed in pom.xml;

```
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.0.2</version>
    </dependency>
```

Anation that needs to be added to the main folder where the run function is located:

```
    @OpenAPIDefinition(info = @Info(title = "", version = "", description = ""))
```

* title -> project name (Example: Blog)
* version -> Your version number (Example: 1.0.0)
* description -> Your project description 

