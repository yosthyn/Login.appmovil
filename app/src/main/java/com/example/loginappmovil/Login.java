package com.example.loginappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos los valores
        Button btn_acceder = (Button) this.findViewById(R.id.btn_acceder);
        Button btn_registar = (Button) this.findViewById(R.id.btn_registrar);
    });
}

        void setDigito(String editTextTextEmailAddress){
            TextView txt_editTextTextEmailAddress = (TextView) this.findViewById(R.id.txt_editTextTextEmailAddress);
            String actual = txt_editTextTextEmailAddress.getText().toString();
            String nuevo = actual + editTextTextEmailAddress;
            txt_editTextTextEmailAddress.setText(nuevo);
    });
}

        void setDigito(String editTextTextPassword){
        TextView txt_editTextTextPassword = (TextView) this.findViewById(R.id.txt_editTextTextPassword);
        String actual = txt_editTextTextPassword.getText().toString();
        String nuevo = actual + editTextTextPassword;
        txt_editTextTextPassword.setText(nuevo);}
    });
}