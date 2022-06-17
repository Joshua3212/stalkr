import utils.Logger

class Runner(startupCommand: String, fileWriter: FileWriter) {


    init {
        Logger.info("Runner running command...")
        fileWriter.writeInfo("Running command...")
        val process = Runtime.getRuntime().exec(startupCommand)
        val bufferedReader = process.inputStream.bufferedReader()
        bufferedReader.use { it ->
            it.lines().forEach {
                fileWriter.writeLine(it)
            }
        }

        process.waitFor()


        fileWriter.writeInfo("Exit code: ${process.exitValue()}")
        Logger.info("Runner finished with status code ${process.exitValue()}")

    }
}
