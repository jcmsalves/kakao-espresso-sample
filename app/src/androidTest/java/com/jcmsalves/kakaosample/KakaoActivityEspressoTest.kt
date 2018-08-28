package com.jcmsalves.kakaosample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoActivityEspressoTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<KakaoActivity>(KakaoActivity::class.java)

    @Test
    fun initialViewsDisplayedProperly() {
        onView(withId(R.id.button_update)).check(matches(isDisplayed()))
        onView(withId(R.id.text_view_hello)).check(matches(isDisplayed()))
        onView(withId(R.id.image_view_kakao)).check(matches(not(isDisplayed())))
        onView(withId(R.id.text_view_hello))
            .check(matches(withText(containsString("Hello World!"))))
    }

    @Test
    fun textShouldBeUpdateAndImageDisplayedOnButtonClick() {
        onView(withId(R.id.button_update)).perform(click())
        onView(withId(R.id.image_view_kakao)).check(matches(isDisplayed()))
        onView(withId(R.id.text_view_hello))
            .check(matches(withText(containsString("Hello Kakao World!"))))
    }
}
