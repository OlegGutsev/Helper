package com.example.oleggutsev.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        Intent intent;
        switch(view.getId())
        {
            case R.id.buttonRegister:
                intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonInput:
                intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;
        }

    }
}
