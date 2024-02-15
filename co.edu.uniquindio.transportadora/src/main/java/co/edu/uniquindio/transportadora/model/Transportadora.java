package co.edu.uniquindio.transportadora.model;

import java.util.ArrayList;

public class Transportadora {
    private String nombre;
    private Vehiculo vehiculo;
    private Asociado asociado;

    public Transportadora() {
    }

    public Transportadora(String nombre, Vehiculo vehiculo, Asociado asociado) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.asociado = asociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Asociado getAsociado() {
        return asociado;
    }

    public void setAsociado(Asociado asociado) {
        this.asociado = asociado;
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "nombre='" + nombre + '\'' +
                ", vehiculo=" + vehiculo +
                ", asociado=" + asociado +
                '}';
    }
}
