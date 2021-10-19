package com.example.loginappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Asignamos los valores
        Button btn_registar = (Button) this.findViewById(R.id.btn_registrar);
    });
}

    void setDigito(String txt_editTextTextEmailAddress2){
        TextView editTextTextEmailAddress2 = (TextView) this.findViewById(R.id.editTextTextEmailAddress2);
        String actual = editTextTextEmailAddress2.getText().toString();
        String nuevo = actual + txt_editTextTextEmailAddress2;
        editTextTextEmailAddress2.setText(nuevo);}
    });
}

     void setDigito(String txt_editTextTextPassword2){
        TextView editTextTextPassword = (TextView) this.findViewById(R.id.editTextTextPassword2);
        String actual = editTextTextPassword.getText().toString();
        String nuevo = actual + editTextTextPassword2;
        editTextTextPassword.setText(nuevo);}
    });

}
        void setDigito(String txt_editTextTextPersonName){
        TextView editTextTextPersonName = (TextView) this.findViewById(R.id.txt_editTextTextPersonName);
        String actual = editTextTextPersonName.getText().toString();
        String nuevo = actual + txt_editTextTextPersonName;
        txt_editTextTextPersonName.setText(nuevo);
    });
}
