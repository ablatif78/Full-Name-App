package com.example.fullnameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstnameText,lastnameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnameText=findViewById(R.id.editTextPersonFirstName);
        lastnameText=findViewById(R.id.editTextPersonLastName);
    }

    public void ClickHereFunction(View view) {
        String fname,lname,fullname;
        fname=firstnameText.getText().toString();
        lname=lastnameText.getText().toString();
        fullname= fname +""+ lname;
        Toast.makeText(this,"Your Full Name is: "+fullname,Toast .LENGTH_SHORT).show();



    }
}