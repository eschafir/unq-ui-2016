package testJugador;

import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Jugador;

@SuppressWarnings("all")
public class JugadorTest {
  private Jugador jugador;
  
  private Habitacion habitacion;
  
  public void setUp() {
    Habitacion _habitacion = new Habitacion("Living", false, false);
    this.habitacion = _habitacion;
    Jugador _jugador = new Jugador("Pepe", this.habitacion);
    this.jugador = _jugador;
  }
  
  public void testAbandonar() {
  }
  
  public void testVerEstadisticas() {
  }
  
  public void testPuedoAgregar() {
  }
  
  public void testAgregarAlInventario() {
  }
  
  public void testQuitarDelInventario() {
  }
  
  public void testTiene() {
  }
}
