package com.example.applabs5_khe_jsifontes_esalazar_isanchez;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CrearUsuarioActivity extends AppCompatActivity {

    EditText editNombre, editCedula, editCorreoNuevo, editPasswordNuevo;
    Button btnGuardarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        editNombre = findViewById(R.id.editNombre);
        editCedula = findViewById(R.id.editCedula);
        editCorreoNuevo = findViewById(R.id.editCorreoNuevo);
        editPasswordNuevo = findViewById(R.id.editPasswordNuevo);
        btnGuardarUsuario = findViewById(R.id.btnGuardarUsuario);

        btnGuardarUsuario.setOnClickListener(v -> {

            // Validar que los campos no estén vacíos
            if (editNombre.getText().toString().isEmpty() ||
                    editCedula.getText().toString().isEmpty() ||
                    editCorreoNuevo.getText().toString().isEmpty() ||
                    editPasswordNuevo.getText().toString().isEmpty()) {

                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
                return;  // Evita continuar si hay campos vacíos
            }

            // Validar el formato del correo
            String correo = editCorreoNuevo.getText().toString();
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
                Toast.makeText(this, "Correo electrónico no válido", Toast.LENGTH_SHORT).show();
                return;  // Evita continuar si el correo no es válido
            }


            Toast.makeText(this, "Usuario guardado correctamente", Toast.LENGTH_SHORT).show();


            finish(); // Regresar
        });


    }
}