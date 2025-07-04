package com.example.applabs5_khe_jsifontes_esalazar_isanchez;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText editCorreo, editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editCorreo = findViewById(R.id.editCorreo);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String correo = editCorreo.getText().toString();
            String clave = editPassword.getText().toString();

            if (correo.isEmpty() || clave.isEmpty()) {
                Toast.makeText(this, "Por favor ingrese correo y contraseña", Toast.LENGTH_SHORT).show();
                return;
            }


            if (correo.equals("admin@ejemplo.com") && clave.equals("1234")) {
                Intent intent = new Intent(this, BienvenidaActivity.class);
                intent.putExtra("nombre", "Admin");
                intent.putExtra("cedula", "12345678");
                intent.putExtra("grupo", "1GS131");
                startActivity(intent);
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        });

    }
}