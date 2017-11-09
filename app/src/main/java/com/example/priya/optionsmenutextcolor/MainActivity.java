package com.example.priya.optionsmenutextcolor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// inflate the menu,this adds items to menu bar
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    @Override
    // Handles item selection
        public boolean onOptionsItemSelected(MenuItem item) {

        TextView tv = (TextView) findViewById(R.id.tv1);

        switch (item.getItemId()) {

            case R.id.redcolor:
                Toast.makeText(getApplicationContext(), "Clicked on Red option", Toast.LENGTH_LONG).show();
                //sets text color to red
               tv.setTextColor(getResources().getColor(android.R.color.holo_red_light));

                break;

            case R.id.greencolor:
                Toast.makeText(getApplicationContext(), "Clicked on Green option", Toast.LENGTH_LONG).show();
                //sets text color to green
                tv.setTextColor(getResources().getColor(android.R.color.holo_green_light));
                break;

            case R.id.bluecolor:
                Toast.makeText(getApplicationContext(), "Clicked on Blue option", Toast.LENGTH_LONG).show();
                //sets text color to blue
                tv.setTextColor(getResources().getColor(android.R.color.holo_blue_bright));
                break;
        }
                return true;
        }


    }


