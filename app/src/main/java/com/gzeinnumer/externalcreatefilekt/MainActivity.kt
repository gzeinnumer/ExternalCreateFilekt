package com.gzeinnumer.externalcreatefilekt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gzeinnumer.externalcreatefilekt.helper.FunctionGlobalDir
import com.gzeinnumer.externalcreatefilekt.helper.FunctionGlobalFile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity_"

    var msg = "externalcreatefilekt\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = TAG

        if (FunctionGlobalFile.initFile("Send text to file.txt")) {
            if (FunctionGlobalDir.isFileExists(FunctionGlobalDir.appFolder + "/File.txt")) {
                msg += "File terbuat\n"
                tv.text = msg
            } else {
                msg += "File tidak terbuat\n"
                tv.text = msg
            }
        } else {
            msg += "File tidak terbuat\n"
            tv.text = msg
        }
    }
}