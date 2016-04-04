package unq_ciu.gatoEncerrado;

import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;

@Accessors
@SuppressWarnings("all")
public class Jugador {
  private String nombre;
  
  private ArrayList<Item> inventario;
  
  private Habitacion habitacion;
  
  private int ganados;
  
  private int abandonados;
  
  public Jugador(final String n, final Habitacion h) {
    this.nombre = n;
    this.habitacion = h;
    ArrayList<Item> _arrayList = new ArrayList<Item>();
    this.inventario = _arrayList;
    this.ganados = 0;
    this.abandonados = 0;
  }
  
  public int abandonar() {
    return this.abandonados = (this.abandonados + 1);
  }
  
  /**
   * Muestra las estadísticas del jugador mostrando su nombre y la cantidad de juegos ganados y abandonados.
   */
  public String verEstadisticas() {
    String _xblockexpression = null;
    {
      String _nombre = this.getNombre();
      String _plus = ("Estadísticas del jugador: " + _nombre);
      InputOutput.<String>println(_plus);
      InputOutput.<String>println(("Juegos ganados: " + Integer.valueOf(this.ganados)));
      _xblockexpression = InputOutput.<String>println(("Juegos abandonados: " + Integer.valueOf(this.abandonados)));
    }
    return _xblockexpression;
  }
  
  public void ejecutarAcciones() {
    while ((!this.getHabitacion().isEsFinal())) {
      Habitacion _habitacion = this.getHabitacion();
      ArrayList<Accion> _acciones = _habitacion.getAcciones();
      for (final Accion acc : _acciones) {
      }
    }
  }
  
  /**
   * Este método verifica si el inventario del Jugador esta lleno.
   */
  public boolean puedeAgegar() {
    ArrayList<Item> _inventario = this.getInventario();
    int _size = _inventario.size();
    return (_size < 15);
  }
  
  /**
   * Agrega un item al inventario.
   * @param i el item a agregar.
   */
  public void agregarAlInventario(final Item i) {
    ArrayList<Item> _inventario = this.getInventario();
    _inventario.add(i);
  }
  
  /**
   * Quita un item al inventario. Primero verifica si lo tiene en el inventario, luego lo quita.
   * @param i el item a quitar.
   */
  public Object quitarDelInventario(final Item i) {
    Object _xifexpression = null;
    ArrayList<Item> _inventario = this.getInventario();
    boolean _contains = _inventario.contains(i);
    if (_contains) {
      ArrayList<Item> _inventario_1 = this.getInventario();
      _xifexpression = Boolean.valueOf(_inventario_1.remove(i));
    } else {
      _xifexpression = InputOutput.<String>println((("No se encuentra el item " + i) + " en el inventario."));
    }
    return ((Serializable)_xifexpression);
  }
  
  /**
   * Verifica si un item está dentro del inventario del jugador.
   * @param i : el item que verifica si tiene en el inventario.
   */
  public boolean tiene(final Item i) {
    ArrayList<Item> _inventario = this.getInventario();
    return _inventario.contains(i);
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public ArrayList<Item> getInventario() {
    return this.inventario;
  }
  
  public void setInventario(final ArrayList<Item> inventario) {
    this.inventario = inventario;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public int getGanados() {
    return this.ganados;
  }
  
  public void setGanados(final int ganados) {
    this.ganados = ganados;
  }
  
  @Pure
  public int getAbandonados() {
    return this.abandonados;
  }
  
  public void setAbandonados(final int abandonados) {
    this.abandonados = abandonados;
  }
}
