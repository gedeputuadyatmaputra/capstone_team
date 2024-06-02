package project.capstone.percobaan_capstone

import android.content.Context
import android.util.Log
import java.io.IOException

object ImgClassifier {
    // Function to load labels from labels.txt
    fun loadLabels(context: Context): List<String> {
        val labels: MutableList<String> = mutableListOf()
        try {
            context.assets.open("facedetect.txt").use { inputStream ->
                labels.addAll(inputStream.bufferedReader().readLines())
            }
        } catch (e: IOException) {
            e.printStackTrace()
            Log.e("ImgClassifier", "Error loading labels: ${e.message}")
        }
        return labels
    }
}
