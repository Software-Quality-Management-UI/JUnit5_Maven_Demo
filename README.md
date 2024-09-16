A sample project with JUnit 5.11 showcasing JUnit 5 testing, including native
test suites and test coverage. Reproducibility of the environment is guaranteed
with `pixi` and the `conda-ecosystem`.

This project is a Maven project that can be cloned via `git clone` and also be
used within IDEs.

The files in `.settings`, `.classpath`, and `.project` are specific to the
Eclipse IDE, and can be ignored.


`mvn test` runs all test cases declared in class `AlltestsUsingSelectClasses` (see `pom.xml` file) and creates via JaCoCo a test coverage report that can be found in `target/site/jacoco/`. 

If you want to use this project with a Java IDE:
- IntelliJ: Start a new project from version control, i.e. clone this project.
  IntelliJ should identify this as an Eclipse project using Maven and ask for
  the project style to use. It does not matter what you chose, because both
  styles give you exactly the same project setup.
- Visual Studio Code: Clone the repository (Help -> Show All Commands -> Type
  in: `Git: Clone`. This should be enough.
- Eclipse: see steps below:

Import to Eclipse via: 

- File->Import->Git->Projects from Git 
  + *(Note: do __not__ use "with smart import")* 
- *Select* Clone URI
- *paste Clone URI as* URI
- *(i.e.* import `main` branch *)*
- *(to confirm your local directory location to clone to)*
- *(to confirm* Import existing Eclipse projects *)*
- Finish
  + Profit

This should have given you a new project: `junit5demoWithMaven`

In Eclipse, you can run test cases using the Eclipse GUI test runner (`Run as >
JUnit Test`) or via Maven (`Run as > Maven test`) or simply use Maven on the
command line (but be aware that Eclipse caches files and does not notice if you
change files outside of Eclipse unless you press F5 to refresh).

Some paths may need to be setup to use the `pixi` configured `java` and `maven`,
as should have been completed for the previous assignment.
