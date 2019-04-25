# MyLibraryApp
Sample library .aar file testing

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sam43:MyLibraryApp:0.0.2'
	}


Useage: 

In kotlin: Just put these lines in any method/functions and see result in logcat using tag "+++LoggingClass"

	LoggingClass.debug("Your message")
	LoggingClass.error("Your message")
	LoggingClass.info("Your message")
	LoggingClass.warning("Your message")
