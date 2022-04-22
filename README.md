How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:


gradle.....

 	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  .......
  
  Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.ebinumer:CustomToast:1.0.0'
	}
  
  Step 3. Add this code where you want to show toast
    
        CustomToast.showToast(context,"Tost Message", <icon from src> , <color of text>,<color of toast background>, <color of icon background>)
