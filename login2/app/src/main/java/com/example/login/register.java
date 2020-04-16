package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

class Register extends AppCompatActivity {
    Button Register;
    EditText login_id,mail_id,mobile_no,password_id,cpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText uid=(EditText)findViewById(R.id.login_id);
        final EditText mail=(EditText)findViewById(R.id.mail_id);
        final EditText mob=(EditText)findViewById(R.id.mobile_no);
        final EditText pass=(EditText)findViewById(R.id.password_id);
        final EditText cpass=(EditText)findViewById(R.id.cpassword);
        Button register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

