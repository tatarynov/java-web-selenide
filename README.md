# This is example of Automation project
## Tech stack:
- Java 8 ([Install docs](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html))
- Gradle ([Install docs](https://gradle.org/install/))
- TestNG (Will be installed automatically)
- Selenide (Will be installed automatically)
- AssertJ (Will be installed automatically)


## Features
- Add some feature that are important in your opinion


## How to set environment for running tests
All browser driver will be downloaded automatically. How to set specific version - please refer to [Web Driver Manager docs](https://github.com/bonigarcia/webdrivermanager)

## Run App in development mode
There are options to run tests on different environments: 
- For deployed web-application on next environments: *test, demo, etc.* (example)
- For local environment use: *-Denv=local* system property


#### Tests parameters
###### To specify environment, please use next system properties:
```
-Denv=${env_value} 
```
e.g:
``` -Denv=test ``` or ``` -Denv=staging ``` or ``` -Denv=local ``` 

Default value is ```test```.


###### To specify browser, please use next system properties:
```
-Dbrowser=${browser_value} 
```
e.g:
``` -Dbrowser=chrome ``` or ``` -Dbrowser=firefox ```

Default value is 'chrome'.

###### To specify timeout for seeking element, please use next system properties:
```
-Dtimeout=${timeout_value_in_ms} 
```
e.g:
``` -Dtimeout=10000 ``` or ``` -Dtimeout=5000 ```

Default value is 'chrome'.


### Source code
Source code (git repo) is available at ```https://github.com/tatarynov/wix.git```


### Assumptions
- You already familiar with: Git, Java, Terminal/Command line implementation of your Operation System
- Application code will be located in (Unix): ```~/Projects``` or in (Windows) ```C:\Projects```

Use this command to download code base
```bash
cd PROJECT_DIR
git clone {URL}
```

Open terminal (Unix) or CMD prompt (MS Windows) and run following commands:
```bash
cd PROJECT_DIR
git pull
```
<br>

## Run tests


For MacOS platform:
```
./gradlew -Dsomeparameter=value test
```

For Windows platform:
```
gradle -Dsomeparameter=value test
```

## Reports


A HTML report will be generated in ```~/report``` directory.

