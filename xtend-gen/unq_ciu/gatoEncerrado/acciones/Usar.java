package unq_ciu.gatoEncerrado.acciones;

import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

/* @Accessors
 */@SuppressWarnings("all")
public class Usar extends Accion {
  private Item item;
  
  private Accion accionConsecuencia;
  
  public Usar(final Item i, final Accion acc) {
    this.item = i;
    this.accionConsecuencia = acc;
  }
  
  public void ejecutar(final Jugador jugador, final Juego juego) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getLaberinto is undefined for the type Usar"
      + "\nThe method getLaberinto is undefined for the type Usar"
      + "\nThe method getLaberinto is undefined for the type Usar"
      + "\nThe method or field getAccionConsecuencia is undefined for the type Usar"
      + "\nThe method or field getItem is undefined for the type Usar"
      + "\nThe method println is undefined for the type Usar"
      + "\ngetHabitacionActual cannot be resolved"
      + "\ngetAcciones cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\ngetHabitacionActual cannot be resolved"
      + "\nquitarAccion cannot be resolved"
      + "\ngetHabitacionActual cannot be resolved"
      + "\nagregarAccion cannot be resolved");
  }
}
