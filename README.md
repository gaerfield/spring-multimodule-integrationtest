# Objective

Objective of this repository is to test a very basic multi-module-configuration with Spring-Boot.

# Structure

Two modules are defined:

* *starter*: contains the spring-boot-starter bootstrapping the project
* *module*: contains Application-Code (for example REST-Services) and its tests

*starter* has a dependency on *module*. *module* on the other hand has a test-dependency on *starter*. This dependency-structure is not very common, but Integrationstests with [MockMvc](https://spring.io/guides/gs/testing-web/) needing to reference the Starter-Class to do the necessary bootstrapping.

# Pitfall

A spring-boot project replaces the generation of a "normal" jar by creating a fat-jar. To enable other modules to reference the starter-project within tests, the jar-task needs to be enabled. Check this [stackoverflow](
https://stackoverflow.com/questions/62340841/unable-to-integration-testing-gradle-multi-module-spring-boot-application) answer for details and also springs [documentation](https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/gradle-plugin/reference/html/#packaging-executable-and-normal) on this topic.
