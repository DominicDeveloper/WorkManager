package com.asadbek.workmanager.manager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class TaskUpload(context: Context,workerParameters:WorkerParameters):Worker(context,workerParameters){
    private val TAG = "Ishni yuklash"
    override fun doWork(): Result {

        doingwork()

        return Result.success()
    }

    private fun doingwork() {
        Log.d(TAG, "doingwork: Ishlayabdi")
        // enter code here what you want to do
    }


}