package co.edu.uniquindio.transportadora.model;

import co.edu.uniquindio.transportadora.services.IVehiculoCarga;

public class VehiculoPasajeros extends Vehiculo implements IVehiculoCarga {
private int numMaxPasajeros;

    public VehiculoPasajeros(){}

    public VehiculoPasajeros(int numMaxPasajeros){

        this.numMaxPasajeros = numMaxPasajeros;
    }

    public int getnumMaxPasajeros(){
        return numMaxPasajeros;
    }
    public void setNumMaxPasajeros(int numMaxPasajeros){
        this.numMaxPasajeros = numMaxPasajeros;
    }


    @Override
    public void encenderElectricamente() {

    }
}

