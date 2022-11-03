import com.github.jk1.license.filter.LicenseBundleNormalizer
import com.github.jk1.license.render.InventoryHtmlReportRenderer

allprojects {
	version = "3.0.0"
	group = "com.ixopay.java-ixopay"

	repositories {
		mavenCentral()
	}
}

plugins {
	`java-library`
	`maven-publish`
	id("com.github.jk1.dependency-license-report") version "2.0"
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(11))
	}

	withSourcesJar()
	withJavadocJar()
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

licenseReport {
	renderers = arrayOf(
		InventoryHtmlReportRenderer()
	)

	filters = arrayOf(
		LicenseBundleNormalizer()
	)
}
