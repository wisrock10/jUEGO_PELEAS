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

public class Orco extends Personaje {
    private boolean turnoExtraCuracion = false;

    public Orco(String nombre, Arma arma) {
        super(nombre, arma, 100);
    }

    @Override
    public void sanar() {
        int curacion = (int) ((100 - vida) * 0.25);
        vida += curacion;
        turnoExtraCuracion = true;
        System.out.println(nombre + " usa pócima. + " + curacion + " vida.");
    }

    public void aplicarCuracionExtra() {
        if (turnoExtraCuracion) {
            int extra = (int) ((100 - vida) * 0.15);
            vida += extra;
            System.out.println(nombre + " recibe curación extra. + " + extra + " vida.");
            turnoExtraCuracion = false;
        }
    }
}