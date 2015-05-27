package com.irekasoft.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hijazi on 27/5/15.
 */
public class MyFragment1 extends Fragment {

    Activity currentActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        // getActivity()
        // When you create a View object you have to provide it with a "context"

        // we just put the "context" getActivity inside the parameter

        currentActivity = getActivity();

        // There is 2 ways to create view
        // 1) via program 2) via xml

//        LinearLayout linearLayout = new LinearLayout(getActivity());
//        Button b = new Button(getActivity());
//        b.setText("hello button");
//        linearLayout.addView(b);
//
//        final TextView tv = new TextView(getActivity());
//        tv.setText("Text Entry");
//        tv.setId(110);
//
//        linearLayout.addView(tv);

        // we inflate from xml
        // file
        View rootView = inflater.inflate(R.layout.fragment_1,
                container,
                false);

        // usual get the button
        Button btn = (Button)rootView.findViewById(R.id.btn_setuju);

        // set the click listener to handle
        // the callback
        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Button btn = (Button)v;
                TextView tv = (TextView)getActivity().findViewById(R.id.textView);
                tv.setText(btn.getText());

            }
        };


        btn.setOnClickListener(onClickListener);

//        if (savedInstanceState != null){
//
//            tv.setText(savedInstanceState.getCharSequence("myText"));
//
//        }
//        return linearLayout;

        Button btn_setuju = (Button)rootView.findViewById(R.id.btn_setuju);

        btn_setuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = currentActivity.getApplicationContext();
                CharSequence text = "Terima Kasih!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        Button btn_tidak_setuju = (Button)rootView.findViewById(R.id.btn_tidak_setuju);

        btn_tidak_setuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = currentActivity.getApplicationContext();
                CharSequence text = "Anda cemburu!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView tv = (TextView)getView().findViewById(110);

        outState.putCharSequence("myText",tv.getText());

    }
}
