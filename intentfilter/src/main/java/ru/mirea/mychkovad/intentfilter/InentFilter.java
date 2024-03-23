package ru.mirea.mychkovad.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InentFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inent_filter);

    }
    public void FollowOnLink (View view){

        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);

    }

    public void sendToOtherApp (View view){

        //EditText editTextName = findViewById(R.id.editTextName);
        //EditText editTextUniversity = findViewById(R.id.editTextUniversity);
        //String name = editTextName.getText().toString();
        //String university = editTextUniversity.getText().toString();

        String name = "Мычков Арсений Дмитриевич";
        String university = "РТУ МИРЭА";

        // Создаем новый Intent с действием ACTION_SEND
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);

        // Устанавливаем тип данных текст/plain
        sendIntent.setType("text/plain");

        // Добавляем данные для отправки в сообщении
        sendIntent.putExtra(Intent.EXTRA_TEXT, "ФИО студента: " + name + "\nУниверситет: " + university);

        // Запускаем активность выбора приложения для отправки
        startActivity(Intent.createChooser(sendIntent, "Отправить через"));
    }

}