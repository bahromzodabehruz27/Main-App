package tj.behruz.mainapp

object AppSettings {
    const val compileSdk = "34.0.0"
    const val minSdk = 25
    const val targetSdk = 34
    val versionCode: Int = System.getenv("VERSION_CODE")?.toIntOrNull() ?: 1
    const val versionName = "1.1"

}