package com.gzeinnumer.externalcreatefilekt.helper

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.PrintWriter


object FunctionGlobalFile {
    //create file
    fun initFile(text: String): Boolean {
        val file = File(FunctionGlobalDir.getStorageCard + FunctionGlobalDir.appFolder + "/File.txt")
        return try {
            val f = FileOutputStream(file)
            val writer = PrintWriter(f)
            writer.println(text + "1")
            writer.println(text + "2")
            writer.println(text + "3")
            writer.flush()
            writer.close()
            f.close()
            true
        } catch (e: IOException) {
            e.printStackTrace()
            false
        }
    }
}
