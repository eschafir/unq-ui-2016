package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.acciones.ResultadoAccion;

@Accessors
@Observable
@SuppressWarnings("all")
public class Mover extends Accion {
  private String nombre;
  
  private Habitacion destino;
  
  public Mover(final Habitacion destino) {
    String _nombre = destino.getNombre();
    String _plus = ("Mover a " + _nombre);
    this.nombre = _plus;
    this.destino = destino;
  }
  
  public Mover(final int id, final Habitacion destino) {
    this.setId(id);
    String _nombre = destino.getNombre();
    String _plus = ("Mover a " + _nombre);
    this.nombre = _plus;
    this.destino = destino;
  }
  
  public Object ejecutar(final Habitacion h, final Jugador j) {
    try {
      List<Accion> _acciones = h.getAcciones();
      boolean _contains = _acciones.contains(this);
      if (_contains) {
        j.setHabitacion(this.destino);
      } else {
        throw new NoEstaDisponibleEstaAccionException();
      }
      List<Item> _inventario = j.getInventario();
      Habitacion _habitacion = j.getHabitacion();
      return new ResultadoAccion(_inventario, _habitacion);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Item getItem() {
    return new Item();
  }
  
  public Object execute() {
    return this.destino;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Habitacion getDestino() {
    return this.destino;
  }
  
  public void setDestino(final Habitacion destino) {
    this.destino = destino;
  }
}
