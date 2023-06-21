/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.HistorialDeTransacciones;
import Modelo.Inventario;
import Modelo.Producto;
import Modelo.Transaccion;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author JUAN ALVAREZ
 */
public class ControladorTienda {

    private Inventario inventario;
    private HistorialDeTransacciones historialDeTransacciones;

    public ControladorTienda() {
        inventario = new Inventario();
        historialDeTransacciones = new HistorialDeTransacciones();
    }

    public void guardarProducto(String nombre, String codigo, double precio, int cantidad) {
        Producto producto = new Producto(nombre, codigo, precio, cantidad);
        inventario.guardarProducto(producto);
    }

    public void eliminarProducto(String codigo) {
        inventario.eliminarProducto(codigo);
    }

    public void venderProducto(String codigo, int cantidad) {
        Producto producto = inventario.findProduct(codigo);

        if (producto != null && producto.getCantidad() >= cantidad) {
            double total = producto.getPrecio() * cantidad;
            producto.setCantidad(producto.getCantidad() - cantidad);
            Transaccion transaccion = new Transaccion(producto, cantidad, total);
            historialDeTransacciones.GuardarTransaccion(transaccion);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public List<Producto> getInventario() {
        return inventario.getProductos();
    }

    public Stack<Transaccion> getHistorialDeTransacciones() {
        return historialDeTransacciones.getTransacciones();
    }
}
