package com.example.a1144091759.semanatrece;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //FirebaseAuth auth;
    FirebaseDatabase db;
    EditText etNombre, etCorreo, etPass;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance();

        etNombre = findViewById(R.id.et_nombre);
        etCorreo = findViewById(R.id.et_correo);
        etPass = findViewById(R.id.et_pass);
        btnReg = findViewById(R.id.btn_reg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Usuario usuario = new Usuario(etNombre.getText().toString(), etCorreo.getText().toString(), etPass.getText().toString());

                db.getReference().child("usuarios").setValue(usuario);
            }
        });

        /*auth = FirebaseAuth.getInstance();

        auth.createUserWithEmailAndPassword("manuelaepedesign@gmail.com", "12345678")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()) {
                            Toast.makeText(MainActivity.this,
                                    "Error: "+task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this,
                                    "Registtro exitoso",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });*/
    }
}
