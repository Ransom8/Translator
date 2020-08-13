package com.example.translator

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import java.util.*


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setAppLocale("fr")
        setContentView(R.layout.activity_main)
    }

    private fun setAppLocale(localeCode: String) {
        val res: Resources = resources
        val dm: DisplayMetrics = res.displayMetrics
        val conf: Configuration = res.configuration
        conf.setLocale(Locale(localeCode.toLowerCase()))
        res.updateConfiguration(conf, dm)
    }
}


//fun onRadioButtonClicked(view: View) {
//    if (view is RadioGroup) {
//        // Is the button now checked?
//        val checked = view.isChecked
//        // Check which radio button was clicked
//        when (view.getId()) {
//            R.id.radioButton ->
//                if (checked) {
//                    // English
//                }
//            R.id.radioButton2 ->
//                if (checked) {
//                    // French
//                }
//            R.id.radioButton3 ->
//                if (checked) {
//                    // Spanish
//                }
//        }
//    }
//}