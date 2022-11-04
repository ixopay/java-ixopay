plugins {
	`java-library`
	`maven-publish`
}

group = "com.ixopay.java-ixopay"
version = "3.0.0"

repositories {
	mavenCentral()
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(11))
	}

	withSourcesJar()
	withJavadocJar()
}

dependencies {
	implementation(project(":ixopay-api-core"))
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			pom {
				from(components["java"])
				name.set("IXOPAY")
			}
		}
	}
}

tasks {
	test {
		useJUnitPlatform()
	}
}
