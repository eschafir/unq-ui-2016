package testHabitacion;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Agarrar;
import unq_ciu.gatoEncerrado.acciones.Mover;
import unq_ciu.gatoEncerrado.acciones.Salir;

@Accessors
@SuppressWarnings("all")
public class HabitacionTest {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  private Accion accion1;
  
  private Accion accion2;
  
  private Accion accion3;
  
  private Item item;
  
  @Before
  public void setUp() {
    Habitacion _habitacion = new Habitacion("Living", true, false);
    this.habitacion = _habitacion;
    Mover _mover = new Mover(this.habitacion);
    this.accion1 = _mover;
    Salir _salir = new Salir(this.laberinto);
    this.accion2 = _salir;
    Item _item = new Item("Llave");
    this.item = _item;
    Agarrar _agarrar = new Agarrar(this.item);
    this.accion3 = _agarrar;
  }
  
  @Test
  public void testAgregarAccion() {
    int resultadoEsperado1 = 0;
    int resultadoEsperado2 = 1;
    int resultadoEsperado3 = 2;
    List<Accion> _acciones = this.habitacion.getAcciones();
    int _size = _acciones.size();
    Assert.assertEquals(resultadoEsperado1, _size);
    this.habitacion.agregarAccion(this.accion1);
    List<Accion> _acciones_1 = this.habitacion.getAcciones();
    int _size_1 = _acciones_1.size();
    Assert.assertEquals(resultadoEsperado2, _size_1);
    this.habitacion.agregarAccion(this.accion2);
    List<Accion> _acciones_2 = this.habitacion.getAcciones();
    int _size_2 = _acciones_2.size();
    Assert.assertEquals(resultadoEsperado3, _size_2);
  }
  
  @Test
  public void testQuitarAccion() {
    int resultadoEsperado1 = 1;
    this.habitacion.agregarAccion(this.accion1);
    this.habitacion.agregarAccion(this.accion2);
    this.habitacion.quitarAccion(this.accion2);
    List<Accion> _acciones = this.habitacion.getAcciones();
    int _size = _acciones.size();
    Assert.assertEquals(resultadoEsperado1, _size);
    List<Accion> _acciones_1 = this.habitacion.getAcciones();
    boolean _contains = _acciones_1.contains(this.accion2);
    Assert.assertFalse(_contains);
  }
  
  @Test
  public void testHayItem() {
    boolean _hayItem = this.habitacion.hayItem();
    Assert.assertFalse(_hayItem);
    this.habitacion.agregarAccion(this.accion3);
    boolean _hayItem_1 = this.habitacion.hayItem();
    Assert.assertTrue(_hayItem_1);
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Accion getAccion1() {
    return this.accion1;
  }
  
  public void setAccion1(final Accion accion1) {
    this.accion1 = accion1;
  }
  
  @Pure
  public Accion getAccion2() {
    return this.accion2;
  }
  
  public void setAccion2(final Accion accion2) {
    this.accion2 = accion2;
  }
  
  @Pure
  public Accion getAccion3() {
    return this.accion3;
  }
  
  public void setAccion3(final Accion accion3) {
    this.accion3 = accion3;
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}
