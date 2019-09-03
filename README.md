
# README

[![Release](https://jitpack.io/v/ixopay/java-ixopay.svg)](https://jitpack.io/#ixopay/java-ixopay)

## Using the library

See [`src/example/java`](src/example/java) for examples on how to integrate the library.

There is no HTTP client library included to keep the library small and you can use any Java HTTP client of your choosing. 

The library consists of two parts.
First `com.ixopay.client.model` which contains JAXB models for all payment gateway operations.
Second `com.ixopay.client.signing` which contains helpers to correctly sign an HTTP request and to hash transmitted passwords.

### Gradle

Add the [jitpack.io](https://jitpack.io) repository:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/ixopay/java-ixopay/releases)):
```gradle
dependencies {
	...
	compile 'com.ixopay:java-ixopay:VERSION'
	...
}
```

### Maven

Add the [jitpack.io](https://jitpack.io) repository:

```maven
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/ixopay/java-ixopay/releases)):
 ```maven
<dependency>
    <groupId>com.ixopay</groupId>
    <artifactId>java-ixopay</artifactId>
    <version>VERSION</version>
</dependency>
```
