package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class SundayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);
        this.setTitle("Sunday");

        LinearLayout sundayLayout = (LinearLayout) findViewById(R.id.activity_sunday);

        Intent sundayIntent = getIntent();

        String message = sundayIntent.getStringExtra("message key");




    }
}
