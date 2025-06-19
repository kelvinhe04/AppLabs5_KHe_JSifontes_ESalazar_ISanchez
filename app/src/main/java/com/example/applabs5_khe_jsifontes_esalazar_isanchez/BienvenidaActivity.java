package com.example.applabs5_khe_jsifontes_esalazar_isanchez;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BienvenidaActivity extends AppCompatActivity {

    TextView textNombre, textCedula, textGrupo;
    Button btnCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        textNombre = findViewById(R.id.textNombre);
        textCedula = findViewById(R.id.textCedula);
        textGrupo = findViewById(R.id.textGrupo);
        btnCrearUsuario = findViewById(R.id.btnCrearUsuario);

        Intent intent = getIntent();
        textNombre.setText("Nombre: " + intent.getStringExtra("nombre"));
        textCedula.setText("Cédula: " + intent.getStringExtra("cedula"));
        textGrupo.setText("Grupo: " + intent.getStringExtra("grupo"));

        btnCrearUsuario.setOnClickListener(v -> {
            startActivity(new Intent(this, CrearUsuarioActivity.class));
        });

    }
}