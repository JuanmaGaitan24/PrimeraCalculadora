package com.example.sumarnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button bsumar, brestar, bmulti, bdividir;
    TextView res;
    final String ETIQUETA = "CALCULADORA";


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CALCULADORA", "Entra en OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CALCULADORA", "se destruye la aplicacion");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("CALCULADORA", "Entro en PostResume");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        bsumar = findViewById(R.id.buttonsumar);
        brestar = findViewById(R.id.restar);
        bmulti = findViewById(R.id.buttonmulti);
        bdividir = findViewById(R.id.buttondiv);
        res = findViewById(R.id.textView2);



        bsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int suma = n1 + n2;

                res.setText(""+suma);
                Log.i(ETIQUETA, "he sumado dos numeros");
            }
        });

        brestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int resta = n1 - n2;

                res.setText(""+resta);
                Log.i(ETIQUETA, "he restado dos numeros");
            }
        });

        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int multi = n1 * n2;

                res.setText(""+multi);
            }
        });

        bdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());

                try {
                    int div = n1 / n2;
                    res.setText(""+div);
                }catch (Exception e){
                    res.setText("Infinito");
                }
            }
        });


    }
}