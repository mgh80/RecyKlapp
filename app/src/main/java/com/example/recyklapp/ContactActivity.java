package com.example.recyklapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //Llamado de campos del Formulario de Contacto

        EditText name = findViewById(R.id.editName);
        EditText email = findViewById(R.id.editEmail);
        EditText phoneNumber = findViewById(R.id.editPhoneNumber);

        //LLamado del botón de enviar

        Button submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Genial " + name.getText().toString() + "\n" +
                        "tu información se ha enviado correctamente!" + "\n" +
                        "pronto serás contactado.";

                Toast.makeText(ContactActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

    }
}