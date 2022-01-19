package org.RubenG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda[] tienda = new Tienda[1];
        Juego[] juegos = new Juego[50];
        tienda[0] = new Tienda(50, "Game", juegos);

        System.out.println(tienda[0]);

        System.out.println("Numero de juegos de Xbox: "+ tienda[0].getJuego()[0].contador(juegos, "XBOX"));
        System.out.println("Numero de juegos de Pc: "+ tienda[0].getJuego()[0].contador(juegos, "PC"));
        System.out.println("Numero de juegos de Switch: "+ tienda[0].getJuego()[0].contador(juegos, "SWITCH"));
        System.out.println("Numero de juegos de Play: "+ tienda[0].getJuego()[0].contador(juegos, "PLAY"));



    }
}

