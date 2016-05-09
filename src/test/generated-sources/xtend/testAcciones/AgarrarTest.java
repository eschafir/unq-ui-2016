package testAcciones;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoSePuedeAgregarItemAlInventarioException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Agarrar;
import unq_ciu.gatoEncerrado.acciones.Mover;
import unq_ciu.gatoEncerrado.acciones.Salir;
import unq_ciu.gatoEncerrado.acciones.Usar;

@Accessors
@SuppressWarnings("all")
public class AgarrarTest {
  private Juego juego;
  
  private Jugador jugador;
  
  private Laberinto laberinto;
  
  private Habitacion hab0;
  
  private Habitacion hab1;
  
  private Habitacion hab2;
  
  private Habitacion hab3;
  
  private Habitacion hab4;
  
  private Habitacion hab5;
  
  private Habitacion hab6;
  
  private Habitacion hab7;
  
  private Habitacion hab8;
  
  private Habitacion hab9;
  
  private Mover moverA0;
  
  private Mover moverA1;
  
  private Mover moverA2;
  
  private Mover moverA3;
  
  private Mover moverA4;
  
  private Mover moverA5;
  
  private Mover moverA6;
  
  private Mover moverA7;
  
  private Mover moverA8;
  
  private Mover moverA9;
  
  private Agarrar agarrarManivela;
  
  private Agarrar agarrarLlave;
  
  private Agarrar agarrarPiedra;
  
  private Agarrar agarrarClavos;
  
  private Agarrar agarrarMadera;
  
  private Salir salir;
  
  private Item manivela;
  
  private Item llave;
  
  private Item clavos;
  
  private Item piedra;
  
  private Item pala;
  
  private Item madera;
  
  private Usar usarLlave;
  
  private Usar usarPiedra;
  
  private Usar usarPala;
  
  private Usar usarManivela;
  
  private Usar usarMadera;
  
