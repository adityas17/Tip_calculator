package com.example.tip_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1: TextView = findViewById(R.id.textview1)
        val text2: TextView = findViewById(R.id.textview2)
        val text3: TextView = findViewById(R.id.textview3)
        val seek: SeekBar = findViewById(R.id.seek)
        val edit: EditText = findViewById(R.id.dit)
        val btn: Button = findViewById(R.id.btnle)
        btn.setOnClickListener(){
            val x = edit.text.toString().toInt()
            seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    text1.text = p1.toString()
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

            })

        }
    }
}


