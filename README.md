# wh-interview
To run the test on Chrome desktop browser use maven and run the command:
mvn clean test "-Dcucumber.options=--tags @football" -Dbrowser.type=Desktop

To run the test on Chrome mobile browser use maven and run the command:
mvn clean test "-Dcucumber.options=--tags @football" -Dbrowser.type=Mobile

Note: Mobile page objects are not implemented yet, so please remember that test can fail because of that.
