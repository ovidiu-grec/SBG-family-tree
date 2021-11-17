# Family tree application for Sky Betting & Gaming.

## Tech stack used
- Spring Boot 2.5.6
- Maven 3.6.3
- VS Code 1.62
- Java Packages including Spring, Log4j and JUnit

# Extent of implementation
Only a small part of the functionality reuired has been implemented in this repository. Part of the reason for this are delays caused by dependency versioning errors, but also due to the focus on quality over quantity. As such at the moment a reasonable Object structure is used to store the family and its members, however for implementing some of the later feature in an efficient manner, the data structure might have to be changed significantly.
The API has its controller and service layers running, but not completing required functions, with the endpoint used for inserting children to the family being the one closes to completion.
# Build and Run
To build the code simply write the followin on the command line (this will also run the tests):
```
mvn clean install
```
To run the application, start the spring server by running the main class in FamilyTreeApplication.java through your IDE or starting up spring through maven:
```
mvn spring-boot:run
```
# Sample request
Currently only one endpoint is available and is not fully functioning, but can be acessed with a curl of the following pattern:
```
curl -i \
    -H "Accept: application/json" \
    -H "Content-Type:application/json" \
    -X POST --data \
      '{"childName":"john","motherName":"anne","fatherName":"mark"}' \
      "http://localhost:8080/addfamilymember"
```