  @Before
  public void setUp() {
    Habitacion _habitacion = new Habitacion("hab0", true, false);
    this.hab0 = _habitacion;
    Habitacion _habitacion_1 = new Habitacion("hab1", false, false);
    this.hab1 = _habitacion_1;
    Habitacion _habitacion_2 = new Habitacion("hab2", false, false);
    this.hab2 = _habitacion_2;
    Habitacion _habitacion_3 = new Habitacion("hab3", false, false);
    this.hab3 = _habitacion_3;
    Habitacion _habitacion_4 = new Habitacion("hab4", false, false);
    this.hab4 = _habitacion_4;
    Habitacion _habitacion_5 = new Habitacion("hab5", false, false);
    this.hab5 = _habitacion_5;
    Habitacion _habitacion_6 = new Habitacion("hab6", false, false);
    this.hab6 = _habitacion_6;
    Habitacion _habitacion_7 = new Habitacion("hab7", false, false);
    this.hab7 = _habitacion_7;
    Habitacion _habitacion_8 = new Habitacion("hab8", false, true);
    this.hab8 = _habitacion_8;
    Habitacion _habitacion_9 = new Habitacion("hab9", false, false);
    this.hab9 = _habitacion_9;
    Mover _mover = new Mover(this.hab0);
    this.moverA0 = _mover;
    Mover _mover_1 = new Mover(this.hab1);
    this.moverA1 = _mover_1;
    Mover _mover_2 = new Mover(this.hab2);
    this.moverA2 = _mover_2;
    Mover _mover_3 = new Mover(this.hab3);
    this.moverA3 = _mover_3;
    Mover _mover_4 = new Mover(this.hab4);
    this.moverA4 = _mover_4;
    Mover _mover_5 = new Mover(this.hab5);
    this.moverA5 = _mover_5;
    Mover _mover_6 = new Mover(this.hab6);
    this.moverA6 = _mover_6;
    Mover _mover_7 = new Mover(this.hab7);
    this.moverA7 = _mover_7;
    Mover _mover_8 = new Mover(this.hab8);
    this.moverA8 = _mover_8;
    Mover _mover_9 = new Mover(this.hab9);
    this.moverA9 = _mover_9;
    Item _item = new Item("Manivela");
    this.manivela = _item;
    Item _item_1 = new Item("Llave");
    this.llave = _item_1;
    Item _item_2 = new Item("Piedra");
    this.piedra = _item_2;
    Item _item_3 = new Item("Clavos");
    this.clavos = _item_3;
    Item _item_4 = new Item("Madera");
    this.madera = _item_4;
    Item _item_5 = new Item("Pala");
    this.pala = _item_5;
    Agarrar _agarrar = new Agarrar(this.manivela);
    this.agarrarManivela = _agarrar;
    Agarrar _agarrar_1 = new Agarrar(this.llave);
    this.agarrarLlave = _agarrar_1;
    Agarrar _agarrar_2 = new Agarrar(this.piedra);
    this.agarrarPiedra = _agarrar_2;
    Agarrar _agarrar_3 = new Agarrar(this.clavos);
    this.agarrarClavos = _agarrar_3;
    Agarrar _agarrar_4 = new Agarrar(this.madera);
    this.agarrarMadera = _agarrar_4;
    Usar _usar = new Usar(this.llave, this.moverA4);
    this.usarLlave = _usar;
    Usar _usar_1 = new Usar(this.piedra, this.agarrarLlave);
    this.usarPiedra = _usar_1;
    Usar _usar_2 = new Usar(this.pala, this.moverA9);
    this.usarPala = _usar_2;
    Usar _usar_3 = new Usar(this.manivela, this.moverA5);
    this.usarManivela = _usar_3;
    Usar _usar_4 = new Usar(this.madera, this.moverA8);
    this.usarMadera = _usar_4;
    Salir _salir = new Salir(this.laberinto);
    this.salir = _salir;
    this.hab0.agregarAccion(this.moverA1);
    this.hab0.agregarAccion(this.moverA2);
    this.hab0.agregarAccion(this.agarrarManivela);
    this.hab1.agregarAccion(this.moverA0);
    this.hab1.agregarAccion(this.moverA3);
    this.hab1.agregarAccion(this.agarrarLlave);
    this.hab2.agregarAccion(this.moverA0);
    this.hab2.agregarAccion(this.agarrarPiedra);
    this.hab3.agregarAccion(this.moverA1);
    this.hab3.agregarAccion(this.moverA6);
    this.hab3.agregarAccion(this.usarLlave);
    this.hab4.agregarAccion(this.moverA3);
    this.hab4.agregarAccion(this.moverA7);
    this.hab4.agregarAccion(this.usarPiedra);
    this.hab5.agregarAccion(this.moverA6);
    this.hab5.agregarAccion(this.agarrarClavos);
    this.hab6.agregarAccion(this.moverA3);
    this.hab6.agregarAccion(this.usarPala);
    this.hab6.agregarAccion(this.usarManivela);
    this.hab7.agregarAccion(this.moverA4);
    this.hab7.agregarAccion(this.agarrarMadera);
    this.hab8.agregarAccion(this.moverA9);
    this.hab8.agregarAccion(this.salir);
    this.hab9.agregarAccion(this.moverA6);
    this.hab9.agregarAccion(this.usarMadera);
    Laberinto _laberinto = new Laberinto("Casa");
    this.laberinto = _laberinto;
    this.laberinto.agregarHabitacion(this.hab0);
    this.laberinto.agregarHabitacion(this.hab1);
    this.laberinto.agregarHabitacion(this.hab2);
    this.laberinto.agregarHabitacion(this.hab3);
    this.laberinto.agregarHabitacion(this.hab4);
    this.laberinto.agregarHabitacion(this.hab5);
    this.laberinto.agregarHabitacion(this.hab6);
    this.laberinto.agregarHabitacion(this.hab7);
    this.laberinto.agregarHabitacion(this.hab8);
    this.laberinto.agregarHabitacion(this.hab9);
    Jugador _jugador = new Jugador(1, "Jugador", this.hab0);
    this.jugador = _jugador;
    Juego _juego = new Juego(this.jugador);
    this.juego = _juego;
    this.juego.agregarLaberinto(this.laberinto);
  }
  
  @Test
  public void testComprobarQueSeAgregaAlInventario() {
    List<Item> _inventario = this.jugador.getInventario();
    int _size = _inventario.size();
    Assert.assertEquals(0, _size);
    this.agarrarManivela.ejecutar(this.juego);
    List<Item> _inventario_1 = this.jugador.getInventario();
    int _size_1 = _inventario_1.size();
    Assert.assertEquals(1, _size_1);
  }
  
  @Test
  public void testElItemSeQuitaDeLaHabitacion() {
    Habitacion _habitacion = this.jugador.getHabitacion();
    boolean _hayItem = _habitacion.hayItem();
    Assert.assertTrue(_hayItem);
    this.agarrarManivela.ejecutar(this.juego);
    Habitacion _habitacion_1 = this.jugador.getHabitacion();
    boolean _hayItem_1 = _habitacion_1.hayItem();
    Assert.assertFalse(_hayItem_1);
  }
  
