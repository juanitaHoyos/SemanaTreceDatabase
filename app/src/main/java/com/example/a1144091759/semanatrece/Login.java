package com.example.a1144091759.semanatrece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText etCorreo, etPass;
    TextView tvReg;
    Button btnIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etCorreo = findViewById(R.id.et_correo);
        etPass = findViewById(R.id.et_pass);
        tvReg = findViewById(R.id.tv_reg);
        btnIng = findViewById(R.id.btn_ing);

        tvReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
