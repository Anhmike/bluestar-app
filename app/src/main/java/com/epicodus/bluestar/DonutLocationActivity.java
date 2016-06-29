package com.epicodus.bluestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DonutLocationActivity extends AppCompatActivity {

    @Bind(R.id.donutLocationListView) ListView mDonutLocationListView;

    private String[] locations = new String[] {
            "3549 SE Hawthorne Blvd. Portland, OR 97214",
            "1237 SW Washington St. Portland, OR 97205",
            "921 NW 23rd Ave. Portland, OR 97205",
            "3753 N Mississippi Ave. Portland, OR 97227",
            "1142 Abbot Kinney Blvd. Los Angeles, CA 90291"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_location);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, locations);
        mDonutLocationListView.setAdapter(adapter);
    }
}
