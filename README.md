# uiautomation
Example Serenity BDD with Selenium project

#Run tests
To run your test just go to the base directory and run:
`mvn clean compile verify`

#Run tests with different properties
You can use different serenity property files.
By default serenity.properties will be selected,
but you can start your test with a different property file.

Run with maven following command to run your test with with serenity-dev.properties

`mvn clean compile test -Dproperties=serenity-dev.properties`

#Configuration on Jenkins

To correctly shown the css of the Serenity BDD reports, following configuration
is required:
* On jenkins go to manage jenkins
* Script console
* Type following command in the script console:
`System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "")`
