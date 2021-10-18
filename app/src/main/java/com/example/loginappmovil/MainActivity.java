package com.example.loginappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleteador);
    // Asignacion de Numeros
        Button btn_zero = (Button) this.findViewById(R.id.btn_zero);
        Button btn_one = (Button) this.findViewById(R.id.btn_one);
        Button btn_two = (Button) this.findViewById(R.id.btn_two);
        Button btn_three = (Button) this.findViewById(R.id.btn_three);
        Button btn_four = (Button) this.findViewById(R.id.btn_four);
        Button btn_five = (Button) this.findViewById(R.id.btn_five);
        Button btn_six = (Button) this.findViewById(R.id.btn_six);
        Button btn_seven = (Button) this.findViewById(R.id.btn_seven);
        Button btn_eight = (Button) this.findViewById(R.id.btn_eight);
        Button btn_nine = (Button) this.findViewById(R.id.btn_nine);
    //Asignamos los botones operaciones
        Button btn_add = (Button) this.findViewById(R.id.btn_add);
        Button btn_substract = (Button) this.findViewById(R.id.btn_add);
        Button btn_decimal = (Button) this.findViewById(R.id.btn_decimal);
        Button btn_clear = (Button) this.findViewById(R.id.btn_clear);
        Button btn_equal = (Button) this.findViewById(R.id.btn_equal);
        //Asignamos la pantalla
        TextView txt_display = (TextView) this.findViewById(R.id.txt_display);

        btn_zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setDigito("0");
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setDigito("1");
            }
        });

        btn_two.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("2");
            }
        });

        btn_three.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("3");
            }
        });

        btn_four.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("4");
            }
        });
        btn_five.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("5");
            }
        });

        btn_six.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("6");
            }
        });

        btn_seven.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("7");
            }
        });

        btn_eight.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("8");
            }
        });

        btn_nine.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("9");
            }
        });

        btn_add.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("+");
            }
        });

        btn_substract.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito("-");
            }

        });

        btn_decimal.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                setDigito(".");
            }

        });

        btn_clear.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) { setDigito("C"); }

        });
    }
    void setDigito(String digito){
        TextView txt_display = (TextView) this.findViewById(R.id.txt_display);
        String actual = txt_display.getText().toString();
        String nuevo = actual + digito;
        txt_display.setText(nuevo);
    }
}