/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author Roberto
 */
@Entity

public class Usuario {
    @Id
    @GeneratedValue
    protected long id;
    
    protected String cuenta;
    protected String contrasenia;
    protected    String nombre;
    protected String apellidos;
    protected byte tipo;
    protected long nit;

    public Usuario() {
    }

    
    
    
    public Usuario(String cuenta, String contrasenia) {
        this.cuenta=cuenta;
        this.contrasenia = contrasenia;
    }

    public Usuario( String cuenta, String contrasenia,String nombre, String apellidos, byte tipo, long nit) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
        this.nit = nit;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public long getId() {
        return id;
    }

   

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return cuenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.apellidos == null) ? (other.apellidos != null) : !this.apellidos.equals(other.apellidos)) {
            return false;
        }
        if ((this.cuenta == null) ? (other.cuenta != null) : !this.cuenta.equals(other.cuenta)) {
            return false;
        }
        if ((this.contrasenia == null) ? (other.contrasenia != null) : !this.contrasenia.equals(other.contrasenia)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (this.nit != other.nit) {
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
