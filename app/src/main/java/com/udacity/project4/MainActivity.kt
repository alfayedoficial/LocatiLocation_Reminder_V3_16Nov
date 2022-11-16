package com.udacity.project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var txtView : TextView? = null
    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.tvText)
        btn = findViewById(R.id.btnClick)

        btn?.setOnClickListener {
            txtView?.visibility = if (txtView?.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
        }
    }
}