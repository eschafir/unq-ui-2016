package testAcciones

import org.junit.Test
import static org.junit.Assert.*
import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Laberinto
import unq_ciu.gatoEncerrado.Habitacion
import java.util.ArrayList
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.acciones.Mover
import org.junit.Before
import unq_ciu.gatoEncerrado.Item

class AccionTest {
	@Before
	def void setUp() {
		
		/*
		 * Definicion de Habitaciones.
		 * 
		 * 0 -> Inicial
		 * 8 -> Final
		 * 
		 */
		val cocina = new Habitacion("Cocina", true, false, null)
		val living = new Habitacion("Living", false, false, null)
		val comedor = new Habitacion("Comedor", false, false, Item.LLAVE_MAGICA)
		val laberinto = new Laberinto("Casa", new ArrayList<Habitacion>)
		laberinto.agregarHabitacion(cocina)
		laberinto.agregarHabitacion(living)
		val moverALiving = new Mover(living)
		val jugador = new Jugador("Jugador", cocina)
		val juego = new Juego(jugador, laberinto)
	}

	@Test def void testMoverDaOK() {

		val cocina = new Habitacion("Cocina", true, false, null)
		val living = new Habitacion("living", false, false, null)
		val laberinto = new Laberinto("Laberinto1", new ArrayList<Habitacion>)
		laberinto.agregarHabitacion(cocina)
		laberinto.agregarHabitacion(living)
		val mover = new Mover(living)
		val jugador = new Jugador("Jugador", cocina)
		val juego = new Juego(jugador, laberinto)
		cocina.agregarAccion(mover)
		
		val valorEsperado1 = cocina
		val valorEsperado2 = living
		
		//Testeo que tiene la habitación seteada inicialmente y su nombre
		assertEquals(juego.jugador.habitacion, valorEsperado1)
		assertEquals(juego.jugador.habitacion.nombre, valorEsperado1.nombre)
		
		mover.ejecutar(juego)
		
		//Luego de ejecutar la acción testeo que tiene la habitación siguiente y su nombre
		assertEquals(juego.jugador.habitacion, valorEsperado2)
		assertEquals(juego.jugador.habitacion.nombre, valorEsperado2.nombre)
	}
}