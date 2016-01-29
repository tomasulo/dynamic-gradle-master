package de.codecentric.gradle.plugins.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask{
	
	def message
	def greeter
	
	@TaskAction
	def greet() {
		println "$message from $greeter"
	}
}