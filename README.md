#To run tests over the jenkins, specify following top-level maven target as a build part:

clean test -Dcucumber.options="--tags @driver"
####you can specify any tags that are available in your project

###To run smoke test use:

clean test -P Smoke
###To start regression execute:

clean test -P Regression
###To run feature files in parallel without limiting number of threads:

<parallel>methods</parallel>
<useUnlimitedThreads>true</useUnlimitedThreads>
<includes>
  <include>**/RegressionRunner.java</include>
</includes>
###To specify browser type, use parameter -Dbrowser=browserType:

clean test -Dbrowser=firefox
###To specify environment, use parameter -Denv=envType

mvn test -Denv=qa2
###To run regression on qa1 and chrome browser:

clean test -Dbrowser=chrome -Denv=qa1 -P Regression
###To run smoke test on qa2 and chrome firefox:

clean test -Dbrowser=firefox -Denv=qa2 -P Smoke
##NOTE: add mvn before every command if you are not running it on Jenkins:

mvn test -Dbrowser=firefox -Denv=qa2 -P Regression
####To read in Java something -Dparam use --> System.getProperty("param")