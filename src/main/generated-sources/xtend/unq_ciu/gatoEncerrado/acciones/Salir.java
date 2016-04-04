package unq_ciu.gatoEncerrado.acciones;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoHasGanadoException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;

@Accessors
@SuppressWarnings("all")
public class Salir extends Accion {
  public void ejecutar(final Juego juego) {
    try {
      Jugador _jugador = juego.getJugador();
      Habitacion _habitacion = _jugador.getHabitacion();
      boolean _isEsFinal = _habitacion.isEsFinal();
      if (_isEsFinal) {
        Jugador _jugador_1 = juego.getJugador();
        Jugador _jugador_2 = juego.getJugador();
        int _ganados = _jugador_2.getGanados();
        int _plus = (_ganados + 1);
        _jugador_1.setGanados(_plus);
        InputOutput.<String>println("Has Ganado");
      } else {
        throw new NoHasGanadoException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
