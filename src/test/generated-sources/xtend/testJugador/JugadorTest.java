package testJugador;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Jugador;

@SuppressWarnings("all")
public class JugadorTest {
  private Jugador jugador;
  
  private Habitacion habitacion;
  
  @Before
  public void setUp() {
    Habitacion _habitacion = new Habitacion("Living", false, false);
    this.habitacion = _habitacion;
    Jugador _jugador = new Jugador(1, "Pepe", this.habitacion);
    this.jugador = _jugador;
  }
  
  @Test
  public void testAbandonar() {
    int resultadoEsperado1 = 0;
    int resultadoEsperado2 = 1;
    int resultadoEsperado3 = 2;
    int _abandonados = this.jugador.getAbandonados();
    Assert.assertEquals(resultadoEsperado1, _abandonados);
    this.jugador.abandonar();
    int _abandonados_1 = this.jugador.getAbandonados();
    Assert.assertEquals(resultadoEsperado2, _abandonados_1);
    this.jugador.abandonar();
    int _abandonados_2 = this.jugador.getAbandonados();
    Assert.assertEquals(resultadoEsperado3, _abandonados_2);
  }
  
  @Test
  public void testVerEstadisticas() {
  }
  
  @Test
  public void testPuedoAgregar() {
    Item pala1 = new Item("pala1");
    Item pala2 = new Item("pala2");
    Item pala3 = new Item("pala3");
    Item pala4 = new Item("pala4");
    Item pala5 = new Item("pala5");
    Item llave1 = new Item("llave1");
    Item llave2 = new Item("llave2");
    Item llave3 = new Item("llave3");
    Item llave4 = new Item("llave4");
    Item llave5 = new Item("llave5");
    Item piedra1 = new Item("piedra1");
    Item piedra2 = new Item("piedra2");
    Item piedra3 = new Item("piedra3");
    Item piedra4 = new Item("piedra4");
    Item piedra5 = new Item("piedra5");
    boolean _puedeAgregar = this.jugador.puedeAgregar();
    Assert.assertEquals(Boolean.valueOf(true), Boolean.valueOf(_puedeAgregar));
    this.jugador.agregarAlInventario(pala1);
    this.jugador.agregarAlInventario(pala2);
    this.jugador.agregarAlInventario(pala3);
    this.jugador.agregarAlInventario(pala4);
    this.jugador.agregarAlInventario(pala5);
    this.jugador.agregarAlInventario(llave1);
    this.jugador.agregarAlInventario(llave2);
    this.jugador.agregarAlInventario(llave3);
    this.jugador.agregarAlInventario(llave4);
    this.jugador.agregarAlInventario(llave5);
    this.jugador.agregarAlInventario(piedra1);
    this.jugador.agregarAlInventario(piedra2);
    this.jugador.agregarAlInventario(piedra3);
    this.jugador.agregarAlInventario(piedra4);
    this.jugador.agregarAlInventario(piedra5);
    boolean _puedeAgregar_1 = this.jugador.puedeAgregar();
    Assert.assertEquals(Boolean.valueOf(false), Boolean.valueOf(_puedeAgregar_1));
  }
  
  @Test
  public void testAgregarAlInventario() {
    Item clavos = new Item("Clavos");
    int resultadoEsperado1 = 0;
    int resultadoEsperado2 = 1;
    List<Item> _inventario = this.jugador.getInventario();
    int _size = _inventario.size();
    Assert.assertEquals(resultadoEsperado1, _size);
    boolean _tiene = this.jugador.tiene(clavos);
    Assert.assertFalse(_tiene);
    this.jugador.agregarAlInventario(clavos);
    List<Item> _inventario_1 = this.jugador.getInventario();
    int _size_1 = _inventario_1.size();
    Assert.assertEquals(resultadoEsperado2, _size_1);
    boolean _tiene_1 = this.jugador.tiene(clavos);
    Assert.assertTrue(_tiene_1);
  }
  
  @Test
  public void testQuitarDelInventario() {
    Item llave = new Item("llave");
    int resultadoEsperado1 = 1;
    int resultadoEsperado2 = 0;
    this.jugador.agregarAlInventario(llave);
    List<Item> _inventario = this.jugador.getInventario();
    int _size = _inventario.size();
    Assert.assertEquals(resultadoEsperado1, _size);
    boolean _tiene = this.jugador.tiene(llave);
    Assert.assertTrue(_tiene);
    this.jugador.quitarDelInventario(llave);
    List<Item> _inventario_1 = this.jugador.getInventario();
    int _size_1 = _inventario_1.size();
    Assert.assertEquals(resultadoEsperado2, _size_1);
    boolean _tiene_1 = this.jugador.tiene(llave);
    Assert.assertFalse(_tiene_1);
  }
  
  @Test
  public void testTiene() {
    Item piedra = new Item("piedra");
    boolean _tiene = this.jugador.tiene(piedra);
    Assert.assertFalse(_tiene);
    this.jugador.agregarAlInventario(piedra);
    boolean _tiene_1 = this.jugador.tiene(piedra);
    Assert.assertTrue(_tiene_1);
  }
}
