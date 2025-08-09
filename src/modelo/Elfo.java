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

public class Elfo extends Personaje {
    private String magia;

    public Elfo(String nombre, Arma arma, String magia) {
        super(nombre, arma, magia.equals("agua") ? 115 : 100);
        this.magia = magia;
    }

    @Override
    public void sanar() {
        double porcentaje = magia.equals("agua") ? 0.9 : 0.75;
        int curacion = (int) ((115 - vida) * porcentaje);
        vida += curacion;
        System.out.println(nombre + " usa hechizo de sanación. + " + curacion + " vida.");
    }
}