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

public class Bestia extends Personaje {
    public Bestia(String nombre, Arma arma) {
        super(nombre, arma, 100);
    }

    @Override
    public void sanar() {
        int curacion = (int) ((100 - vida) * 0.45);
        vida += curacion;
        System.out.println(nombre + " duerme y se cura. + " + curacion + " vida.");
    }

    @Override
    public int atacar() {
        if (arma.nombre.equals("Puños")) {
            vida -= 10;
            System.out.println(nombre + " ataca con puños. Pierde 10 de vida.");
            return 25;
        }
        return super.atacar();
    }
}