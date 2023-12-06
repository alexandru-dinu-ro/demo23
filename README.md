# Project: demo23 (a.k.a. leaseplan-example)

### Changes:

- removed all Gradle related files and folders (not needed)
- updated .github/workflows/maven.yml (to run tests on GitHub CI)
- removed .idea/ (not needed)
- removed .m2/ (not needed)
- removed history/ (not needed)
- removed src/main/ (not needed)
- removed src/test/java/starter/stepdefinitions/CarsAPI.java (not needed)
- renamed src/test/java/starter/stepdefinitions/ -> src/test/java/org/example/step_definitions/ (
  personal preference)
- renamed SearchStepDefinitions.java -> SearchForProductSD.java (more specific name)
- updated SearchForProductSD.java (removed unnecessary methods, added new ones)
- updated TestRunner.java (glue, features, tags)
- removed src/test/resources/serenity.conf (not needed)
- updated src/test/resources/logback-test.xml (updated logging level)
- renamed src/test/resources/features/search/post_product.feature -> search_for_product.feature (
  more specific name)
- updated search_for_product.feature (added tests)
- removed target/ (not needed)
- removed all .DS_Store files (not needed)
- removed LICENSE (not needed)
- updated pom.xml (updated project name)
- updated README.md (updated with changes, setup etc.)
- updated serenity.properties (updated project name)

### Project setup:

- install JDK, Maven and preferably an IDE
- download and extract: https://github.com/alexandru-dinu-ro/demo23/archive/refs/heads/main.zip

### How to run tests:

- build project: mvn -B package --file pom.xml
- run tests: mvn verify
- generate aggregated serenity report: mvn serenity:aggregate --file pom.xml
- location of the serenity report file is: target/site/serenity/index.html

### In order to modify the test suite, update the following parameters in TestRunner.java:

- features: feature folders to be included in the test suite
- tags: tags of specific tests to be included in the test suite

### How to add a new test:

- create a .feature file in src/test/resources/features/ and use Gherkin language to write the
  test (use search_for_product.feature as an example)
- create one or more step definition java classes in src/test/java/org/example/step_definitions/
  with step methods (use SearchForProductSD.java as an example)
- update TestRunner.java as needed (explained in previous step)
- for more info on how to use Serenity go
  to: https://serenity-bdd.github.io/docs/tutorials/first_test
