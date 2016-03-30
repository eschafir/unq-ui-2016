package testAcciones

import org.junit.Before
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar
import unq_ciu.gatoEncerrado.acciones.Usar
import unq_ciu.gatoEncerrado.acciones.Salir
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Juego
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import org.junit.Test
import static org.junit.Assert.*

@Accessors
class MoverTest {

	Juego juego
	Jugador jugador
	Laberinto laberinto
	Habitacion hab0
	Habitacion hab1
	Habitacion hab2
	Habitacion hab3
	Habitacion hab4
	Habitacion hab5
	Habitacion hab6
	Habitacion hab7
	Habitacion hab8
	Habitacion hab9
	Mover moverA0
	Mover moverA1
	Mover moverA2
	Mover moverA3
	Mover moverA4
	Mover moverA5
	Mover moverA6
	Mover moverA7
	Mover moverA8
	Mover moverA9
	Agarrar agarrar
	Salir salir
	Usar usarLlave
	Usar usarPieda
	Usar usarPala
	Usar usarManivela
	Usar usarMadera

	@Before
	def void setUp() {

		/*
		 * Definicion de Habitaciones.
		 */
		hab0 = new Habitacion("hab0", true, false, Item.MANIVELA)
		hab1 = new Habitacion("hab1", false, false, Item.LLAVE_MISTICA)
		hab2 = new Habitacion("hab2", false, false, Item.PIEDRA)
		hab3 = new Habitacion("hab3", false, false, null)
		hab4 = new Habitacion("hab4", false, false, null)
		hab5 = new Habitacion("hab5", false, false, null)
		hab6 = new Habitacion("hab6", false, false, null)
		hab7 = new Habitacion("hab7", false, false, null)
		hab8 = new Habitacion("hab8", false, true, null)
		hab9 = new Habitacion("hab9", false, false, null)

		/*
		 * Creacion de Acciones
		 */
		moverA0 = new Mover(hab0)
		moverA1 = new Mover(hab1)
		moverA2 = new Mover(hab2)
		moverA3 = new Mover(hab3)
		moverA4 = new Mover(hab4)
		moverA5 = new Mover(hab5)
		moverA6 = new Mover(hab6)
		moverA7 = new Mover(hab7)
		moverA8 = new Mover(hab8)
		moverA9 = new Mover(hab9)

		agarrar = new Agarrar()

		usarLlave = new Usar(Item.LLAVE_MISTICA, moverA4)
		usarPieda = new Usar(Item.PIEDRA, agarrar) // ATENCION
		usarPala = new Usar(Item.PALA, moverA9)
		usarManivela = new Usar(Item.MANIVELA, moverA5)
		usarMadera = new Usar(Item.MADERA, moverA8)

		salir = new Salir()

		/*
		 * Asignacion de acciones a Habitaciones
		 */
		hab0.agregarAccion(moverA1)
		hab0.agregarAccion(moverA2)
		hab0.agregarAccion(agarrar)

		hab1.agregarAccion(moverA0)
		hab1.agregarAccion(moverA3)
		hab1.agregarAccion(agarrar)

		hab2.agregarAccion(moverA0)
		hab2.agregarAccion(agarrar)

		hab3.agregarAccion(moverA1)
		hab3.agregarAccion(moverA6)
		hab3.agregarAccion(usarLlave)

		hab4.agregarAccion(moverA3)
		hab4.agregarAccion(moverA7)
		hab4.agregarAccion(usarPieda)

		hab5.agregarAccion(moverA6)
		hab5.agregarAccion(agarrar)

		hab6.agregarAccion(moverA3)
		hab6.agregarAccion(usarPala)
		hab6.agregarAccion(usarManivela)

		hab7.agregarAccion(moverA4)
		hab7.agregarAccion(agarrar)

		hab8.agregarAccion(moverA9)
		hab8.agregarAccion(salir)

		hab9.agregarAccion(moverA6)
		hab9.agregarAccion(usarMadera)

		/*
		 * Creacion del laberinto
		 */
		laberinto = new Laberinto("Casa", new ArrayList<Habitacion>)
		laberinto.agregarHabitacion(hab0)
		laberinto.agregarHabitacion(hab1)
		laberinto.agregarHabitacion(hab2)
		laberinto.agregarHabitacion(hab3)
		laberinto.agregarHabitacion(hab4)
		laberinto.agregarHabitacion(hab5)
		laberinto.agregarHabitacion(hab6)
		laberinto.agregarHabitacion(hab7)
		laberinto.agregarHabitacion(hab8)
		laberinto.agregarHabitacion(hab9)

		/*
		 * Creacion de Jugador
		 */
		jugador = new Jugador("Jugador", hab0)

		/*
		 * Creacion de Juego
		 */
		juego = new Juego(jugador, laberinto)
	}

	@Test
	def void testMoverDaOK() {

		moverA1.ejecutar(juego)
		assertEquals(hab1, jugador.habitacion)
		moverA3.ejecutar(juego)
		assertEquals(hab3, jugador.habitacion)

	}

	@Test
	def void testMoverAUnaHabitacionNoContenidaEnSusAccionesDisponiblesNoHaceNada() {
		moverA5.ejecutar(juego)
		assertEquals(hab0, jugador.habitacion)
	}

}
