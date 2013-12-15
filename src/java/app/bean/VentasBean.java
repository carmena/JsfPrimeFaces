/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "ventasBean") 
@RequestScoped 

public class VentasBean {

    private PieChartModel ventas;

    public VentasBean() {
        ventas = new PieChartModel();
        ventas.set("Adidas", 1200);
        ventas.set("Puma", 1520);
        ventas.set("Sketcher", 890);
        ventas.set("Umbro", 9230);
    }

    public PieChartModel getVentas() {
        return ventas;
    }
}
