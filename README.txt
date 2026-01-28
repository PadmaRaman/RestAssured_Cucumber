API Practice Link: https://www.automationexercise.com/api_list

======================================================================================================================
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

 GroupID: Defines the Business Unit
 ArtifactID: Defines our Project

========================================================================================================================
//GIT
Git Commands:
1) git init: Initializes a new Git repository in your project directory.
2) git remote add origin "<GITHUB_URL>": Connects your local repository to the remote GitHub repository.
3) git add .: Stages all project files, preparing them to be committed.
4) git status: Displays the current status of your files, showing which are staged or unstaged.
5) git commit -m "Initial Commit": Creates a local commit with the message “Initial Commit” and a unique commit ID.
6) git branch -M main: Renames the current branch to main (the default branch for GitHub).
7) git push -u origin main: Pushes your local commits to the remote repository on the main branch.

==============================================================================================================
//BDD Cucumber Framework
Cucumber Keywords:
Feature: It defines high-level functionality of what to test
Background: Defines steps which are common for all scenarios. Runs before every scenario.
Scenario: A single Test case written in Gherkin
Scenario Outline: Used when same scenario to run multiple times with different outputs.
Examples: It holds the data tables.
Given: Defines Pre-conditions/setup steps like where we start.
When: The action, what we do, like HTTP methods
Then: Expected result or validation
And: Used to combine multiple given, when and then
But: Used to express a negative expectation

Created a Feature file - Products, Brands, Login, Accounts
Implemented dry run to make sure all the feature files are linked to ProductDetails StepDefinition file. It will not run any tests.
Achieved Reusability of code to avoid code duplicates.
Implemented Parameterization using Scenario Outline to run same tests multiple times with different set of test data in Products features.
Implemented Data Driven testing in Accounts feature to create account using name, email id, address, password, DOB etc.
Implemented Tags for selective test executions.
Implemented tag-specific hooks in Products feature files and defined in hooks.java
Implemented cucumber reports in html and json types.

Cucumber Hooks:
Hooks are special blocks of code that run before and after every scenario, Scenario with specific tags, and for each step
They can be used for test setup, test clean, generating logs, starting or closing browser or API client, and resetting test data.

@Before - Runs before every scenario
@After -  Runs after every scenario
Tag specific hooks - Runs only for specific scenarios using tags like @Smoke, @Regression.
@BeforeStep - Runs before each step
@AfterStep - Runs after each step

Task - Hook
Set base URI for Rest-Assured - @Before or @Before("@api")
Reset API environment - @After or @After("@api")
Take screenshot on failure - @AfterStep
Print logs for debugging - @BeforeStep / @AfterStep
Initialize browser / WebDriver - @Before
Quit browser - @After

@Before -> Background -> Scenario -> @After

//Cucumber Reports
=======================================================================================================================
//TestNG
TestNGRunner class is created where feature and step definition files are linked and tags are specified to have smooth test executions.
TestNG will not run the feature file until the AbstractTestNGCucumberTests is extended which helps in running the feature files.

//Regex expressions
Used RegEx Expressions in step definitions to pass any type of datas

========================================================================================================================
//Excel Integration- Data driven using Excel
 Using Apache POI API

 Startegy to Access Excel Data
 1) Create Object for XSSFWorkbook class
 2) Get Access to Sheet
 3) Get Access to all rwos of Sheet
 4) Access to specific row from all rows
 5) Get Access to all cells of Row
 6) Access the Data from Excel into Arrays
 =======================================================================================================================
//Jenkins CI
java -jar jenkins.war
http://localhost:8080/

