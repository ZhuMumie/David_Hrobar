package com.example.cyklusaktivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class StateChangeActivity extends AppCompatActivity {
    private static final String LAD = "ZmenaStavu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.i(LAD, "OnCreate");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LAD, "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LAD, "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LAD, "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LAD, "onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LAD, "onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LAD, "onDestroy");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(LAD, "onSaveInstanceState");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(LAD, "onRestoreInstanceState");
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
