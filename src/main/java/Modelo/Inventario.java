/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JUAN ALVAREZ
 */
public class Inventario {
 private List<Producto> productos;

    public Inventario() {
        productos = new LinkedList<>();
    }

    public void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(product -> product.getCodigo().equals(codigo));
    }

    public Producto findProduct(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }    
}
