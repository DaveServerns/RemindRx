package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.os.Bundle;

public class SaturdayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);
        this.setTitle("Saturday");
    }
}
