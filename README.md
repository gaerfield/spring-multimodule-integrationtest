# Objective

Objective of this repository is to test a very basic multi-module-configuration with Spring-Boot.

# Structure

Two modules are defined:

* *starter*: contains the spring-boot-starter bootstrapping the project
* *module*: contains Application-Code (for example REST-Services) and its tests

*starter* has a dependency on *module*. *module* on the other hand has a test-dependency on *starter*. This dependency-structure is not very common, but Integrationstests with [MockMvc](https://spring.io/guides/gs/testing-web/) needing to reference the Starter-Class to do the necessary bootstrapping.
