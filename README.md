# selenium-example
Example of using Selenium.
The example will open google and search for "d-hershkovitz github". It will later confirm it appears in the result page.

# Maven
project created using maven command:
mvn archetype:generate -DgroupId=com.dean -DartifactId=selenium-example -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

To fetch the sourcecs:
mvn clean
mvn eclipse:eclipse -DdownloadSources=true -DdownloadJavadocs=true

# Gecko Driver
place the geckodriver in the project directory OR replace the path in BasicTest class setUp method.


