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
class AgarrarTest {

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
	Agarrar agarrarManivela
	Agarrar agarrarLlave
	Agarrar agarrarPiedra
	Agarrar agarrarClavos
	Agarrar agarrarMadera
	Salir salir
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

		agarrarManivela = new Agarrar(Item.MANIVELA)
		agarrarLlave = new Agarrar(Item.LLAVE_MISTICA)
		agarrarPiedra = new Agarrar(Item.PIEDRA)
		agarrarClavos = new Agarrar(Item.CLAVOS)
		agarrarMadera = new Agarrar(Item.MADERA)

		usarLlave = new Usar(Item.LLAVE_MISTICA, moverA4)
		usarPiedra = new Usar(Item.PIEDRA, agarrarLlave) // ATENCION
		usarPala = new Usar(Item.PALA, moverA9)
		usarManivela = new Usar(Item.MANIVELA, moverA5)
		usarMadera = new Usar(Item.MADERA, moverA8)

		salir = new Salir()

		/*
		 * Asignacion de acciones a Habitaciones
		 */
		hab0.agregarAccion(moverA1)
		hab0.agregarAccion(moverA2)
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
	def void testComprobarQueSeAgregaAlInventario() {
		assertEquals(0, jugador.inventario.size)
		agarrarManivela.ejecutar(juego)
		assertEquals(1, jugador.inventario.size)
	}

	@Test
	def void testElItemSeQuitaDeLaHabitacion() {
		assertTrue(jugador.habitacion.hayItem)
		agarrarManivela.ejecutar(juego)
		assertFalse(jugador.habitacion.hayItem)
	}

	@Test
	def void testComprobarItemAgregado() {

		assertFalse(jugador.tiene(Item.MANIVELA))
		agarrarManivela.ejecutar(juego)
		assertTrue(jugador.tiene(Item.MANIVELA))
	}

	@Test
	def void testInventarioLleno() {

		for (i : 0 .. 14) {
			jugador.agregarAlInventario(Item.PALA)
		}
		agarrarManivela.ejecutar(juego)
		assertTrue(jugador.habitacion.hayItem)
	}

	@Test
	def void testAgarrarItemHabilitadoPorAccionConsecuencia() {

		jugador.habitacion = hab4
		jugador.agregarAlInventario(Item.PIEDRA)
		
		// Verifico que la habitacion no tiene accion agarrar
		assertFalse(jugador.habitacion.hayItem)

		// Al usar la piedra, se habilita la accion agarrar llave mistica
		usarPiedra.ejecutar(juego)

		//Filtro las acciones Agarrar que tiene la habitacion. Debe tener una sola accion Agarrar.
		val accionesAgarrar = jugador.habitacion.acciones.filter(typeof(Agarrar))
		val valor = accionesAgarrar.size
		assertEquals(1, valor)
		
		//Verifico que el item para agarrar sea el correspondiente
		val itemNuevo = accionesAgarrar.head.item
		assertEquals(Item.LLAVE_MISTICA, itemNuevo)

	}

}
