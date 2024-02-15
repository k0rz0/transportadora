import co.edu.uniquindio.transportadora.model.Vehiculo;
import co.edu.uniquindio.transportadora.model.VehiculoCarga;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransportadoraTest {

    @Test
    public void nombreTest(){
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(788.2);

        assertEquals(788.2,vehiculoCarga.getCapacidadCarga());
    }

}
