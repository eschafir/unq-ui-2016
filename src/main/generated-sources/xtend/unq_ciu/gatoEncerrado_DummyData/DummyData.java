package unq_ciu.gatoEncerrado_DummyData;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.Login.Login;
import unq_ciu.gatoEncerrado.Login.Usuario;
import unq_ciu.gatoEncerrado.acciones.Agarrar;
import unq_ciu.gatoEncerrado.acciones.Mover;
import unq_ciu.gatoEncerrado.acciones.Usar;

/**
 * Esta clase es simplemente un utils para crear objetos tontos
 * que sirva de ejemplo para mostrar en las ventanas.
 */
@Observable
@SuppressWarnings("all")
public class DummyData {
  public Juego crearJuegoDummy() {
    Juego _juego = new Juego();
    final Procedure1<Juego> _function = new Procedure1<Juego>() {
      public void apply(final Juego it) {
        final Habitacion entrada = new Habitacion("Entrada", true, false);
        final Habitacion cocina = new Habitacion("Cocina", false, false);
        final Habitacion comedor = new Habitacion("Comedor", false, false);
        final Habitacion pasillo = new Habitacion("Pasillo", false, false);
        final Habitacion sotano = new Habitacion("Sótano", false, false);
        final Habitacion patio = new Habitacion("Patio", false, true);
        final Laberinto laberinto = new Laberinto("Casa");
        final Item llave = new Item("Llave");
        Mover _mover = new Mover(cocina);
        entrada.agregarAccion(_mover);
        Agarrar _agarrar = new Agarrar(llave);
        entrada.agregarAccion(_agarrar);
        Mover _mover_1 = new Mover(entrada);
        cocina.agregarAccion(_mover_1);
        Mover _mover_2 = new Mover(comedor);
        Usar _usar = new Usar(1, llave, _mover_2);
        cocina.agregarAccion(_usar);
        Jugador _jugador = new Jugador(1, "Esteban", entrada);
        it.setJugador(_jugador);
        laberinto.agregarHabitacion(entrada);
        laberinto.agregarHabitacion(cocina);
        laberinto.agregarHabitacion(comedor);
        laberinto.agregarHabitacion(pasillo);
        laberinto.agregarHabitacion(sotano);
        laberinto.agregarHabitacion(patio);
        it.agregarLaberinto(laberinto);
      }
    };
    return ObjectExtensions.<Juego>operator_doubleArrow(_juego, _function);
  }
  
  public Login getCrearLoginDummy() {
    Login _login = new Login();
    final Procedure1<Login> _function = new Procedure1<Login>() {
      public void apply(final Login it) {
        final Usuario ui = new Usuario("ui2016", "123456");
        final Usuario admin = new Usuario("admin", "admin");
        it.agregarUsuario(ui);
        it.agregarUsuario(admin);
      }
    };
    return ObjectExtensions.<Login>operator_doubleArrow(_login, _function);
  }
}
