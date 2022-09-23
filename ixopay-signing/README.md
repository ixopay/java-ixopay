
# README

[![Release](https://jitpack.io/v/com.ixopay/java-ixopay.svg)](https://jitpack.io/#com.ixopay/java-ixopay)

## Using the library

See [`src/example/java`](src/example/java) for examples on how to integrate the library.

The library contains helpers to correctly sign an outgoing HTTP request and verify an incoming HTTP request.

### Gradle

<details>
<summary>build.gradle</summary>

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
	implementation 'com.ixopay.java-ixopay:ixopay-signing:VERSION'
	...
}
```

</details>

<details open>
<summary>build.gradle.kts</summary>

Add the [jitpack.io](https://jitpack.io) repository:
```kotlin
repositories {
	// ...
	maven("https://jitpack.io")
}
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/ixopay/java-ixopay/releases)):
```kotlin
dependencies {
	// ...
	implementation("com.ixopay.java-ixopay:ixopay-signing:VERSION")
	// ...
}
```

</details>

### Maven

<details open>
<summary>pom.xml</summary>

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
	<groupId>com.ixopay.java-ixopay</groupId>
	<artifactId>ixopay-signing</artifactId>
	<version>VERSION</version>
</dependency>
```

</details>