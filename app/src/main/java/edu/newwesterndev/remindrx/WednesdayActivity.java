package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.os.Bundle;

public class WednesdayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        this.setTitle("Wednesday");
    }
}
