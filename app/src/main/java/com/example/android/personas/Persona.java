package com.example.android.personas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ANDROID on 04/04/2017.
 */

public class Persona {

    private String foto;

    public Persona(String foto, String nombre, String apellido, int edad, String pasatiempo) {
        this.foto = foto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempo = pasatiempo;
    }

    private String nombre;
    private String apellido;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    private int edad;
    private String pasatiempo;

    public Persona(String nombre, String apellido, int edad, String pasatiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempo = pasatiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

public void guardar(Context contexto){
   // Datos.guardar(this);

    //declarar las variables
    SQLiteDatabase db ;
    String sql;

    //abrir la conexion en modo escritura
    PersonasSQLiteHelper aux = new PersonasSQLiteHelper (contexto,"DBPersonas",null,2 );
    db =aux.getWritableDatabase();

    //insercion forma 1
    sql ="INSERT INTO Personas values('"+this.getFoto()+"','"+this.getNombre()+"','"+this.getApellido()+"','"+this.getEdad()+"','"+this.getPasatiempo()+"')";

    db.execSQL(sql);

    //Formula 2 de insercion

   /* ContentValues nuevaPersona =new ContentValues();
    nuevaPersona.put("foto",this.getFoto());
    nuevaPersona.put("nombre",this.getNombre());
    nuevaPersona.put("apellido",this.getApellido());
    nuevaPersona.put("edad",this.getEdad());
    nuevaPersona.put("pasatiempo",this.getPasatiempo());

    db.insert("personas", null,nuevaPersona);
    */
    db.close();
}
}
