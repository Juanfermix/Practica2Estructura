/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Stack;

/**
 *
 * @author JUAN ALVAREZ
 */
public class HistorialDeTransacciones {

    private Stack<Transaccion> transacciones;

    public HistorialDeTransacciones() {
        transacciones = new Stack<>();
    }

    public void GuardarTransaccion(Transaccion transaccion) {
        transacciones.push(transaccion);
    }

    public Stack<Transaccion> getTransacciones() {
        return transacciones;
    }

}
