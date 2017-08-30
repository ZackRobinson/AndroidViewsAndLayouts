package com.example.zack.androidviewsandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etInputValue;
    Button btnUpdateTextView;
    TextView tvDisplayValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind all the views
        etInputValue = (EditText) findViewById(R.id.etInputValue);
        btnUpdateTextView = (Button) findViewById(R.id.btnUpdateTextView);
        tvDisplayValue = (TextView) findViewById(R.id.tvDisplayValue);


        btnUpdateTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                updateText();
            }
        });



    }
    public void updateTextView(View view) {
        updateText();
    }
    private void updateText() {
        String inputValue = etInputValue.getText().toString();
        tvDisplayValue.setText(inputValue);
    }


}
