package de.codecentric.gradle.plugins.print

import org.gradle.api.Plugin
import org.gradle.api.Project

class PrintPlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {
		project.task("printProjectName") << { println project.getName() }
	}
}
