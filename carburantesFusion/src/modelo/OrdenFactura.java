/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Equipo 8
 */
public class OrdenFactura {
    private long id;
    private long numOrden;
    private int numeroInf;
    private int numeroSup;
    private Date fechaLimite;
    private List<Factura> facturas;

    public OrdenFactura() {
    }

    public OrdenFactura(long numOrden, int numeroInf, int numeroSup) {
        this.numOrden = numOrden;
        this.numeroInf = numeroInf;
        this.numeroSup = numeroSup;
        fechaLimite=new Date();
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public long getNumOrden() {
        return numOrden;
    }

    public int getNumeroInf() {
        return numeroInf;
    }

    public int getNumeroSup() {
        return numeroSup;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setNumOrden(long numOrden) {
        this.numOrden = numOrden;
    }

    public void setNumeroInf(int numeroInf) {
        this.numeroInf = numeroInf;
    }

    
    
    
}
