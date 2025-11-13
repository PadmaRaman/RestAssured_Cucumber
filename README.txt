//Maven Project
 The below maven dependencies to be added to the project.
 1) TestNG
 2) Cucumber
 3) RestAssured
 4) Hamcrest

 Mvn Commands:
 1) mvn validate: Verifies if pom.xml is correct and all information is available
 2) mvn clean: Removes the target directory and files generated in previous build
 3) mvn compile: Compiles the source code and places the compiled source code into target/classes directory
 4) mvn test-compile: Compiles the test-source code places the compiled source code into target/test-classes directory
 5) mvn test: Executes the unit test defined in the project
 6) mvn package: Compiles the code, runs test and packages the compiled code in to distributed format(JAR, WAR)
 7) mvn verify: Runs and check if the package is valid and meets the quality standards
 8) mvn install: Packages the project and installs them into local Maven repository, making it available to use in other local projecgts
 9) mvn deploy: Installs the package into local repository and then copies the final copy to the remote repository for sharing
 10) mvn site: To generate project documentation and reports
 11) mvn archetype:generate: To create a new project based on specified archetype (Project template)
 12) mvn dependency:tree: Displays the project dependency tree, showing all direct and transitive dependencies