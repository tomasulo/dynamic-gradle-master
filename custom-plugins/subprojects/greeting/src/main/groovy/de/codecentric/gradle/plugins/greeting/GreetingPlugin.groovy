package de.codecentric.gradle.plugins.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
	@Override
	void apply(Project project) {
		project.extensions.create("greeting", GreetingPluginExtension)
		project.tasks.create("hello", GreetingTask)
	}
}