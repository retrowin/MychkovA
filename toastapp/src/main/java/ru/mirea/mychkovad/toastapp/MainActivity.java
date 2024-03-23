package ru.mirea.mychkovad.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countCharacters (View view){

        EditText editText = findViewById(R.id.editTextText);
        String text = editText.getText().toString();

        // Подсчитываем количество символов в строке
        int characterCount = text.length();

        // Отображаем сообщение Toast с информацией о количестве символов
        String message = "СТУДЕНТ No 22 ГРУППА БСБО-05-22 Количество символов - " + characterCount;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}