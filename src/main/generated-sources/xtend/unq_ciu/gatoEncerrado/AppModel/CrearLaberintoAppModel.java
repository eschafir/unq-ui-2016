package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class CrearLaberintoAppModel {
  private Juego juego;
  
  private Laberinto laberinto;
  
  public CrearLaberintoAppModel(final Juego juego) {
    this.juego = juego;
    Laberinto _laberinto = new Laberinto();
    this.laberinto = _laberinto;
  }
  
  public boolean agregarLaberinto() {
    return this.juego.agregarLaberinto(this.laberinto);
  }
  
  @Pure
  public Juego getJuego() {
    return this.juego;
  }
  
  public void setJuego(final Juego juego) {
    this.juego = juego;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
}
