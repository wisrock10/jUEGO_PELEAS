/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Wiston Rivas
 * @author Emanuel Gomez
 */

public class Humano extends Personaje {
    public Humano(String nombre, Arma arma) {
        super(nombre, arma, 100);
    }

    @Override
    public void sanar() {
        int curacion = (int) ((100 - vida) * 0.5);
        vida += curacion;
        System.out.println(nombre + " se cura con comida. + " + curacion + " vida.");
    }
}