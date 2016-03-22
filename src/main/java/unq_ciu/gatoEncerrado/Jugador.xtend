package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Jugador {
	String nombre
	ArrayList<Item> inventario
	Habitacion habitacion
	
	//Getters, setters y constructores
	def getNombre() {
         nombre
     }
     
     def void setNombre(String n) {
         nombre = n
     }
     	
     def getInventario() {
     	inventario    
     }
     
     def setInventario(ArrayList<Item> items) {
     	inventario = items
     }
     	
     def getHabitacion() {
         habitacion
     }
     
     def void setHabitacion(Habitacion h) {
         habitacion = h
     }
     
     new(String n, Habitacion h) {
        this.nombre = n
        this.habitacion = h
        this.inventario = new ArrayList<Item>()
    }
    
}