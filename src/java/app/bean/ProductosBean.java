/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bean;

import app.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ProductosBean {
    private List<Producto> productos; 
 
 public ProductosBean(){ 
 productos = new ArrayList<Producto>(); 
 productos.add(new Producto(501, "Lego", "Ambulancia", 150)); 
 productos.add(new Producto(502, "Tambor", "De plástico", 150)); 
 productos.add(new Producto(503, "Avión", "Control remoto", 150)); 
 productos.add(new Producto(504, "Coche", "De plátisco", 150)); 
 productos.add(new Producto(505, "Helicoptero", "Usa pilas", 150)); 
 productos.add(new Producto(506, "Motocicleta", "Mediana", 150)); 
 } 
 
 public List<Producto> getProductos(){ 
 return productos; 
 } 
}
