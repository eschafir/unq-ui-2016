package unq_ciu.gatoEncerrado;

import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Item;

/* @Accessors
 */@SuppressWarnings("all")
public class Habitacion {
  private /* String */Object nombre;
  
  private boolean esInicial;
  
  private boolean esFinal;
  
  private /* ArrayList<Accion> */Object acciones;
  
  private Item item;
  
  public Habitacion(final /* String */Object nombre, final boolean eI, final boolean eF, final /* ArrayList<Accion> */Object acc, final Item i) {
    this.nombre = nombre;
    this.esInicial = eI;
    this.esFinal = eF;
    this.acciones = acc;
    this.item = i;
  }
}
