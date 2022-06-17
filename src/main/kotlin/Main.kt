fun main(args: Array<String>) {

    val config = ConfigReader("./config.json")
    val fileWriter = FileWriter(config.configAsJson.logFile, config.configAsJson.logInfo)
    val runner = Runner(config.configAsJson.startupCommand, fileWriter)


}
