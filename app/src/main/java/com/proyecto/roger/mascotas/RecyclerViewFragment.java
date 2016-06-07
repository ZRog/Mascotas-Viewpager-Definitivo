package com.proyecto.roger.mascotas;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Joan on 02/06/2016.
 */
public class RecyclerViewFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.miRV);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perrete,"Babas",R.mipmap.ic_bone,R.mipmap.ic_rating,0));
        mascotas.add(new Mascota(R.drawable.perrete2,"Odie",R.mipmap.ic_bone,R.mipmap.ic_rating,1));
        mascotas.add(new Mascota(R.drawable.perrete3,"Blackfish",R.mipmap.ic_bone,R.mipmap.ic_rating,2));
        mascotas.add(new Mascota(R.drawable.perrete4,"Sr Thomson",R.mipmap.ic_bone,R.mipmap.ic_rating,3));
        mascotas.add(new Mascota(R.drawable.gato,"Garfield",R.mipmap.ic_bone,R.mipmap.ic_rating,4));
        mascotas.add(new Mascota(R.drawable.gatete,"Ipa",R.mipmap.ic_bone,R.mipmap.ic_rating,5));
        mascotas.add(new Mascota(R.drawable.gatete2,"Pumba",R.mipmap.ic_bone,R.mipmap.ic_rating,6));
        mascotas.add(new Mascota(R.drawable.gatete3,"Gatete",R.mipmap.ic_bone,R.mipmap.ic_rating,7));
    }
}
