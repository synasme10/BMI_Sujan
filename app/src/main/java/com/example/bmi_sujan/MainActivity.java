package com.example.bmi_sujan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EtHeight,EtWeight,EtResult;
    Button BtnCompute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtHeight=findViewById(R.id.EtHeight);
        EtWeight=findViewById(R.id.EtWeight);
        BtnCompute=findViewById(R.id.BtnCompute);
        EtResult=findViewById(R.id.EtResult);

        BtnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EtResult.setEnabled(false);
                if(TextUtils.isEmpty(EtHeight.getText().toString()))
                {
                    EtHeight.setError("Enter your Height");
                    EtHeight.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(EtWeight.getText().toString()))
                {
                    EtHeight.setError("Enter your Weight");
                    EtWeight.requestFocus();
                    return;
                }

                float height,weight,bmiresult;

                height=Float.parseFloat(EtHeight.getText().toString())/100;
                weight=Float.parseFloat(EtWeight.getText().toString());

                Bmi_Sujan bmi=new Bmi_Sujan(height,weight);

                 bmiresult=bmi.calculate();
                 EtResult.setText(Float.toString(bmiresult));

                 Toast.makeText(MainActivity.this, bmi.BMICat(),Toast.LENGTH_LONG).show();

                 InputMethodManager i=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                 i.hideSoftInputFromWindow(BtnCompute.getWindowToken(),InputMethodManager.RESULT_UNCHANGED_SHOWN);

                }
        });

    }
}
