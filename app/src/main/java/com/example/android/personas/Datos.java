package com.example.android.personas;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by ANDROID on 04/04/2017.
 */

public class Datos {

public static ArrayList<Persona> traerPersonas(Context contexto){
//declaro variables
    SQLiteDatabase db;
    String sql,foto,nombre,apellido,pasatiempo;
    int edad;
    ArrayList<Persona> personas =new ArrayList();

    //abrir la base de datos

    PersonasSQLiteHelper aux = new PersonasSQLiteHelper(contexto, "DBPersonas", null,2);

    db = aux.getReadableDatabase();

    //cursor

    sql ="Select foto,nombre,apellido,edad,pasatiempo from Personas";
    Cursor c = db.rawQuery(sql,null);

    //recorrido del cursor
    if (c.moveToFirst()){
        do {
            foto =c.getString(0);
            nombre =c.getString(1);
            apellido =c.getString(2);
            edad =Integer.parseInt(c.getString(3));
            pasatiempo =c.getString(4);

            Persona p =new Persona(foto,nombre,apellido,edad,pasatiempo);
            personas.add(p);
        }while (c.moveToNext());
    }
    //cerrar conexion
    db.close();

    //retornar persona
return personas;
}

}





/*
    public static void guardar(Persona p){


        personas.add(p);

    }

    public static ArrayList<Persona> getPersonas() {
        return personas;
    }
}
*/