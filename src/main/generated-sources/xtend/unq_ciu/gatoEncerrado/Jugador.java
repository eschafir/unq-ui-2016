package unq_ciu.gatoEncerrado;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.math.RandomUtils;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import unq_ciu.gatoEncerrado.Estado;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@SuppressWarnings("all")
public class Jugador {
  private int id;
  
  private String nombre;
  
  private List<Item> inventario;
  
  private Habitacion habitacion;
  
  private List<Laberinto> laberintos;
  
  private int ganados;
  
  private int abandonados;
  
  public Jugador() {
    this.nombre = "";
    ArrayList<Item> _arrayList = new ArrayList<Item>();
    this.inventario = _arrayList;
    ArrayList<Laberinto> _arrayList_1 = new ArrayList<Laberinto>();
    this.laberintos = _arrayList_1;
    this.habitacion = null;
    int _nextInt = RandomUtils.nextInt();
    this.id = _nextInt;
  }
  
  public Jugador(final int id, final String n, final Habitacion h) {
    this.id = id;
    this.nombre = n;
    this.habitacion = h;
    ArrayList<Item> _arrayList = new ArrayList<Item>();
    this.inventario = _arrayList;
    this.ganados = 0;
    this.abandonados = 0;
    ArrayList<Laberinto> _arrayList_1 = new ArrayList<Laberinto>();
    this.laberintos = _arrayList_1;
  }
  
  public Jugador(final int id, final String n) {
    this.id = id;
    this.nombre = n;
    this.habitacion = null;
    ArrayList<Item> _arrayList = new ArrayList<Item>();
    this.inventario = _arrayList;
    this.ganados = 0;
    this.abandonados = 0;
    ArrayList<Laberinto> _arrayList_1 = new ArrayList<Laberinto>();
    this.laberintos = _arrayList_1;
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
  
  /**
   * Este método verifica si el inventario del Jugador esta lleno.
   */
  public boolean puedeAgregar() {
    int _size = this.inventario.size();
    return (_size < 15);
  }
  
  /**
   * Agrega un item al inventario.
   * @param i el item a agregar.
   */
  public void agregarAlInventario(final Item i) {
    this.inventario.add(i);
  }
  
  /**
   * Quita un item al inventario. Primero verifica si lo tiene en el inventario, luego lo quita.
   * @param i el item a quitar.
   */
  public boolean quitarDelInventario(final Item i) {
    boolean _xifexpression = false;
    List<Item> _inventario = this.getInventario();
    boolean _contains = _inventario.contains(i);
    if (_contains) {
      List<Item> _inventario_1 = this.getInventario();
      _xifexpression = _inventario_1.remove(i);
    } else {
      throw new UserException((("No se encuentra el item " + i) + " en el inventario."));
    }
    return _xifexpression;
  }
  
  /**
   * Verifica si un item está dentro del inventario del jugador.
   * @param i : el item que verifica si tiene en el inventario.
   */
  public boolean tiene(final Item i) {
    List<Item> _inventario = this.getInventario();
    return _inventario.contains(i);
  }
  
  /**
   * Devuelve los laberintos resueltos por el jugador.
   */
  public List<Laberinto> getLaberintosResueltos() {
    final Function1<Laberinto, Boolean> _function = new Function1<Laberinto, Boolean>() {
      public Boolean apply(final Laberinto it) {
        Estado _estado = it.getEstado();
        return Boolean.valueOf(Objects.equal(_estado, Estado.RESUELTO));
      }
    };
    Iterable<Laberinto> _filter = IterableExtensions.<Laberinto>filter(this.laberintos, _function);
    return IterableExtensions.<Laberinto>toList(_filter);
  }
  
  /**
   * Devuelve los laberintos que aún no fueron resueltos por el jugador.
   */
  public List<Laberinto> getLaberintosNoResueltos() {
    final Function1<Laberinto, Boolean> _function = new Function1<Laberinto, Boolean>() {
      public Boolean apply(final Laberinto it) {
        Estado _estado = it.getEstado();
        return Boolean.valueOf(Objects.equal(_estado, Estado.NO_RESUELTO));
      }
    };
    Iterable<Laberinto> _filter = IterableExtensions.<Laberinto>filter(this.laberintos, _function);
    return IterableExtensions.<Laberinto>toList(_filter);
  }
  
  @Pure
  public int getId() {
    return this.id;
  }
  
  public void setId(final int id) {
    this.id = id;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public List<Item> getInventario() {
    return this.inventario;
  }
  
  public void setInventario(final List<Item> inventario) {
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
  public List<Laberinto> getLaberintos() {
    return this.laberintos;
  }
  
  public void setLaberintos(final List<Laberinto> laberintos) {
    this.laberintos = laberintos;
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
