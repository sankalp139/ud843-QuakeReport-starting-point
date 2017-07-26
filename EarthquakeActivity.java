/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.app.DownloadManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {


    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);


        // Create a fake list of earthquake locations.
//        ArrayList<word> earthquakes = new ArrayList<word>();
//        earthquakes.add(new word("6.0","San Francisco","12.02.1996"));
//        earthquakes.add(new word("5.0","London","23.04.1937"));
//        earthquakes.add(new word("6.0","Tokyo","01.01.2010"));
//        earthquakes.add(new word("4.5","Mexico City","20.02.1997"));
//        earthquakes.add(new word("3.0","Moscow","30.03.3030"));
//        earthquakes.add(new word("5.0","Rio de Janeiro","16.04.2015"));
//        earthquakes.add(new word("3.5","Paris","03.04.3000"));


        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
          ArrayList<word> earthquakes=QueryUtils.extractEarthquakes();
        wordAdapter ab=new wordAdapter(this,earthquakes);
        ListView a=(ListView)findViewById(R.id.list);
        a.setAdapter(ab);
    }
}
//for(int i=0;i<earth.length();i++)
//        {
//        JSONObject currentEarth=earth.getJSONObject(i);
//        JSONObject properties=currentEarth.getJSONObject("properties");
//        String magnitude=properties.getString("mag");
//        String location=properties.getString("place");
//        String time=properties.getString("time");
//        word earthquake=new word(magnitude,location,time);
//        EarthquakeActivity.earthquakes.add(earthquake);
//        }