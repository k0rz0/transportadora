package co.edu.uniquindio.transportadora.model;

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
}
