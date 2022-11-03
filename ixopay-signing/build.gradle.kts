plugins {
	`java-library`
	`maven-publish`
}

group = "com.ixopay.java-ixopay"
version = "3.0.0"

repositories {
	mavenCentral()
}

configurations {
	create("example") {
		extendsFrom(configurations.api.get())
	}
}

sourceSets {
	create("example") {
		java {
			compileClasspath += sourceSets.main.get().output
			runtimeClasspath += sourceSets.main.get().output
		}
	}
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(11))
	}

	withSourcesJar()
	withJavadocJar()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
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