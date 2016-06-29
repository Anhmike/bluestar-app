package com.epicodus.bluestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import butterknife.Bind;
import butterknife.ButterKnife;

public class DonutListActivity extends AppCompatActivity {

    @Bind(R.id.donutListView) ListView mDonutListView;

    private String[] donuts = new String[] {
            "The OG",
            "Mexican Hot Chocolate",
            "Maple Bacon",
            "Rose Hibiscus",
            "Chocolate Salted Almond",
            "The Old Fashioned",
            "Vanilla Cake",
            "Blue Bourbon & Basil",
            "Lemon Poppyseed",
            "Banana Walnut Fritter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_list);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, donuts);
        mDonutListView.setAdapter(adapter);
    }
}
