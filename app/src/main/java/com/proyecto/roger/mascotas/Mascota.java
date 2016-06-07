package com.proyecto.roger.mascotas;

import android.widget.ImageView;

public class Mascota {

    int puntos;
    int imagen,bone,bone2;
    String nombre;


    public Mascota(int imagen,String nombre,int bone, int bone2,int puntos){
        this.imagen = imagen;
        this.nombre = nombre;
        this.bone = bone;
        this.bone2 = bone2;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getImagen() {
        return imagen;
    }

    public int getBone() {
        return bone;
    }

    public int getBone2() {
        return bone2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setBone(int bone) {
        this.bone = bone;
    }

    public void setBone2(int bone2) {
        this.bone2 = bone2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
