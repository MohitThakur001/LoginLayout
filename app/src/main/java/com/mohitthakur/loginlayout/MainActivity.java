package com.mohitthakur.loginlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = (Button) findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"sign-in clicked" , Toast.LENGTH_SHORT).show();
            }
        });

        Button button1;
        button1 = (Button) findViewById(R.id.forgot);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Forgot password clicked" , Toast.LENGTH_SHORT).show();
            }
        });

        Button button2;
        button2 = (Button) findViewById(R.id.signup);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"sign-up clicked" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
