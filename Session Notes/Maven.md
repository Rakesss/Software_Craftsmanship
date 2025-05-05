
                                                          Maven Goals



Maven goals can be categorized into the following types based on their purpose:

1. Default Lifecycle Goals:

   * These goals are associated with the *default build lifecycle*, which includes phases like compile, test, package, install, and deploy.
   * Examples:

     * mvn compile
     * mvn test
     * mvn package

2. Clean Lifecycle Goals:

   * Used to clean up the project workspace.
   * Example:

     * mvn clean (deletes the target directory)

3. Site Lifecycle Goals:

   * Generate project documentation.
   * Examples:

     * mvn site
     * mvn site:deploy

4. Plugin Goals :

   * Each plugin can define its own goals.
   * Examples:

     * mvn surefire:test (from maven-surefire-plugin)
     * mvn dependency:tree (from maven-dependency-plugin)




                                                            How to Write Your Own Maven Goal



Step-by-step:*

1. Create a new Maven project
   

2. Create a Mojo (Maven plain Old Java Object)
   

3. Build the plugin
   

4. Use the plugin in another project:
   Add it to the pom.xml of the project where you want to use it
   

5. Run your goal
