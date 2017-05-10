package com.example.android.personas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 09/05/2017.
 */

public class PersonasSQLiteHelper extends SQLiteOpenHelper{
   String sql ="CREATE TABLE Personas(foto text, nombre text, apellido text, edad text, pasatiempo text)";

    public PersonasSQLiteHelper (Context contexto, String name, SQLiteDatabase.CursorFactory factory, int version ){

        super(contexto,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase  db) {
       db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Personas");
        db.execSQL(sql);


    }
}
