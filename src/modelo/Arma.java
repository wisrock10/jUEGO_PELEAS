/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import util.GeneradorAleatorio;
/**
 *
 * @author Wiston Rivas
 * @author Emanuel Gomez
 */

public class Arma {
    public String nombre;
    public String tipo;
    public int dañoMin;
    public int dañoMax;
    public double modificador;

    public Arma(String nombre, String tipo, int dañoMin, int dañoMax, double modificador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dañoMin = dañoMin;
        this.dañoMax = dañoMax;
        this.modificador = modificador;
    }


    int calcularDaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}