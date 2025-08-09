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

public class Jugador {
    public String nombre;
    public Personaje personaje;

    public Jugador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
    }
}