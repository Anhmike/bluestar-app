package com.epicodus.bluestar;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView introTextView = (TextView) activity.findViewById(R.id.introTextView);
        assertTrue("Our donuts are made from a classic brioche recipe that originated in the south of France. The dough takes 18 hours to make and is made from scratch every day; we start with a sustainable bread flour from Shepherds Grain, add cage free eggs, whole hormone-free milk, and then fold in a European-style butter. Our donuts, glazes, and fillings are made fresh throughout the day, and we only cook our donuts in rice oil. Selections change daily and sell out quickly.".equals(introTextView.getText().toString()));
    }

    @Test
    public void donutListActivityStarted() {
        activity.findViewById(R.id.viewDonutsButton).performClick();
        Intent expectedIntent = new Intent(activity, DonutListActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}
