package com.epicodus.bluestar;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;


public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void listOfDonutsIsDisplayedOnButtonClick() {
        onView(withId(R.id.viewDonutsButton)).perform(click());
        onView(withId(R.id.donutListTextView)).check(matches(withText("Our Donut Menu:")));
    }
}
