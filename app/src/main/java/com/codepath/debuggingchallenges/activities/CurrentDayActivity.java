package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        tvDay = (TextView) findViewById(R.id.tvDay);
        //Fixed bug by converting int to string b/c setText takes in a string
        tvDay.setText(Integer.toString(getDayOfMonth()));
        //Log.i("myapp", "currday act created");
    }

    private int getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        //Log.i("myapp", Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
