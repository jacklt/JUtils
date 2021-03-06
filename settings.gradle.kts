dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android-utils-ktx"
include(":sample")
include(":easyfrc")
include(":commonintent")
include(":slf4j-logger")
