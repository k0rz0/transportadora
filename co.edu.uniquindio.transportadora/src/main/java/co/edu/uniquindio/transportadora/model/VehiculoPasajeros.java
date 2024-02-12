package co.edu.uniquindio.transportadora.model;

public class VehiculoPasajeros {
private int numMaxPasajeros;

    public VehiculoPasajeros(){}

    public VehiculoPasajeros(int numMaxPasajeros){
        this.numMaxPasajeros = numMaxPasajeros
    }

    public int getnumMaxPasajeros(){
        return numMaxPasajeros;
    }
    public void setNumMaxPasajeros(int numMaxPasajeros){
        this.numMaxPasajeros = numMaxPasajeros;
    }

}

