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
