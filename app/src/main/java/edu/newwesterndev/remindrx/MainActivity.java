package edu.newwesterndev.remindrx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    View parentLayout;
    ArrayList<String> daysOfWeek;
    String message = "message key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentLayout = findViewById(R.id.activity_main);

        GridView pillDayList = (GridView) findViewById(R.id.pillDayList);

        daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        PillAdapter pillAdapter = new PillAdapter(this, daysOfWeek);

        pillDayList.setAdapter(pillAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent myIntent = null;

                if(position == 0){
                    myIntent = new Intent(view.getContext(), SundayActivity.class);
                }
                if(position == 1){
                    myIntent = new Intent(view.getContext(), MondayActivity.class);
                }

                if(position == 2){
                    myIntent = new Intent(view.getContext(), TuesdayActivity.class);
                }

                if(position == 3){
                    myIntent = new Intent(view.getContext(), WednesdayActivity.class);
                }

                if(position == 4){
                    myIntent = new Intent(view.getContext(), ThursdayActivity.class);
                }

                if(position == 5){
                    myIntent = new Intent(view.getContext(), FridayActivity.class);
                }

                if(position == 6){
                    myIntent = new Intent(view.getContext(), SaturdayActivity.class);
                }

                startActivity(myIntent);
            }
        };

        pillDayList.setOnItemClickListener(onItemClickListener);




    }
}
