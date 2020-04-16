package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class Login extends AppCompatActivity {
    Button Login,Register;
    EditText Login_Id,Password;
    private Bundle savedInstanceState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText login_Id=(EditText)findViewById(R.id.login_id);
        final EditText password=(EditText)findViewById(R.id.login_password);
        Button Login=(Button)findViewById(R.id.login_button);
        Button Register=(Button)findViewById(R.id.register_button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(login_Id.getText().toString().equals("shankar"))
            {
                if(password.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Successfully Login",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this,after_login.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(),"Invalid User Id",Toast.LENGTH_SHORT).show();
            }
            }
        });


    }
}

