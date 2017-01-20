# The Dynamic Gradle Master





## Usage

The dynamic master automatically includes all projects on the same level as subprojects. For this example `gradlew projects` produces this:

    Root project 'master'
    +--- Project ':project_a'
    +--- Project ':project_b'
    +--- Project ':project_c'
    +--- Project ':project_d'
    \--- Project ':project_e'

If you now decide to remove or add another project you have to add `-PrefreshProjects` to your Gradle command to trigger a refresh.

