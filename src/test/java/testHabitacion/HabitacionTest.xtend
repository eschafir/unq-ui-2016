package testHabitacion

import org.eclipse.xtend.lib.annotations.Accessors
import org.junit.Before
import unq_ciu.gatoEncerrado.Habitacion
import org.junit.Test
import static org.junit.Assert.*;
import unq_ciu.gatoEncerrado.Accion
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.acciones.Salir
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Agarrar

@Accessors
class HabitacionTest {
	var Habitacion  habitacion
	var Accion accion1
	var Accion accion2
	var Accion accion3
	var Item item
	
	
	@Before
	def void setUp() {
		
		//Establezco el escenario para testear
		habitacion = new Habitacion("Living", true, false)
		accion1 = new Mover(habitacion)
		accion2 = new Salir()
		item = new Item("Llave")
		accion3 = new Agarrar(item)
	}
	
	@Test
	def void testAgregarAccion() {
		
		var resultadoEsperado1 = 0
		var resultadoEsperado2= 1
		var resultadoEsperado3 = 2
	
		assertEquals(resultadoEsperado1, habitacion.acciones.size);
		
		habitacion.agregarAccion(accion1)
		assertEquals(resultadoEsperado2, habitacion.acciones.size);
		
		habitacion.agregarAccion(accion2)
		assertEquals(resultadoEsperado3, habitacion.acciones.size);
	}
	
	@Test
	def void testQuitarAccion() {
		
		var resultadoEsperado1= 1
			
		habitacion.agregarAccion(accion1)
		habitacion.agregarAccion(accion2)
		
		habitacion.quitarAccion(accion2)
		
		assertEquals(resultadoEsperado1, habitacion.acciones.size);
		assertFalse(habitacion.acciones.contains(accion2));
	}

	@Test
	def void testHayItem(){
		
		assertFalse(habitacion.hayItem())
		
		habitacion.agregarAccion(accion3)
		
		assertTrue(habitacion.hayItem())
	}

}