package com.example.android.personas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.personas.Persona;
import com.example.android.personas.R;

import java.util.ArrayList;

/**
 * Created by Android on 02/05/2017.
 */

public class AdactadorPersona extends BaseAdapter{
    private Context contexto;
    private ArrayList<Persona> personas;

    public AdactadorPersona(ArrayList<Persona> personas, Context contexto) {
        this.personas = personas;
        this.contexto = contexto;
    }


    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int position) {
        return personas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //declaracion de variable
        TextView nombre,apellido,edad;
        ImageView foto;
        LayoutInflater inflater;
        View itemView;

        //uso del impflater

        inflater =(LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        itemView = inflater.inflate(R.layout.item_persona,null);

        //captura de opjetos

        nombre =(TextView)itemView.findViewById(R.id.txtNombrePersona);
        apellido=(TextView)itemView.findViewById(R.id.txtApellidoPersona);
        edad=(TextView)itemView.findViewById(R.id.txtEdadPersona);
        foto =(ImageView)itemView.findViewById(R.id.imgFoto);

        //pasar la informacion

        nombre.setText(personas.get(position).getNombre());
        apellido.setText(personas.get(position).getApellido());
        edad.setText(""+personas.get(position).getEdad());
        foto.setImageResource(Integer.parseInt(personas.get(position).getFoto()));

        //retornar itemview

        return  itemView;


    }
}
