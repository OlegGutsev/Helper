package com.example.oleggutsev.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login,
             password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText)findViewById(R.id.Login);
        password= (EditText)findViewById(R.id.Password);
    }

    public void onClick(View view) {
        Intent intent;
        switch(view.getId())
        {
            case R.id.buttonRegister:
                intent = new Intent(this, RegisterActivity.class);
                startActivityForResult(intent, 1);
                break;

            case R.id.buttonInput:
                intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            login.setText(data.getStringExtra("login"));
            password.requestFocus();
        }
    }
}
