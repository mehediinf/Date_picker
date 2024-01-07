package com.example.date_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button select_button;
    private DatePicker datePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        select_button = findViewById(R.id.button_Id);
        datePicker = findViewById(R.id.datePicker_Id);
        textView = findViewById(R.id.textView_Id);


        textView.setText(currentData());

        select_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentData());
            }
        });

    }

    String currentData(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}