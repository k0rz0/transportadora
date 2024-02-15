package co.edu.uniquindio.transportadora.model;

public class VehiculoCarga extends Vehiculo {

    private double capacidadCarga;
    private int numEjes;

    public VehiculoCarga(){}

    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numEjes) {
        super(placa, modelo, marca, color);
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

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numEjes=" + numEjes +
                '}';
    }
}
