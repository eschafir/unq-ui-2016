package unq_ciu.gatoEncerrado_DummyData

import unq_ciu.gatoEncerrado.Juego
import unq_ciu.gatoEncerrado.Habitacion
import unq_ciu.gatoEncerrado.Jugador
import unq_ciu.gatoEncerrado.Laberinto
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Login.Login
import unq_ciu.gatoEncerrado.Login.Usuario
import unq_ciu.gatoEncerrado.acciones.Mover
import unq_ciu.gatoEncerrado.acciones.Agarrar
import unq_ciu.gatoEncerrado.Item
import unq_ciu.gatoEncerrado.acciones.Usar

/**
 * Esta clase es simplemente un utils para crear objetos tontos
 * que sirva de ejemplo para mostrar en las ventanas.
 * 
 */
@Observable
class DummyData {

	def crearJuegoDummy() {
		new Juego => [
			val entrada = new Habitacion("Entrada", true, false)
			val cocina = new Habitacion("Cocina", false, false)
			val comedor = new Habitacion("Comedor", false, false)
			val pasillo = new Habitacion("Pasillo", false, false)
			val sotano = new Habitacion("Sótano", false, false)
			val patio = new Habitacion("Patio", false, true)
			val laberinto = new Laberinto("Casa")
			val llave = new Item("Llave")
			entrada.agregarAccion(new Mover(cocina))
			entrada.agregarAccion(new Agarrar(llave))
			cocina.agregarAccion(new Mover(entrada))
			cocina.agregarAccion(new Usar(llave, new Mover(comedor)))
			jugador = new Jugador(1,"Esteban", entrada)
			laberinto.agregarHabitacion(entrada)
			laberinto.agregarHabitacion(cocina)
			laberinto.agregarHabitacion(comedor)
			laberinto.agregarHabitacion(pasillo)
			laberinto.agregarHabitacion(sotano)
			laberinto.agregarHabitacion(patio)
			agregarLaberinto(laberinto)
		]

	}

	def getCrearLoginDummy() {
		new Login => [
			val Usuario ui = new Usuario("ui2016", "123456")
			val Usuario admin = new Usuario("admin", "admin")
			agregarUsuario(ui)
			agregarUsuario(admin)
		]
	}
}
