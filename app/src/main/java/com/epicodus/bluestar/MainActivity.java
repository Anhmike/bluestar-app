package com.epicodus.bluestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.viewDonutsButton) Button mViewDonutsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mViewDonutsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mViewDonutsButton) {
            Intent intent = new Intent(MainActivity.this, DonutListActivity.class);
            startActivity(intent);
        }
    }
}
