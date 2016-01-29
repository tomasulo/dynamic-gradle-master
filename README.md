# Dynamic Master Readme

## Benutzung

Der Master lädt bei erstmaliger Benutzung alle Projekte die auf der gleichen Ebene wie er liegt. Wenn die Projekte danach erneuert werden sollen muss der Parameter -PrefreshProjects beim Buildaufruf mitgegeben werden.


## Custom Plugins

Im Order 'custom-plugins' liegen die Plugins 'greeting' und 'print' welche ohne den Master gebaut werden. Damit sie verwendet werden können müssen sie mit ./gradlew install ins lokale Maven Repository 'deployed' werden.

Dann können sie mit 

buildscript {
	repositories {
		mavenLocal()
	}
	dependencies {
		classpath "de.codecentric.gradle.plugins:greeting:1.0.1-SNAPSHOT"
		classpath "de.codecentric.gradle.plugins:print:1.0.1-SNAPSHOT"
	}
}

verwendet werden.

