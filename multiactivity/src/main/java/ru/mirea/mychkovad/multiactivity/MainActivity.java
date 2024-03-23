package ru.mirea.mychkovad.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    private TextView NewActivity;

    private EditText InputofData;

    private Button ClickedonNewActivity;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        NewActivity = (TextView) findViewById(R.id.textView);

        //InputofData = (EditText) findViewById(R.id.editTextText);

        //ClickedonNewActivity = (Button) findViewById(R.id.button);

    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


    public void OnClickNewActivity(View view){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        //NewActivity.setText("Новое окно!");

    }


    // Задание с Выводом ФИО
    public void OnSendDatainNewActivity (View view){

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "MIREA - Мычков Арсений Дмитриевич");
        startActivity(intent);

    }


}