package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Excepciones.NoSePuedeAgregarItemAlInventarioException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

@Accessors
@Observable
@SuppressWarnings("all")
public class Agarrar extends Accion {
  private String nombre;
  
  private Item item;
  
  public Agarrar(final Item item) {
    this.item = item;
    String _nombre = item.getNombre();
    String _plus = ("Agarrar " + _nombre);
    this.nombre = _plus;
  }
  
  public void ejecutar(final Juego juego) {
    try {
      List<Accion> _accionesPosibles = juego.accionesPosibles();
      boolean _contains = _accionesPosibles.contains(this);
      if (_contains) {
        Jugador _jugador = juego.getJugador();
        boolean _puedeAgregar = _jugador.puedeAgregar();
        if (_puedeAgregar) {
          Jugador _jugador_1 = juego.getJugador();
          _jugador_1.agregarAlInventario(this.item);
          Jugador _jugador_2 = juego.getJugador();
          Habitacion _habitacion = _jugador_2.getHabitacion();
          _habitacion.quitarAccion(this);
        } else {
          throw new NoSePuedeAgregarItemAlInventarioException();
        }
      } else {
        throw new NoEstaDisponibleEstaAccionException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}