package co.edu.uniquindio.transportadora;

import co.edu.uniquindio.transportadora.model.Asociado;
import co.edu.uniquindio.transportadora.model.Transportadora;
import co.edu.uniquindio.transportadora.model.VehiculoCarga;

public class Main {
    public static void main(String[] args) {

        asociarVehiculo();
        calcularTotalPasajeros();
    }

    public static void asociarVehiculo(){

        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca("BAH78P");
        vehiculoCarga.setMarca("BMW");
        vehiculoCarga.setColor("BLUE");
        vehiculoCarga.setModelo("K78");
        vehiculoCarga.setCapacidadCarga(4500);
        vehiculoCarga.setNumEjes(2);

        Asociado asociado = new Asociado();
        asociado.setNombre("Leonardo");
        asociado.setEmail("leo@gamail");
        asociado.setNumCelular("985222");
        asociado.setNumIdentificacion("777777");

        Transportadora transportadora = new Transportadora();

        transportadora.setNombre("La carreta");
        transportadora.setAsociado(asociado);
        transportadora.setVehiculo(vehiculoCarga);

        System.out.println(transportadora);

    }

    public static void calcularTotalPasajeros(){

    }

}