fun main() {

    val config = ConfigReader("./config.json")
    val fileWriter = FileWriter(config.configAsJson.logFile, config.configAsJson.logInfo)
    Runner(config.configAsJson.command, fileWriter)


}
