package com.ebinumer.customtoast

import android.annotation.SuppressLint
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide


object CustomToast {
    @SuppressLint("ResourceAsColor")
    fun showToast(context:Context,message: String, icon: Int,textColor:Int = R.color.white ,toastBackgroundColor:Int = R.color.black,
                  iconBackgroundColor:Int = R.color.white, isLong: Boolean = false) {
        val li = LayoutInflater.from(context)
        val layouttoast = li.inflate(R.layout.toastcustom, null) as ViewGroup
        val textView = layouttoast.findViewById(R.id.text_toast) as TextView
        val toastIcon=layouttoast.findViewById<ImageView>(R.id.icon_src)
        val iconBackground=layouttoast.findViewById<LinearLayout>(R.id.card_icon)
        textView.text = message + ""
        textView.setTextColor(ContextCompat.getColor(context,textColor))

        Glide.with(toastIcon)
            .asDrawable()
            .load(ContextCompat.getDrawable(context, icon))
            .into(toastIcon)

        iconBackground.setBackgroundColor(ContextCompat.getColor(context,iconBackgroundColor))
        layouttoast.backgroundTintList = ContextCompat.getColorStateList(context, toastBackgroundColor)


        val scale = context.resources.displayMetrics.density
        val mytoast = Toast(context)
        mytoast.view = layouttoast
        val offsetY = (100 * scale).toInt()
        mytoast.setGravity(Gravity.BOTTOM,0, offsetY)
        mytoast.duration = if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        mytoast.show()
    }
}
