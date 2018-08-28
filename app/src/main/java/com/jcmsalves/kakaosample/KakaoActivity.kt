package com.jcmsalves.kakaosample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_kakao.*

class KakaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kakao)

        button_update.setOnClickListener {
            text_view_hello.text = "Hello Kakao World!"
            image_view_kakao.visibility = View.VISIBLE
        }

    }
}
