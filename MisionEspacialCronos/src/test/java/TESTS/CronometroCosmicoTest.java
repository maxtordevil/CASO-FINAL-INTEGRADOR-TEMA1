import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CronometroCosmicoTest {

    @Test
    public void testConvertirTiempo() {
        CronometroCosmico cronometro = new CronometroCosmico();
        double tiempoTerrestre = 1.0;  // 1 segundo terrestre
        double tiempoPlaneta = cronometro.convertirTiempo(tiempoTerrestre);
        double expected = 1.0;  // Reemplaza esto con el valor esperado
        assertEquals(expected, tiempoPlaneta, 0.01);
    }

    @Test
    public void testFormatearTiempo() {
        CronometroCosmico cronometro = new CronometroCosmico();
        double tiempo = 1.0;  // 1 segundo
        String tiempoFormateado = cronometro.formatearTiempo(tiempo);
        String expected = "1.000000 segundos";  // Reemplaza esto con el valor esperado
        assertEquals(expected, tiempoFormateado);
    }
}