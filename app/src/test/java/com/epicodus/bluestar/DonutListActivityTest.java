package com.epicodus.bluestar;

import android.os.Build;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class DonutListActivityTest {
    private DonutListActivity activity;
    private ListView mDonutListView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(DonutListActivity.class);
        mDonutListView = (ListView) activity.findViewById(R.id.donutListView);
    }

    @Test
    public void donutListViewPopulates() {
        assertNotNull(mDonutListView.getAdapter());
        assertEquals(mDonutListView.getAdapter().getCount(), 10);
    }
}
