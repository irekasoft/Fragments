package com.irekasoft.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

// http://www.i-programmer.info/programming/android/6882-introducing-android-fragments.html?start=2
/*
    This class demonstrate
    various way to add fragments

 */

public class MainActivity extends ActionBarActivity {

    Button btn_tab1,btn_tab2,btn_tab3,btn_tab4,btn_tab5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // simply we use xml which has the linear layout
        // with id: container
        setContentView(R.layout.activity_main);

        btn_tab1 = (Button)findViewById(R.id.btn_tab1);
        btn_tab2 = (Button)findViewById(R.id.btn_tab2);
        btn_tab3 = (Button)findViewById(R.id.btn_tab3);
        btn_tab4 = (Button)findViewById(R.id.btn_tab4);
        btn_tab5 = (Button)findViewById(R.id.btn_tab5);

        btn_tab1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("tab","1" );


                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                MyFragment1 fragment = new MyFragment1();
                ft.replace(R.id.container, fragment);

                ft.commit();


            }
        });

        btn_tab2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("tab","2" );


                // obtain the fragmentManager
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.container, new MyFragment2());
                ft.commit();


            }
        });

        btn_tab3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("tab","3" );

                // obtain the fragmentManager
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.container, new MyFragment3());
                ft.commit();

            }
        });

        btn_tab4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("tab","1" );
            }
        });

        btn_tab5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("tab", "1");
            }
        });


        // we can use code method too.

//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setId(111);
//        setContentView(linearLayout);

        if (savedInstanceState == null){

            // obtain the fragmentManager
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

          MyFragment1 fragment = new MyFragment1();

          /// 111 is the layout that been made via code
          ft.add(R.id.container, fragment);

//            ft add the ( where to put , the class of fragment )
//            ft.add(R.id.container, fragment );

            ft.commit();


        }





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
