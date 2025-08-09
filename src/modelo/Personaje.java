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

public abstract class Personaje {
    public String nombre;
    public int vida;
    public Arma arma;

    public Personaje(String nombre, Arma arma, int vida) {
        this.nombre = nombre;
        this.arma = arma;
        this.vida = vida;
    }

    public abstract void sanar();

    public int atacar() {
        return arma.calcularDaño();
    }
}