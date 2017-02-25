package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    View parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentLayout = findViewById(R.id.activity_main);

        ListView pillList = (ListView) findViewById(R.id.pillList);

        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        PillAdapter pillAdapter = new PillAdapter(this, daysOfWeek);

        pillList.setAdapter(pillAdapter);


    }
}
