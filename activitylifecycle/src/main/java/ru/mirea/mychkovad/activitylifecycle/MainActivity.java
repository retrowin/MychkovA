package ru.mirea.mychkovad.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart()");
    }
}