/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Roberto
 */
public class Factura {
   private long id;
    private int numero;
    private String codControl;
    private long numFactura;
    private Date fechaEmision;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;
    private boolean estado;
    
    private Vendedor vendedor;
    private OrdenFactura ordenfactura;

    public Factura() {
    }

    public Factura(String producto, int cantidad, double precioUnitario, double precioTotal, double iva, double it) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        fechaEmision=new Date();
    }

    public String getCodControl() {
        return codControl;
    }

    public void setCodControl(String codControl) {
        this.codControl = codControl;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    
    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + '}';
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.codControl == null) ? (other.codControl != null) : !this.codControl.equals(other.codControl)) {
            return false;
        }
        if ((this.producto == null) ? (other.producto != null) : !this.producto.equals(other.producto)) {
            return false;
        }
        if (this.fechaEmision != other.fechaEmision && (this.fechaEmision == null || !this.fechaEmision.equals(other.fechaEmision))) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioUnitario) != Double.doubleToLongBits(other.precioUnitario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioTotal) != Double.doubleToLongBits(other.precioTotal)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
}
