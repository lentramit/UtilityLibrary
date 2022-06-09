package com.ix.lentra.myloglibrary

import android.util.Log

class LogUtility {
    companion object{
        fun showLog(tag:String,msg:String){
            Log.i(tag,msg)
            Log.d(tag,msg)
        }
    }
}