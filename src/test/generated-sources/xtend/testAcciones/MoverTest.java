package testAcciones;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
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
public class MoverTest {
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from String to int"
      + "\nType mismatch: cannot convert from Habitacion to String");
  }
  
  @Test
  public void testMoverDaOK() {
    this.moverA1.ejecutar(this.juego);
    Habitacion _habitacion = this.jugador.getHabitacion();
    Assert.assertEquals(this.hab1, _habitacion);
    this.moverA3.ejecutar(this.juego);
    Habitacion _habitacion_1 = this.jugador.getHabitacion();
    Assert.assertEquals(this.hab3, _habitacion_1);
  }
  
  @Test
  public void testMoverAUnaHabitacionNoContenidaEnSusAccionesDisponiblesNoHaceNada() {
    try {
      this.moverA5.ejecutar(this.juego);
    } catch (final Throwable _t) {
      if (_t instanceof NoEstaDisponibleEstaAccionException) {
        final NoEstaDisponibleEstaAccionException e = (NoEstaDisponibleEstaAccionException)_t;
        Habitacion _habitacion = this.jugador.getHabitacion();
        Assert.assertEquals(this.hab0, _habitacion);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
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
