package com.irekasoft.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hijazi on 28/5/15.
 */
public class MyFragment2 extends Fragment {

    Activity currentActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        currentActivity = getActivity();


        View rootView = inflater.inflate(R.layout.fragment_2,
                container,
                false);


//        Button btn = (Button)rootView.findViewById(R.id.button);
//
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Button btn = (Button)v;
//                TextView tv = (TextView)getActivity().findViewById(R.id.textView);
//                tv.setText(btn.getText());
//
//            }
//        };
//
//
//        btn.setOnClickListener(onClickListener);


        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);



    }

}