  @Test
  public void testComprobarItemAgregado() {
    boolean _tiene = this.jugador.tiene(this.manivela);
    Assert.assertFalse(_tiene);
    this.agarrarManivela.ejecutar(this.juego);
    boolean _tiene_1 = this.jugador.tiene(this.manivela);
    Assert.assertTrue(_tiene_1);
  }
  
  @Test
  public void testInventarioLleno() {
    IntegerRange _upTo = new IntegerRange(0, 14);
    for (final Integer i : _upTo) {
      this.jugador.agregarAlInventario(this.pala);
    }
    try {
      this.agarrarManivela.ejecutar(this.juego);
    } catch (final Throwable _t) {
      if (_t instanceof NoSePuedeAgregarItemAlInventarioException) {
        final NoSePuedeAgregarItemAlInventarioException e = (NoSePuedeAgregarItemAlInventarioException)_t;
        Habitacion _habitacion = this.jugador.getHabitacion();
        boolean _hayItem = _habitacion.hayItem();
        Assert.assertTrue(_hayItem);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Test
  public void testAgarrarItemHabilitadoPorAccionConsecuencia() {
    this.jugador.setHabitacion(this.hab4);
    this.jugador.agregarAlInventario(this.piedra);
    Habitacion _habitacion = this.jugador.getHabitacion();
    boolean _hayItem = _habitacion.hayItem();
    Assert.assertFalse(_hayItem);
    this.usarPiedra.ejecutar(this.juego);
    Habitacion _habitacion_1 = this.jugador.getHabitacion();
    List<Accion> _acciones = _habitacion_1.getAcciones();
    final Iterable<Agarrar> accionesAgarrar = Iterables.<Agarrar>filter(_acciones, Agarrar.class);
    final int valor = IterableExtensions.size(accionesAgarrar);
    Assert.assertEquals(1, valor);
    Agarrar _head = IterableExtensions.<Agarrar>head(accionesAgarrar);
    final Item itemNuevo = _head.getItem();
    Assert.assertEquals(this.llave, itemNuevo);
  }
  
  @Pure
  public Juego getJuego() {
    return this.juego;
  }
  
  public void setJuego(final Juego juego) {
    this.juego = juego;
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
  
  @Pure
  public Habitacion getHab0() {
    return this.hab0;
  }
  
  public void setHab0(final Habitacion hab0) {
    this.hab0 = hab0;
  }
  
  @Pure
  public Habitacion getHab1() {
    return this.hab1;
  }
  
  public void setHab1(final Habitacion hab1) {
    this.hab1 = hab1;
  }
  
  @Pure
  public Habitacion getHab2() {
    return this.hab2;
  }
  
  public void setHab2(final Habitacion hab2) {
    this.hab2 = hab2;
  }
  
  @Pure
  public Habitacion getHab3() {
    return this.hab3;
  }
  
  public void setHab3(final Habitacion hab3) {
    this.hab3 = hab3;
  }
  
  @Pure
  public Habitacion getHab4() {
    return this.hab4;
  }
  
  public void setHab4(final Habitacion hab4) {
    this.hab4 = hab4;
  }
  
  @Pure
  public Habitacion getHab5() {
    return this.hab5;
  }
  
  public void setHab5(final Habitacion hab5) {
    this.hab5 = hab5;
  }
  
  @Pure
  public Habitacion getHab6() {
    return this.hab6;
  }
  
  public void setHab6(final Habitacion hab6) {
    this.hab6 = hab6;
  }
  
  @Pure
  public Habitacion getHab7() {
    return this.hab7;
  }
  
  public void setHab7(final Habitacion hab7) {
    this.hab7 = hab7;
  }
  
  @Pure
  public Habitacion getHab8() {
    return this.hab8;
  }
  
  public void setHab8(final Habitacion hab8) {
    this.hab8 = hab8;
  }
  
  @Pure
  public Habitacion getHab9() {
    return this.hab9;
  }
  
  public void setHab9(final Habitacion hab9) {
    this.hab9 = hab9;
  }
  
  @Pure
  public Mover getMoverA0() {
    return this.moverA0;
  }
  
  public void setMoverA0(final Mover moverA0) {
    this.moverA0 = moverA0;
  }
  
  @Pure
  public Mover getMoverA1() {
    return this.moverA1;
  }
  
  public void setMoverA1(final Mover moverA1) {
    this.moverA1 = moverA1;
  }
  
  @Pure
  public Mover getMoverA2() {
    return this.moverA2;
  }
  
  public void setMoverA2(final Mover moverA2) {
    this.moverA2 = moverA2;
  }
  
  @Pure
  public Mover getMoverA3() {
    return this.moverA3;
  }
  
  public void setMoverA3(final Mover moverA3) {
    this.moverA3 = moverA3;
  }
  
  @Pure
  public Mover getMoverA4() {
    return this.moverA4;
  }
  
  public void setMoverA4(final Mover moverA4) {
    this.moverA4 = moverA4;
  }
  
  @Pure
  public Mover getMoverA5() {
    return this.moverA5;
  }
  
  public void setMoverA5(final Mover moverA5) {
    this.moverA5 = moverA5;
  }
  
  @Pure
  public Mover getMoverA6() {
    return this.moverA6;
  }
  
  public void setMoverA6(final Mover moverA6) {
    this.moverA6 = moverA6;
  }
  
  @Pure
  public Mover getMoverA7() {
    return this.moverA7;
  }
  
  public void setMoverA7(final Mover moverA7) {
    this.moverA7 = moverA7;
  }
  
  @Pure
  public Mover getMoverA8() {
    return this.moverA8;
  }
  
  public void setMoverA8(final Mover moverA8) {
    this.moverA8 = moverA8;
  }
  
  @Pure
  public Mover getMoverA9() {
    return this.moverA9;
  }
  
  public void setMoverA9(final Mover moverA9) {
    this.moverA9 = moverA9;
  }
  
  @Pure
  public Agarrar getAgarrarManivela() {
    return this.agarrarManivela;
  }
  
  public void setAgarrarManivela(final Agarrar agarrarManivela) {
    this.agarrarManivela = agarrarManivela;
  }
  
  @Pure
  public Agarrar getAgarrarLlave() {
    return this.agarrarLlave;
  }
  
  public void setAgarrarLlave(final Agarrar agarrarLlave) {
    this.agarrarLlave = agarrarLlave;
  }
  
  @Pure
  public Agarrar getAgarrarPiedra() {
    return this.agarrarPiedra;
  }
  
  public void setAgarrarPiedra(final Agarrar agarrarPiedra) {
    this.agarrarPiedra = agarrarPiedra;
  }
  
  @Pure
  public Agarrar getAgarrarClavos() {
    return this.agarrarClavos;
  }
  
  public void setAgarrarClavos(final Agarrar agarrarClavos) {
    this.agarrarClavos = agarrarClavos;
  }
  
  @Pure
  public Agarrar getAgarrarMadera() {
    return this.agarrarMadera;
  }
  
  public void setAgarrarMadera(final Agarrar agarrarMadera) {
    this.agarrarMadera = agarrarMadera;
  }
  
  @Pure
  public Salir getSalir() {
    return this.salir;
  }
  
  public void setSalir(final Salir salir) {
    this.salir = salir;
  }
  
  @Pure
  public Item getManivela() {
    return this.manivela;
  }
  
  public void setManivela(final Item manivela) {
    this.manivela = manivela;
  }
  
  @Pure
  public Item getLlave() {
    return this.llave;
  }
  
  public void setLlave(final Item llave) {
    this.llave = llave;
  }
  
  @Pure
  public Item getClavos() {
    return this.clavos;
  }
  
  public void setClavos(final Item clavos) {
    this.clavos = clavos;
  }
  
  @Pure
  public Item getPiedra() {
    return this.piedra;
  }
  
  public void setPiedra(final Item piedra) {
    this.piedra = piedra;
  }
  
  @Pure
  public Item getPala() {
    return this.pala;
  }
  
  public void setPala(final Item pala) {
    this.pala = pala;
  }
  
  @Pure
  public Item getMadera() {
    return this.madera;
  }
  
  public void setMadera(final Item madera) {
    this.madera = madera;
  }
  
  @Pure
  public Usar getUsarLlave() {
    return this.usarLlave;
  }
  
  public void setUsarLlave(final Usar usarLlave) {
    this.usarLlave = usarLlave;
  }
  
  @Pure
  public Usar getUsarPiedra() {
    return this.usarPiedra;
  }
  
  public void setUsarPiedra(final Usar usarPiedra) {
    this.usarPiedra = usarPiedra;
  }
  
  @Pure
  public Usar getUsarPala() {
    return this.usarPala;
  }
  
  public void setUsarPala(final Usar usarPala) {
    this.usarPala = usarPala;
  }
  
  @Pure
  public Usar getUsarManivela() {
    return this.usarManivela;
  }
  
  public void setUsarManivela(final Usar usarManivela) {
    this.usarManivela = usarManivela;
  }
  
  @Pure
  public Usar getUsarMadera() {
    return this.usarMadera;
  }
  
  public void setUsarMadera(final Usar usarMadera) {
    this.usarMadera = usarMadera;
  }
}
