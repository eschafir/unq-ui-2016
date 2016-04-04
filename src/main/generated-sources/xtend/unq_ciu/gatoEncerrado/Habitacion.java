package unq_ciu.gatoEncerrado;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.acciones.Agarrar;

@Accessors
@Observable
@SuppressWarnings("all")
public class Habitacion {
  private String nombre;
  
  private boolean esInicial;
  
  private boolean esFinal;
  
  private List<Accion> acciones;
  
  public Habitacion(final String nombre, final boolean eI, final boolean eF) {
    this.nombre = nombre;
    this.esInicial = eI;
    this.esFinal = eF;
    ArrayList<Accion> _arrayList = new ArrayList<Accion>();
    this.acciones = _arrayList;
  }
  
  /**
   * Agrega una accion a la lista de acciones permitidas en la habitacion.
   */
  public boolean agregarAccion(final Accion acc) {
    List<Accion> _acciones = this.getAcciones();
    return _acciones.add(acc);
  }
  
  /**
   * Quita una accion de la lista de acciones permitidas en la habitacion.
   */
  public boolean quitarAccion(final Accion acc) {
    List<Accion> _acciones = this.getAcciones();
    return _acciones.remove(acc);
  }
  
  /**
   * Indica si la habitacion tiene un item disponible para agarrar.
   */
  public boolean hayItem() {
    final Iterable<Agarrar> accionesAgarrar = Iterables.<Agarrar>filter(this.acciones, Agarrar.class);
    boolean _isEmpty = IterableExtensions.isEmpty(accionesAgarrar);
    return (!_isEmpty);
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public boolean isEsInicial() {
    return this.esInicial;
  }
  
  public void setEsInicial(final boolean esInicial) {
    this.esInicial = esInicial;
  }
  
  @Pure
  public boolean isEsFinal() {
    return this.esFinal;
  }
  
  public void setEsFinal(final boolean esFinal) {
    this.esFinal = esFinal;
  }
  
  @Pure
  public List<Accion> getAcciones() {
    return this.acciones;
  }
  
  public void setAcciones(final List<Accion> acciones) {
    this.acciones = acciones;
  }
}
