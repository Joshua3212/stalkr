import utils.Logger
import java.io.File

class FileWriter(logFilePath: String, logInfo: Boolean) {

    private val file = File(logFilePath)
    private val logInfo = logInfo


    init {
        Logger.info("FilesWriter started")

    }

    fun writeLine(line: String) {
        file.appendText(line + "\n")
    }


    fun write(line: String) {
        file.appendText(line)
    }

    fun writeInfo(line: String) {
        if (logInfo) {
            file.appendText("#  [INFO]  ${line}\n")
        }
    }

}