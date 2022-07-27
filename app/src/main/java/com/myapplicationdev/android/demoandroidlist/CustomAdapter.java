package com.myapplicationdev.android.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects) {

        super (context, resource, objects);

        this.parent_context = context;
        this.layout_id = resource; //layout file for the row
        this.versionList = objects;
    }

    @Override
    public View getView(int position/*position of the item*/, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id/*R.layout.row*/, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvVersion = rowView.findViewById(R.id.tvVersion);

        // Obtain the Android Version information based on the position
        AndroidVersion currentVersion = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }


}
