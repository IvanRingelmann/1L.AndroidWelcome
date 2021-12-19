package com.example.a1landroidwelcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editLogin;
    private EditText editPassword;
    private Button pressButton;

    private ResultClickListener resultClickListener = new ResultClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        pressButton.setOnClickListener(resultClickListener);



    }

    private void initView() {
        editLogin = findViewById(R.id.edit_login);
        editPassword = findViewById(R.id.edit_password);
        pressButton = findViewById(R.id.edit_enter_button);
    }

    private class ResultClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Вход выполнен!", Toast.LENGTH_SHORT).show();
        }

    }



}