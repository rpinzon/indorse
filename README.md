## Multiply the matrices

#### Scope of Assignment

This assignment expects you to write a program which will be able to multiply two matrices by passing it to a function. 
You can find more information about the multiplication of matrices here - https://en.wikipedia.org/wiki/Matrix_multiplication

### Assignment Details

In this program, first, you will ask the user to enter the size of the matrices (rows and columns).
Thereafter, you will get the elements of the matrices as inputs from the user.
Then you will multiply the two matrices.

Basic feature of the application should include:

* Should print out Matrix 1
* Should print out Matrix 2
* Should print out the result matrix

## Solution

The solution is console based, so the user must run the application and interact with it through the terminal.

#### Requirements

* Maven 3.3+
* Java 1.8

#### Building the project

To build the project you can either clone the repository or download it as a ZIP file and run the command `mvn clean install`.

#### Running the tests

The tests can be run through the command `mvn verify`.

#### Running the application

To run the application the following commands can be used:

* `mvn spring-boot:run` (preferred)
* `mvn spring-boot:start`
* `java -jar target/indorse-0.1.0-SNAPSHOT.jar` (requires to specify the artifact name correctly)
