package co.edu.uniquindio.transportadora.model;

public class VehiculoCarga {

    private double capacidadCarga;
    private int numEjes;

    public VehiculoCarga(){}

    public VehiculoCarga(double capacidadCarga, int numEjes){
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public double getNumEjes(){
        return capacidadCarga;
    }
    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }
}
