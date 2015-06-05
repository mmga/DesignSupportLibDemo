package com.mmga.designsupportlibtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setText("Snackbar1");
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText("Snackbar2");
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setText("TextInputLayout");
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setText("Floating Action Button");
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Snackbar.make(view,"This is Snackbar",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Snackbar.make(view,"This is Snackbar",Snackbar.LENGTH_SHORT)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Undo", Toast.LENGTH_SHORT);
                            }
                        }).show();
                break;
            case R.id.btn3:
                Intent i = new Intent(MainActivity.this, TextInput.class);
                startActivity(i);
                break;
            case R.id.btn4:
                break;
            case R.id.btn5:
                break;
            case R.id.btn6:
                break;
        }

    }
}