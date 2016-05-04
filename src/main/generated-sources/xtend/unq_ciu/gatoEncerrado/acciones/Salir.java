package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@SuppressWarnings("all")
public class Salir extends Accion {
  private Laberinto laberintoActual;
  
  public Salir(final Laberinto laberinto) {
    this.laberintoActual = laberinto;
  }
  
  public void ejecutar(final Juego juego) {
    try {
      Jugador _jugador = juego.getJugador();
      Habitacion _habitacion = _jugador.getHabitacion();
      final Laberinto laberintoActual = _habitacion.getLaberinto(juego);
      Jugador _jugador_1 = juego.getJugador();
      Habitacion _habitacion_1 = _jugador_1.getHabitacion();
      boolean _isEsFinal = _habitacion_1.isEsFinal();
      if (_isEsFinal) {
        Jugador _jugador_2 = juego.getJugador();
        Jugador _jugador_3 = juego.getJugador();
        int _ganados = _jugador_3.getGanados();
        int _plus = (_ganados + 1);
        _jugador_2.setGanados(_plus);
        Jugador _jugador_4 = juego.getJugador();
        List<Laberinto> _laberintosGanados = _jugador_4.getLaberintosGanados();
        _laberintosGanados.add(laberintoActual);
      } else {
        throw new NoHasGanadoException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public Laberinto getLaberintoActual() {
    return this.laberintoActual;
  }
  
  public void setLaberintoActual(final Laberinto laberintoActual) {
    this.laberintoActual = laberintoActual;
  }
}
