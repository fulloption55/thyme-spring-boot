# thyme-spring-boot
=====================================
Example for Spring boot web application with Thymeleaf

Main feature supports :
- It can resolve internationalize(i18n) from Back-End service
- It is using Thymeleaf to be UI avoid to use JSP
- Example for manual resolve database information (i.e. call api to get database user)
- Example to generate transaction ID and calculate execution time
- Example to find matched code with enum
- Example to simplify connect SOAP (Webservice)

Dev Setup
---------

### Prerequisites

- Java version 1.8
- Maven version 3

### Environments

1. Local as local
2. Alpha as develop
3. Release Candidate as staging
4. Production as production

### Testing
Do not ignore unit testing

Run test with command : `mvn clean test`

### Code Covered Report
- Run `mvn clean package`
- Location report : `xxxxxx/target/site/jacoco/index.html`

### Running

1. We should run `mvn clean -Plocal package` before every start application
2. Run SQL files in `src/main/resources/sql` to update or setup your database
3. Running `java -jar -Dspring.profiles.active=local target/xxxxx-*.jar` and possible to add more java options

For local quick run : `mvn spring-boot:run` or `mvn spring-boot:run -Dspring.profiles.active=local` or use your IDE

You should see the app open and run through some tests.
