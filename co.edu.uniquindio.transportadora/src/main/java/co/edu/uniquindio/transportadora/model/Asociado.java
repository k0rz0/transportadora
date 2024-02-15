package co.edu.uniquindio.transportadora.model;

import java.util.ArrayList;

public class Asociado {

    private String nombre;
    private String numIdentificacion;
    private String email;
    private String numCelular;

    public Asociado() {
    }

    public Asociado(String nombre, String numIdentificacion, String email, String numCelular) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.email = email;
        this.numCelular = numCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", numIdentificacion='" + numIdentificacion + '\'' +
                ", email='" + email + '\'' +
                ", numCelular='" + numCelular + '\'' +
                '}';
    }
}
