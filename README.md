# Toaster
[![](https://jitpack.io/v/arnavs-0/Toaster.svg)](https://jitpack.io/#arnavs-0/Toaster)
[![Known Vulnerabilities](https://snyk.io/test/github/arnavs-0/Toaster/badge.svg)](https://snyk.io/test/github/arnavs-0/Toaster)
[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Farnavs-0%2FToaster&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=Views&edge_flat=false)](https://hits.seeyoufarm.com)



Material Design Style Toasts, for Android

### Screenshots

<div align="center">
	<img src="https://github.com/arnavs-0/Toaster/blob/main/art/toaster.gif?raw=true" width="200">
	<img src="https://github.com/arnavs-0/Toaster/blob/main/art/toastcollage.jpg?raw=true" width="100">
</div>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.arnavs-0:Toaster:1.0.1'
}
```

## Usage

Each method always returns a `Toast` object, so you can customize the Toast. **DON'T FORGET THE `show()` METHOD!**

To display a success Toast:

``` java
Toaster.makeText(this, "Success", Toaster.LENGTH_SHORT, Toaster.SUCCESS).show();
```
To display an error Toast:

``` java
Toaster.makeText(this, "Error", Toaster.LENGTH_SHORT, Toaster.ERROR).show();
```
To display a warning Toast:

``` java
Toaster.makeText(this, "Warning", Toaster.LENGTH_SHORT, Toaster.WARNING).show();
```
To display an info Toast:

``` java
Toaster.makeText(this, "Info", Toaster.LENGTH_SHORT, Toaster.INFO).show();
```
To display a normal Toast:

``` java
Toaster.makeText(this, "Success", Toaster.LENGTH_SHORT, Toaster.DEFAULT).show();
```


### Advanced

You can also make custom toasts as well with a custom background and icon. You need to have a drawable that follows these standards:

``` xml
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <!--Shadow-->
            <solid android:color="#7B1FA2" />
            <corners android:radius="5dp" />
        </shape>
    </item>

    <item android:bottom="4px">
        <shape android:shape="rectangle">
            <solid android:color="#C2185B" />
            <corners android:radius="5dp" />
        </shape>
    </item>
</layer-list>
```
[Custom.xml](https://github.com/arnavs-0/Toaster/blob/main/app/src/main/res/drawable/custom.xml)

The icon must also be a drawable as well.

[icon.xml](https://github.com/arnavs-0/Toaster/blob/main/app/src/main/res/drawable/ic_baseline_android_24.xml)

How to add custom icon and background:

``` java
 Toaster.makeTextCustom(this, "Custom with Icon", Toaster.LENGTH_SHORT, 
         this.getDrawable(R.drawable.custom), this.getDrawable(R.drawable.ic_baseline_android_24)).show();
```

How to add custom background and custom text color: (Text must be in hex format)

``` java
Toaster.makeTextBackground(this, "Custom No Icon", Toaster.LENGTH_SHORT,
                    this.getDrawable(R.drawable.custom), "#000000").show();
```

Have a question or issue? Open a issue
 
