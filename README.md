# CUSTOM TOAST

customtoast is a android library for show your toast message in a custom UI.

## To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

in gradle.....

```bash
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

in gradle.....


```bash
dependencies {
	        implementation 'com.github.ebinumer:CustomToast:1.0.0'
	}
```


## Usage

 Add the below code and fill your details where you want to show the custom toast

```python
  CustomToast.showToast(context,"Tost Message", <icon from src> , <color of text>,<color of toast background>, <color of icon background>)

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

