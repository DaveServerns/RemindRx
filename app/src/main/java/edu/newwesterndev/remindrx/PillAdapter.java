package edu.newwesterndev.remindrx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by phil on 2/25/17.
 */

public class PillAdapter extends BaseAdapter{

    Context context;
    ArrayList<String> daysOfTheWeek;

    public PillAdapter(Context context, ArrayList<String> daysOfTheWeek){

        this.context = context;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    @Override
    public int getCount() {
        return daysOfTheWeek.size();
    }

    @Override
    public Object getItem(int position) {
        return daysOfTheWeek.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);
        textView.setText(daysOfTheWeek.get(position));
        textView.setTextSize(50);

        return textView;
    }










}
