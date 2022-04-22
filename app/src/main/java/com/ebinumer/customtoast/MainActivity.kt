package com.ebinumer.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomToast.showToast(this,"welcome to custom toast",
            R.drawable.shopping_cart ,
            R.color.white,
            R.color.black,
            R.color.white,
        )
    }
}