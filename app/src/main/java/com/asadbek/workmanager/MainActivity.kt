package com.asadbek.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.asadbek.workmanager.databinding.ActivityMainBinding
import com.asadbek.workmanager.manager.TaskUpload
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            //1 marta ishlaydi
            // val workRequest = OneTimeWorkRequestBuilder<UpLoadWork>().build()
            // WorkManager.getInstance(this).enqueue(workRequest)
            // minutiga 1 marta deb shart beryapmiz. Servicelar tizim optimatsiyasini hisobga olib minimal 15 min da ishlaydi
            val workRequest2 = PeriodicWorkRequestBuilder<TaskUpload>(1, TimeUnit.MINUTES).build()
            WorkManager.getInstance(this).enqueue(workRequest2)
        }

    }
}