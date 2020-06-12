subprojects {
    repositories {
        jcenter()
    }
    dependencies {
        apply(plugin = "java-library")
        "testImplementation"("junit:junit:4.12")
    }
}