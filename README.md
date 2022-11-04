
# README

[![Release](https://jitpack.io/v/com.ixopay/java-ixopay.svg)](https://jitpack.io/#com.ixopay/java-ixopay)

## Using the library

The library consists of two parts.
First `ixopay-api-core` which contains an API client generated from the OpenAPI spec of ixopay.
Second `ixopay-signing` which contains helpers to correctly sign outgoing HTTP requests and verify incoming HTTP requests.

### Gradle

<details>
<summary>build.gradle</summary>

Add the [jitpack.io](https://jitpack.io) repository:
```gradle
repositories {
	// ...
	maven { url 'https://jitpack.io' }
}
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/ixopay/java-ixopay/releases)):
```gradle
dependencies {
	// ...
	implementation 'com.ixopay.java-ixopay:ixopay-api:VERSION'
	// ...
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
	implementation("com.ixopay.java-ixopay:ixopay-api:VERSION")
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
	<artifactId>ixopay-api</artifactId>
	<version>VERSION</version>
</dependency>
```

</details>

## Example

https://github.com/ixopay/java-ixopay/blob/15c2d0d5105d16777e2e144f32da8c90039d12f2/ixopay-examples/src/main/java/com/ixopay/client/examples/DebitTransactionApp.java#L27-L71

https://github.com/ixopay/java-ixopay/blob/develop/ixopay-examples/src/main/java/com/ixopay/client/examples/DebitTransactionApp.java#L27-L71
