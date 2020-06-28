package com.example.myapplication;

import android.content.EntityIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Agregar elementos para conectarnos a la vista
    private EditText editPx1;
    private EditText editPx2;
    private EditText editPy1;
    private EditText editPy2;
    private EditText editDistancia;
    private EditText editPendiente;
    private Button btnCalcular;
    private Button btnLimp;


    private void Iniciar (){
        editPx1= (EditText)findViewById(R.id.editPx1);
        editPx2= (EditText)findViewById(R.id.editPx2);
        editPy1= (EditText)findViewById(R.id.editPy1);
        editPy2= (EditText)findViewById(R.id.editPy2);
        editDistancia=(EditText)findViewById(R.id.editDistancia);
        editPendiente=(EditText)findViewById(R.id.editPendiente);

        //Inicializar el boton
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnLimp=(Button)findViewById(R.id.btnLimp);

        //Asignarle u controlador de eventos: listener
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Calcular();
            }
        });

    }

    private void Calcular(){

        double x1=Float.parseFloat(editPx1.getText().toString());
        double x2=Float.parseFloat(editPx2.getText().toString());
        double y1=Float.parseFloat(editPy1.getText().toString());
        double y2=Float.parseFloat(editPy2.getText().toString());

        double Distancia = Math.sqrt ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double Pendiente= ((y2-y1) / (x2-x1));

        editDistancia.setText((String.valueOf((Distancia))));
        editPendiente.setText((String.valueOf(Pendiente)));
    }
    private void Limpiar(){
        editPendiente.setText("");
        editDistancia.setText("");
        editPx1.setText("");
        editPx2.setText("");
        editPy1.setText("");
        editPy2.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Iniciar();
    }
}