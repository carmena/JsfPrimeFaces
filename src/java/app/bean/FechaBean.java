/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "fechaBean")
@RequestScoped
public class FechaBean {

    private Date fecha;
    private String fechaMinima;
    private String fechaMaxima;

    public FechaBean() {
        fechaMinima = "2013/11/17";
        fechaMaxima = "2013/12/24";
    }

    public String getFechaMinima() {
        return fechaMinima;
    }

    public void setFechaMinima(String fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    public String getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}
