/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author Roberto
 */
public class Vendedor extends Usuario{
    
    private String turno;
    
//    @OneToMany(mappedBy = "usuario",fetch = FetchType.EAGER )
    private List<Factura> facturas;

      
    public Vendedor( String cuenta, String contrasenia,String nombre, String apellidos, byte tipo, long nit) {
        super( cuenta, contrasenia,nombre, apellidos, tipo, nit);
         this.turno = turno;
    }

    public Vendedor() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return nombre + apellidos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.apellidos == null) ? (other.apellidos != null) : !this.apellidos.equals(other.apellidos)) {
            return false;
        }
        if ((this.turno == null) ? (other.turno != null) : !this.turno.equals(other.turno)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
}
