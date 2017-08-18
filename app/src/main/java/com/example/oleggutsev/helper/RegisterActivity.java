package com.example.oleggutsev.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        login = (EditText) findViewById(R.id.Login);

    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.buttonInput:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonRegister:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("login", login.getText().toString());
                setResult(RESULT_OK, intent);
                break;
        }

    }
}
