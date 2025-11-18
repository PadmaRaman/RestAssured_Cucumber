API Practice Link: https://www.automationexercise.com/api_list

//Maven Project
 The below maven dependencies to be added to the project.
 1) TestNG
 2) Cucumber
 3) Cucumber-TestNG
 4) RestAssured
 5) Hamcrest

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

Git Commands:
1) git init: Initializes a new Git repository in your project directory.
2) git remote add origin "<GITHUB_URL>": Connects your local repository to the remote GitHub repository.
3) git add .: Stages all project files, preparing them to be committed.
4) git status: Displays the current status of your files, showing which are staged or unstaged.
5) git commit -m "Initial Commit": Creates a local commit with the message “Initial Commit” and a unique commit ID.
6) git branch -M main: Renames the current branch to main (the default branch for GitHub).
7) git push -u origin main: Pushes your local commits to the remote repository on the main branch.

//Cucumber Framework
Created a Feature file - Products, Brands, Login and linked it to a ProductDetails StepDefinition file.
Cucumber Exceptions: UndefinedStepException

//TestNG
TestNGRunner class is created where feature and step definition files are linked to have smooth test executions.

//Regex expressions
Used RegEx Expressions in step definitions to pass any type of datas

