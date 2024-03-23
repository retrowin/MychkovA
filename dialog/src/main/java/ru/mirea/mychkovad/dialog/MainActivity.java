package ru.mirea.mychkovad.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Обработка выбора времени
    }

    public void showTimeDialog(View view) {
        DialogFragment timeDialogFragment = new MyTimeDialogFragment();
        timeDialogFragment.show(getSupportFragmentManager(), "time_picker");
    }

    public void showDateDialog(View view) {
        DialogFragment dateDialogFragment = new MyDateDialogFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "date_picker");
    }

    public void showProgressDialog(View view) {
        DialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "progress_dialog");
    }



    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}