package testLaberinto;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;

@SuppressWarnings("all")
public class LaberintoTest {
  private Laberinto laberinto;
  
  private Habitacion habitacion1;
  
  private Habitacion habitacion2;
  
  @Before
  public void setUp() {
    Laberinto _laberinto = new Laberinto("Casa Embrujada");
    this.laberinto = _laberinto;
    Habitacion _habitacion = new Habitacion("Living", false, false);
    this.habitacion1 = _habitacion;
    Habitacion _habitacion_1 = new Habitacion("Baño", false, false);
    this.habitacion2 = _habitacion_1;
  }
  
  @Test
  public void testAgregarHabitacion() {
    List<Habitacion> _habitaciones = this.laberinto.getHabitaciones();
    boolean _contains = _habitaciones.contains(this.habitacion1);
    Assert.assertFalse(_contains);
    List<Habitacion> _habitaciones_1 = this.laberinto.getHabitaciones();
    int _size = _habitaciones_1.size();
    Assert.assertEquals(0, _size);
    this.laberinto.agregarHabitacion(this.habitacion1);
    List<Habitacion> _habitaciones_2 = this.laberinto.getHabitaciones();
    boolean _contains_1 = _habitaciones_2.contains(this.habitacion1);
    Assert.assertTrue(_contains_1);
    List<Habitacion> _habitaciones_3 = this.laberinto.getHabitaciones();
    int _size_1 = _habitaciones_3.size();
    Assert.assertEquals(1, _size_1);
  }
  
  @Test
  public void testEliminarHabitacion() {
    this.laberinto.agregarHabitacion(this.habitacion1);
    List<Habitacion> _habitaciones = this.laberinto.getHabitaciones();
    int _size = _habitaciones.size();
    Assert.assertEquals(1, _size);
    List<Habitacion> _habitaciones_1 = this.laberinto.getHabitaciones();
    boolean _contains = _habitaciones_1.contains(this.habitacion1);
    Assert.assertTrue(_contains);
    this.laberinto.eliminarHabitacion(this.habitacion1);
    List<Habitacion> _habitaciones_2 = this.laberinto.getHabitaciones();
    boolean _contains_1 = _habitaciones_2.contains(this.habitacion1);
    Assert.assertFalse(_contains_1);
    List<Habitacion> _habitaciones_3 = this.laberinto.getHabitaciones();
    int _size_1 = _habitaciones_3.size();
    Assert.assertEquals(0, _size_1);
  }
}
