package com.example.praktikum3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button mRegister, mBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mRegister =(Button)findViewById(R.id.bt_register);
        mBack =(Button)findViewById(R.id.bt_back);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"belum ada isi",Toast.LENGTH_LONG).show();
            }
        });
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iBack);
                finish();
            }
        });
    }
}
