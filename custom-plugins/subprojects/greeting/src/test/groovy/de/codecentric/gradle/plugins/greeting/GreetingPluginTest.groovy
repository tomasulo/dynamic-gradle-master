package de.codecentric.gradle.plugins.greeting

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert;
import org.junit.Test

class GreetingPluginTest {
	
	@Test
	public void greeterPluginAddsGreetingTaskToProject() {
		
		Project project = ProjectBuilder.builder().build()
		project.pluginManager.apply 'greeting'

		Assert.assertTrue(project.tasks.hello instanceof GreetingTask)
	}
}
