package org.RubenG;


import java.util.Arrays;

public class Tienda {

    //Estado
    private int stock;
    private String nombre;
    private Juego[] juego = new Juego[50];

    public Tienda(int stock, String nombre, Juego[] juego) {
        this.stock = stock;
        this.nombre = nombre;
        this.juego = inicializarJuego(juego);
    }

    //Getter and Setter


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Juego[] getJuego() {
        return juego;
    }

    public void setJuego(Juego[] juego) {
        this.juego = juego;
    }

    //Comportamiento

    public Juego[] inicializarJuego(Juego aux[]) {
        for (int i = 0; i < aux.length; i++) {
            aux[i] = new CreadorJuego().createRandom();
        }

        return aux;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", juegos=" + '\n' + Arrays.toString(juego) +
                '}';
    }
}
