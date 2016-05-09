package unq_ciu.gatoEncerrado;

import org.apache.commons.lang.math.RandomUtils;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Item {
  private int id;
  
  private String nombre;
  
  private String descripcion;
  
  public Item() {
    int _nextInt = RandomUtils.nextInt();
    this.id = _nextInt;
    this.nombre = null;
  }
  
  public Item(final String nombre) {
    int _nextInt = RandomUtils.nextInt();
    this.id = _nextInt;
    this.nombre = nombre;
  }
  
  public Item(final String nombre, final String descripcion) {
    int _nextInt = RandomUtils.nextInt();
    this.id = _nextInt;
    this.nombre = nombre;
    this.descripcion = descripcion;
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
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }
}
