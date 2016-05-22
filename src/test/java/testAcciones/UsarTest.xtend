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
import org.eclipse.xtend.lib.annotations.Accessors
import org.junit.Test
import static org.junit.Assert.*
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException

@Accessors
class UsarTest {
	Juego juego
	Juego juego2
	Jugador jugador
	Jugador jugador2
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
	Agarrar agarrarManivela
	Agarrar agarrarLlave
	Agarrar agarrarPiedra
	Agarrar agarrarClavos
	Agarrar agarrarMadera
	Salir salir
	Item manivela
	Item llave
	Item clavos
	Item piedra
	Item pala
	Item madera
	Usar usarLlave
	Usar usarPiedra
	Usar usarPala
	Usar usarManivela
	Usar usarMadera

	@Before
	def void setUp() {

		/*
		 * Definicion de Habitaciones.
		 */
		hab0 = new Habitacion("hab0", true, false)
		hab1 = new Habitacion("hab1", false, false)
		hab2 = new Habitacion("hab2", false, false)
		hab3 = new Habitacion("hab3", false, false)
		hab4 = new Habitacion("hab4", false, false)
		hab5 = new Habitacion("hab5", false, false)
		hab6 = new Habitacion("hab6", false, false)
		hab7 = new Habitacion("hab7", false, false)
		hab8 = new Habitacion("hab8", false, true)
		hab9 = new Habitacion("hab9", false, false)

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

		manivela = new Item("Manivela")
		llave = new Item("Llave")
		piedra = new Item("Piedra")
		clavos = new Item("Clavos")
		madera = new Item("Madera")
		pala = new Item("Pala")

		agarrarManivela = new Agarrar(manivela)
		agarrarLlave = new Agarrar(llave)
		agarrarPiedra = new Agarrar(piedra)
		agarrarClavos = new Agarrar(clavos)
		agarrarMadera = new Agarrar(madera)

		usarLlave = new Usar(1, llave, moverA4)
		usarPiedra = new Usar(2, piedra, agarrarLlave) // ATENCION
		usarPala = new Usar(3, pala, moverA9)
		usarManivela = new Usar(4, manivela, moverA5)
		usarMadera = new Usar(5, madera, moverA8)

		salir = new Salir(laberinto)

		/*
		 * Asignacion de acciones a Habitaciones
		 */
		hab0.agregarAccion(moverA1)
		hab0.agregarAccion(usarManivela)
		hab0.agregarAccion(agarrarManivela)

		hab1.agregarAccion(moverA0)
		hab1.agregarAccion(moverA3)
		hab1.agregarAccion(agarrarLlave)

		hab2.agregarAccion(moverA0)
		hab2.agregarAccion(agarrarPiedra)

		hab3.agregarAccion(moverA1)
		hab3.agregarAccion(moverA6)
		hab3.agregarAccion(usarLlave)

		hab4.agregarAccion(moverA3)
		hab4.agregarAccion(moverA7)
		hab4.agregarAccion(usarPiedra)

		hab5.agregarAccion(moverA6)
		hab5.agregarAccion(agarrarClavos)

		hab6.agregarAccion(moverA3)
		hab6.agregarAccion(usarPala)
		hab6.agregarAccion(usarManivela)

		hab7.agregarAccion(moverA4)
		hab7.agregarAccion(agarrarMadera)

		hab8.agregarAccion(moverA9)
		hab8.agregarAccion(salir)

		hab9.agregarAccion(moverA6)
		hab9.agregarAccion(usarMadera)

		/*
		 * Creacion del laberinto
		 */
		laberinto = new Laberinto("Casa")
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
		jugador = new Jugador(1, "Jugador", hab0)
		jugador2 = new Jugador(2, "Jugador2", hab8)

		/*
		 * Creacion de Juego
		 */
		juego = new Juego(jugador)
		juego.agregarLaberinto(laberinto)
	}

	@Test
	def void testUnJugadorUsaAlgoCorrectamenteYHabilitaAccionConsecuencia() {

		//El jugador puede usar la manivela en la misma habitacion en la que empieza.
		agarrarManivela.ejecutar(juego)

		//Hasta aqui no puede moverse a la habitacion 5.
		assertFalse(juego.accionesPosibles.contains(moverA5))
		usarManivela.ejecutar(juego)

		//Ahora deberia poder moverse
		assertTrue(juego.accionesPosibles.contains(moverA5))
	}

	@Test
	def void testAlUtilizarUnItemSeBorraDelInventario() {
		agarrarManivela.ejecutar(juego)
		usarManivela.ejecutar(juego)
		assertEquals(0, jugador.inventario.size)
		assertFalse(jugador.tiene(manivela))
	}

	@Test
	def void testNoPuedoUsarUnItemEnUnaHabitacionIncorrecta() {

		//El jugador puede usar la manivela en la misma habitacion en la que empieza.
		agarrarManivela.ejecutar(juego)

		//Me muevo a la habitacion 5
		usarManivela.ejecutar(juego)
		moverA5.ejecutar(juego)

		try {
			usarManivela.ejecutar(juego)
		} catch (NoEstaDisponibleEstaAccionException e) {
		}

	}
}
