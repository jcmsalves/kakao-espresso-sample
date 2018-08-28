package com.jcmsalves.kakaosample

import com.agoda.kakao.*

class KakaoScreen : Screen<KakaoScreen>() {

    val helloTextView: KTextView =
        KTextView { withId(R.id.text_view_hello) }

    val button: KButton =
        KButton { withId(R.id.button_update) }

    val imageView: KImageView =
        KImageView { withId(R.id.image_view_kakao) }
}
