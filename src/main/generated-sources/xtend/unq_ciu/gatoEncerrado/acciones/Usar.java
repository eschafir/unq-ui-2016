package unq_ciu.gatoEncerrado.acciones;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Excepciones.NoHayItemNecesarioException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

@Accessors
@SuppressWarnings("all")
public class Usar extends Accion {
  private Item item;
  
  private Accion accionConsecuencia;
  
  public Usar(final Item i, final Accion acc) {
    this.item = i;
    this.accionConsecuencia = acc;
  }
  
  public void ejecutar(final Juego juego) {
    try {
      ArrayList<Accion> _accionesPosibles = juego.accionesPosibles();
      boolean _contains = _accionesPosibles.contains(this);
      if (_contains) {
        Jugador _jugador = juego.getJugador();
        boolean _tiene = _jugador.tiene(this.item);
        if (_tiene) {
          Jugador _jugador_1 = juego.getJugador();
          Habitacion _habitacion = _jugador_1.getHabitacion();
          _habitacion.quitarAccion(this);
          Jugador _jugador_2 = juego.getJugador();
          Habitacion _habitacion_1 = _jugador_2.getHabitacion();
          _habitacion_1.agregarAccion(this.accionConsecuencia);
          Jugador _jugador_3 = juego.getJugador();
          _jugador_3.quitarDelInventario(this.item);
        } else {
          throw new NoHayItemNecesarioException();
        }
      } else {
        throw new NoEstaDisponibleEstaAccionException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
  
  @Pure
  public Accion getAccionConsecuencia() {
    return this.accionConsecuencia;
  }
  
  public void setAccionConsecuencia(final Accion accionConsecuencia) {
    this.accionConsecuencia = accionConsecuencia;
  }
}
