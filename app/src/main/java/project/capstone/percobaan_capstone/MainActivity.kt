package project.capstone.percobaan_capstone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import project.capstone.percobaan_capstone.databinding.ActivityMainBinding
import project.capstone.percobaan_capstone.detection.FaceDetectActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frameemojiBtn.setOnClickListener {
            startActivity(Intent(this,FaceDetectActivity::class.java))
        }
    }
}


