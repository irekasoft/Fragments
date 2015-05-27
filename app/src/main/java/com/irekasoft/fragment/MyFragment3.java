package com.irekasoft.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hijazi on 28/5/15.
 */
public class MyFragment3 extends Fragment {

    Activity currentActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        currentActivity = getActivity();

        View rootView = inflater.inflate(R.layout.fragment_3, container, false);

//        ArrayList<String> myArrayList = new ArrayList<String>();
        final ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList("Hijazi","iReka Soft","Cyberjaya","Malaysia", "iOS", "Apple","Hijazi","iReka Soft","Cyberjaya","Malaysia", "iOS", "Apple"));


        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
                currentActivity,
                android.R.layout.simple_list_item_1,
                myArrayList
        );

        ListView listView = (ListView)rootView.findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        AdapterView.OnItemClickListener mMessageClickedHandler =  new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("asd", "item click " + myArrayList.get(position));
                String string = myArrayList.get(position);

                Context context = currentActivity.getApplicationContext();
                CharSequence text = string;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        };

        listView.setOnItemClickListener(mMessageClickedHandler);

        return rootView;
    }
}
