package ru.mirea.mychkovad.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button WhoIam;
    private CheckBox process;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        WhoIam = (Button) findViewById(R.id.WhoIAm);
        process = (CheckBox) findViewById(R.id.Process);

        View.OnClickListener clbtnWhoIAm = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                tvOut.setText("Мой номер по списку 22!");
                process.setChecked(true);

            }
        };
        WhoIam.setOnClickListener(clbtnWhoIAm);



    }

    // Релизация кнопки ItIsNotMe
    @SuppressLint("SetTextI18n")
    public void SetNumberOnList (View view){

        tvOut.setText("Это не я сделал!");
        process.setChecked(false);

    }



}