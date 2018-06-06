package com.sayeedul.editablesignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText name,email,contact,city,password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        city = findViewById(R.id.city);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("password", password.getText().toString());
                intent.putExtra("mail", email.getText().toString());
                intent.putExtra("contact", contact.getText().toString());
                intent.putExtra("city", city.getText().toString());
                startActivity(intent);
            }
        });

        name.setText(getIntent().getStringExtra("name2"));
        password.setText(getIntent().getStringExtra("password2"));
        email.setText(getIntent().getStringExtra("mail2"));
        contact.setText(getIntent().getStringExtra("phone2"));
        city.setText(getIntent().getStringExtra("city2"));

    }


}