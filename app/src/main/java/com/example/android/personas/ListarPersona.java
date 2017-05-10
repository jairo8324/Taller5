package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPersona extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Persona>personas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_persona);

    lista =(ListView)findViewById(R.id.lvListadoPersona);
    personas =Datos.traerPersonas(getApplicationContext());

        AdactadorPersona adapter = new AdactadorPersona(personas,this);
        lista.setAdapter(adapter);


    }
}
