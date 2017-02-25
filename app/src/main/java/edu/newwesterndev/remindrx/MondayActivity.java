package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MondayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        this.setTitle("Monday");

        LinearLayout mondayLayout = (LinearLayout) findViewById(R.id.activity_monday);

        Intent mondayIntent = getIntent();
    }
}
