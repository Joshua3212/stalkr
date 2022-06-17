package utils

import java.time.LocalTime

object Logger {

    private fun log(msg: String) {
        println(msg)
    }

    fun info(msg: String) {
        log("[${LocalTime.now()}]   [INFO]   $msg")
    }


    fun error(msg: String) {
        log("[${LocalTime.now()}]   [ERROR]   $msg")
    }
}