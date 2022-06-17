package utils

data class Config(
    val logInfo: Boolean = true,
    val logToFile: Boolean = true,
    val logFile: String = "log.txt",
    val startupCommand: String = "unknown",
)