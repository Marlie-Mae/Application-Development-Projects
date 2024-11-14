package com.example.computemate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, sub, mul, div;
    EditText text1, text2;
    TextView text;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button3);
        mul = findViewById(R.id.button5);
        div = findViewById(R.id.button4);
        text1 = findViewById(R.id.editTextTextPersonName);
        text2 = findViewById(R.id.editTextTextPersonName2);
        text = findViewById(R.id.textView4);

        for (Button button : Arrays.asList(add, sub, mul, div)) button.setOnClickListener(this);

    }

    public int getIntFromEditText (EditText editText) {
        if (editText.getText().toString().equals("")){
            Toast.makeText(this,"Enter number", Toast.LENGTH_SHORT).show(); return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
        }
    @Override
    public void onClick(View v) {
        num1 = getIntFromEditText(text1);
        num2 = getIntFromEditText(text2);
        int viewId = v.getId();

        if (viewId == R.id.button) {
            text.setText("Answer = " + (num1 + num2));
        } else if (viewId == R.id.button3) {
            text.setText("Answer = " + (num1 - num2));
        } else if (viewId == R.id.button5) {
            text.setText("Answer = " + (num1 * num2));
        } else if (viewId == R.id.button4) {
        text.setText("Answer = " + (num1 / num2));
         }
       }
    }
