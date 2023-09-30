package com.example.naveeddemoapp


import android.content.res.Configuration
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check the current orientation
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land)
            setupLandscapeLayout()
        } else {
            setContentView(R.layout.activity_main)
            setupPortraitLayout()
        }
    }

    private fun setupPortraitLayout() {
        val portraitImageView = findViewById<ImageView>(R.id.portraitImageView)
        portraitImageView.setImageResource(R.drawable.portrait)
    }

    private fun setupLandscapeLayout() {
        val landscapeImageView = findViewById<ImageView>(R.id.landscapeImageView)
        landscapeImageView.setImageResource(R.drawable.landscape)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land)
            setupLandscapeLayout()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main)
            setupPortraitLayout()
        }
    }
}
