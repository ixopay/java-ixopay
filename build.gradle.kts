
allprojects {
	version = "3.0.0-SNAPSHOT"
	group = "com.ixopay.java-ixopay"

	repositories {
		mavenCentral()
	}
}

plugins {
	`java-library`
	`maven-publish`
}

dependencies {
	api(project(":ixopay-signing"))
	api(project(":ixopay-api-core"))
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
