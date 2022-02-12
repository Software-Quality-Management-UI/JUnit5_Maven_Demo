A sample project with showcasing Continuous Integration with Maven compiling and running JUnit 5 tests. 

Directory `GitlabCIexamples` contains sample files that can be copied into the `.gitlab-ci.yml` file in the root directory. 

This project is a Maven project that can be cloned via `git clone` and at the same time also an Eclipse project (if you are not using Eclipse, ignore Eclipse configurations stored in `.settings`, `.classpath`,  `.project`). 


Import to Eclipse via: 

1. File 
1. Import 
1. Git
1. Projects from Git *(Note: do __not__ use "with smart import")* 
1. Next
1. *Select* Clone URI
1. *paste Clone URI as* URI
1. Next *(i.e.* import `main` branch *)*
1. Next *(to confirm your local directory location to clone to)*
1. Next *(to confirm* Import existing Eclipse projects *)*
1. Finish

This should have given you a new project: `CIdemo2022`. Note that Eclipse does by default not show files starting with a dot, e.g. `.gitlab-ci.yml` -- you need to change the *Filters...* setting in the *Package Explorer*.
