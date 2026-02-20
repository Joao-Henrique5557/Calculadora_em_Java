package com.example.calculadora_em_java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        EditText value1 = (EditText) findViewById(R.id.input1);
        EditText value2 = (EditText) findViewById(R.id.input2);

        Button btn_somar = (Button) findViewById(R.id.somar);
        Button btn_subtrair = (Button) findViewById(R.id.subtrair);
        Button btn_multiplicar = (Button) findViewById(R.id.multiplicar);
        Button btn_dividir = (Button) findViewById(R.id.dividir);

        TextView saida = (TextView) findViewById(R.id.resultado);



        btn_somar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Double.parseDouble(value1.getText().toString());
                        num2 = Double.parseDouble(value2.getText().toString());
                        Double soma = num1 + num2;

                        saida.setText(soma.toString());
                    }
                }
        );

        btn_subtrair.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Double.parseDouble(value1.getText().toString());
                        num2 = Double.parseDouble(value2.getText().toString());
                        Double diferenca = num1 - num2;

                        saida.setText(diferenca.toString());
                    }
                }
        );

        btn_multiplicar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Double.parseDouble(value1.getText().toString());
                        num2 = Double.parseDouble(value2.getText().toString());
                        Double mul = num1 * num2;

                        saida.setText(mul.toString());
                    }
                }
        );

        btn_dividir.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Double.parseDouble(value1.getText().toString());
                        num2 = Double.parseDouble(value2.getText().toString());
                        Double divi = num1 / num2;

                        saida.setText(divi.toString());
                    }
                }
        );
    }
}