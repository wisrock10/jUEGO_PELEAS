/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import modelo.*;
import servicio.CombateService;
import java.util.Scanner;

/**
 *
 * @author Wiston Rivas
 * @author Emanuel Gomez
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador j1 = crearJugador(sc, 1);
        Jugador j2 = crearJugador(sc, 2);

        CombateService combate = new CombateService();
        combate.iniciarCombate(j1, j2);
    }

    private static Jugador crearJugador(Scanner sc, int num) {
        System.out.println("Jugador " + num + ", ingresa tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Selecciona raza: 1-Humano 2-Elfo 3-Orco 4-Bestia");
        int raza = Integer.parseInt(sc.nextLine());

        Personaje personaje = null;

        switch (raza) {
            case 1:
                System.out.println("Elige arma: 1-Escopeta 2-Rifle");
                int a1 = Integer.parseInt(sc.nextLine());
                Arma armaH = (a1 == 1) ? new Arma("Escopeta", "fuego", 1, 5, 0.02) : new Arma("Rifle", "fuego", 1, 5, 0);
                personaje = new Humano(nombre, armaH);
                break;

            case 2:
                System.out.println("Elige magia: fuego, tierra, aire, agua");
                String magia = sc.nextLine();
                double mod = magia.equals("fuego") ? 0.10 : magia.equals("tierra") ? 0.02 : 0;
                Arma armaE = new Arma("Báculo", magia, 1, 5, mod);
                personaje = new Elfo(nombre, armaE, magia);
                break;

            case 3:
                System.out.println("Elige arma: 1-Hacha 2-Martillo");
                int a3 = Integer.parseInt(sc.nextLine());
                Arma armaO = (a3 == 1) ? new Arma("Hacha", "corte", 1, 5, 0) : new Arma("Martillo", "golpe", 1, 5, 0);
                personaje = new Orco(nombre, armaO);
                break;

            case 4:
                System.out.println("Elige arma: 1-Puños 2-Espada");
                int a4 = Integer.parseInt(sc.nextLine());
                Arma armaB = (a4 == 1) ? new Arma("Puños", "impacto", 25, 25, 0) : new Arma("Espada", "corte", 1, 10, 0);
                personaje = new Bestia(nombre, armaB);
                break;

            default:
                System.out.println("Opción inválida. Se asigna Humano por defecto.");
                Arma armaDef = new Arma("Rifle", "fuego", 1, 5, 0);
                personaje = new Humano(nombre, armaDef);
        }

        return new Jugador(nombre, personaje);
    }
}