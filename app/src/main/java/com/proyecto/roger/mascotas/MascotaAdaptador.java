package com.proyecto.roger.mascotas;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){

        this.mascotas = mascotas;

    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.img.setImageResource(mascota.getImagen());
        holder.txt.setText(mascota.getNombre());
        holder.txt2.setText(String.valueOf(mascota.getPuntos()));
        holder.ib.setImageResource(mascota.getBone());
        holder.ib2.setImageResource(mascota.getBone2());

        holder.ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascota.setPuntos(mascota.getPuntos()+1);
                holder.txt2.setText(String.valueOf(mascota.getPuntos()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends  RecyclerView.ViewHolder{

        private ImageView img;
        private TextView txt,txt2;
        private ImageButton ib,ib2;

        public MascotaViewHolder(View itemView){
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.fotoMascota);
            txt = (TextView) itemView.findViewById(R.id.nombreMascota);
            txt2 = (TextView) itemView.findViewById(R.id.cuantoRating);
            ib = (ImageButton) itemView.findViewById(R.id.ratear);
            ib2 = (ImageButton) itemView.findViewById(R.id.rating);
        }
    }
}
