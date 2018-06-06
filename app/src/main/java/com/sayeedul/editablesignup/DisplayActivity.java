package com.sayeedul.editablesignup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView name,email,contact,city,pwd;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name=findViewById(R.id.name1);
        email=findViewById(R.id.email1);
        pwd = findViewById(R.id.password1);
        contact=findViewById(R.id.contact1);
        city=findViewById(R.id.city1);
        back=findViewById(R.id.submitback);

        name.setText(getIntent().getStringExtra("name"));
        pwd.setText(getIntent().getStringExtra("password"));
        email.setText(getIntent().getStringExtra("email"));
        contact.setText(getIntent().getStringExtra("contact"));
        city.setText(getIntent().getStringExtra("city"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplayActivity.this,MainActivity.class);
                intent.putExtra("name2",name.getText().toString());
                intent.putExtra("password2",pwd.getText().toString());
                intent.putExtra("mail2",email.getText().toString());
                intent.putExtra("phone2",contact.getText().toString());
                intent.putExtra("city2",city.getText().toString());
                startActivity(intent);
            }
        });


    }
}

