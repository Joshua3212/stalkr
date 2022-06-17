import com.google.gson.Gson
import com.google.gson.GsonBuilder
import utils.Config
import utils.Logger
import java.io.File
import kotlin.system.exitProcess


class ConfigReader(configFilePath: String) {

    val configFilePath = configFilePath
    val configFile = File(configFilePath)
    var gson = Gson()
    var gsonBuilder = GsonBuilder().setPrettyPrinting().create()
    var configAsJson: Config = Config()

    init {
        if (!configFile.exists()) {
            Logger.error("Config file not found: $configFilePath")

            Logger.info("Creating config file...")
            configFile.createNewFile()
            configFile.writeText(gsonBuilder.toJson(Config()))

            
            exitProcess(1)
        }

        configAsJson = gson.fromJson(configFile.readText(), Config::class.java)

    }


}