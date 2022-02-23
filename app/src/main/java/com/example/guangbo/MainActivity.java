package com.example.guangbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_ipnumber;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_ipnumber=findViewById(R.id.et_ipnumber);
        sp=getSharedPreferences("config",MODE_PRIVATE);
        et_ipnumber.setText(sp.getString("ipnumber",""));
    }

    public void click(View view) {
        String ipnumber=et_ipnumber.getText().toString().trim();

        SharedPreferences.Editor editor=sp.edit();
        editor.putString("ipnumber",ipnumber);
        System.out.println("---===-=--==--=="+ipnumber);
        editor.commit();
    }
}