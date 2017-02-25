package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.os.Bundle;

public class TuesdayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
        this.setTitle("Tuesday");
    }
}
