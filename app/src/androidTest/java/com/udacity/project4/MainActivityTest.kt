package com.udacity.project4

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Matchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest{

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun listGoesOverTheFold() {
        // click on the button and visibility of the text view will be toggled
        Espresso.onView(withId(R.id.btnClick)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvText))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        // check that the text was changed.

        //make delay time to see the result
        Thread.sleep(2000)
        Espresso.onView(withId(R.id.btnClick)).perform(ViewActions.click())
        // un match isDisplayed() to check that the text was changed.
        Espresso.onView(withId(R.id.tvText)).check(ViewAssertions.matches(Matchers.not(ViewMatchers.isDisplayed())))
    }
}