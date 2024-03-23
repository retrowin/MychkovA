package ru.mirea.mychkovad.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year; // Формат даты (день/месяц/год)
        // Например, вы можете отобразить выбранную дату в Toast сообщении
        Toast.makeText(getActivity(), "Выбранная дата: " + selectedDate, Toast.LENGTH_SHORT).show();
    }
}
