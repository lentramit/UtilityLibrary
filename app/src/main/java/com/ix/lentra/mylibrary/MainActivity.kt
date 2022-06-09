package com.ix.lentra.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ix.lentra.myloglibrary.LogUtility

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtility.showLog("Amit","Log from UtilityLibrary")
    }
}