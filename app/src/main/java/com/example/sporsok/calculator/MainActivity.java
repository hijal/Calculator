package com.example.sporsok.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textViewForCal, textViewForResult, textViewFor1, textViewFor2;
    EditText editTextForNum1, editTextForNum2;
    Button button_Jog, button_Biyog, button_Gun, button_Vag, button_AC, button_DEL;

    long firstNumber = 0, secondNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewForCal = (TextView) findViewById(R.id.textViewForCal);
        textViewForResult = (TextView) findViewById(R.id.textViewForResult);
        textViewFor1 = (TextView) findViewById(R.id.textViewFor1);
        textViewFor2 = (TextView) findViewById(R.id.textViewFor2);
        editTextForNum1 = (EditText) findViewById(R.id.editTextForNum1);
        editTextForNum2 = (EditText) findViewById(R.id.editTextForNum2);
        button_Jog = (Button) findViewById(R.id.button_Jog);
        button_Biyog = (Button) findViewById(R.id.button_Biyog);
        button_Gun = (Button) findViewById(R.id.button_Gun);
        button_Vag = (Button) findViewById(R.id.button_Vag);
        button_AC = (Button) findViewById(R.id.button_AC);
        //button_DEL = (Button) findViewById(R.id.button_DEL);
    }

    public void forAC(View view)
    {
        editTextForNum1.setText("");
        editTextForNum2.setText("");
        textViewForResult.setText("");
    }

    public void ForAddition(View view)
    {
        getInp();
        long add = firstNumber + secondNumber;
        //firstNumber = 0; secondNumber = 0;
        textViewForResult.setText(add + "");

        //add = 0;

    }

    public void ForSubtract(View view)
    {
        getInp();

        long sub = firstNumber - secondNumber;
        textViewForResult.setText(sub + "");
       // return;

    }


    public void ForMultiplication(View view)
    {
        getInp();
        long mul = firstNumber * secondNumber;
        textViewForResult.setText(mul + "");
        //return;
    }


    public void ForDivision(View view)
    {

        getInp();
        if(firstNumber == 0 || secondNumber == 0)
        {
            Toast.makeText(getApplicationContext(), "Invalid Division", Toast.LENGTH_SHORT).show();
            textViewForResult.setText( 0 + "");
            //return;

        }

        long div = firstNumber / secondNumber;
        textViewForResult.setText(div + "");
        //return;

    }

    private void getInp()
    {
        String a = editTextForNum1.getText().toString();
        String b = editTextForNum2.getText().toString();
        if(a.isEmpty() || b.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Please Input First", Toast.LENGTH_SHORT).show();
            textViewForResult.setText("");
           // return;
        }
        firstNumber = Integer.parseInt(a);
        secondNumber = Integer.parseInt(b);
    }

}
