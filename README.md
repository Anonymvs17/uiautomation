# uiautomation
Example Serenity BDD with Selenium project

to start the project run:

`mvn clean compile test`

#run tests with different properties
You can use different serenity property files. 
By default serenity.properties will be selected, 
but you can start your test with a different property file.

Run with maven following command to run your test with with serenity-dev.properties

`clean compile test -Dproperties=serenity-dev.properties`
