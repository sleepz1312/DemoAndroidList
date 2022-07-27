package com.myapplicationdev.android.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersion;
    ArrayList<AndroidVersion> alAndroidVersion;
    //ArrayAdapter<AndroidVersion> aaAndroidVersion;
    CustomAdapter caAndroidVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersion = findViewById(R.id.listviewAndroidVersions);
        alAndroidVersion = new ArrayList<>();

        alAndroidVersion.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersion.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroidVersion.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroidVersion.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroidVersion.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroidVersion.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroidVersion.add(new AndroidVersion("Jellybean", "4.1 - 4.3.1"));

        //aaAndroidVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersion);
        caAndroidVersion = new CustomAdapter(this, R.layout.row, alAndroidVersion);

        //lvAndroidVersion.setAdapter(aaAndroidVersion);
        lvAndroidVersion.setAdapter(caAndroidVersion);



    }
}