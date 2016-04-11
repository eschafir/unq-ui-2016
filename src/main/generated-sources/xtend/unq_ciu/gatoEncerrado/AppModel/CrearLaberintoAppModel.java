package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
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
    boolean _xifexpression = false;
    String _nombre = this.laberinto.getNombre();
    boolean _equals = Objects.equal(_nombre, null);
    if (_equals) {
      throw new UserException("Debe ingresar un nombre para el laberinto.");
    } else {
      _xifexpression = this.juego.agregarLaberinto(this.laberinto);
    }
    return _xifexpression;
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
