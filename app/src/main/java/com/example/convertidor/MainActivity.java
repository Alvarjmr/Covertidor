package com.example.convertidor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    public void convertir(View view) {

        EditText pesos = findViewById(R.id.pesos);
        TextView dolar = findViewById(R.id.dolar);
        TextView euro = findViewById(R.id.euro);


        String pesosString = pesos.getText().toString();
        Double pesosDouble = Double.parseDouble(pesosString);


        Double dolares = pesosDouble * 0.00026;
        String dolaresString =String.format("%.2f",dolares);
        String cambiodolar =" USD " + dolaresString;
        dolar.setText(cambiodolar);


        Double euros = pesosDouble * 0.00024;
        String eurosString =String.format("%.2f",euros);
        String cambioeuro =" EUR " + eurosString;
        euro.setText(cambioeuro);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
}