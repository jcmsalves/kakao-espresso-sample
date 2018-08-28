package com.jcmsalves.kakaosample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoActivityKakaoTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<KakaoActivity>(KakaoActivity::class.java)

    private val kakaoScreen = KakaoScreen()

    @Test
    fun initialViewsDisplayedProperly() {

        kakaoScreen {
            button { isDisplayed() }
            helloTextView {
                isDisplayed()
                hasText("Hello World!")
            }
            imageView { isNotDisplayed() }
        }
    }

    @Test
    fun textShouldBeUpdateAndImageDisplayedOnButtonClick() {
        kakaoScreen {
            button { click() }
            helloTextView {
                isDisplayed()
                hasText("Hello Kakao World!")
            }
            imageView { isDisplayed() }
        }
    }
}
