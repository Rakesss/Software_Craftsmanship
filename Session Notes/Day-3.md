-------------------------------------------------------- POM--------------------------------------------------------- 
POM is an XML file  used in Apache Maven to define:

- A project’s configuration

- Dependencies

- Plugins

- Build lifecycle

- Project metadata (name, version, etc.)

-----------------------------------------------SUPER POM----------------------------------------------------------------------

The Super POM is the default parent POM that every Maven POM inherits from implicitly if no other parent is defined.

- It defines default values for configuration like:

- Default repository

- Plugin configurations

- Build settings

--------------------------------------------------------DEPENDENCIES-----------------------------------------------

Dependency scope controls when and where a dependency is available (compile, runtime, test, etc.).

Scope       |	           Description      	            |             Use Case                                   |                   Example Dependency
compile	    |     Default. Available in all build phases.   |	Needed at compile time and runtime.	             |   spring-core, when building a Spring app
provided    |  Available at compile time, but not packaged  |	Servlet API in web apps (e.g., Tomcat provides it).  |	javax.servlet-api


------------------------------------------------------------------ slf4j library------------------------------------------
To run code                -    logger.info("Done");
To run during Debbuging   -    logger.debug("Succesful");