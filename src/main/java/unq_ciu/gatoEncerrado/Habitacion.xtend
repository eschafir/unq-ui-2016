package unq_ciu.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Accessors
class Habitacion {
	boolean esInicial
	boolean esFinal
	ArrayList<Accion> acciones
	Item item
	
	//Getters, setters y constructores
	def getEsInicial() {
         esInicial
     }
     
     def void setEsInicial(boolean b) {
         esInicial = b
     }
     
    def getEsFinal() {
         esFinal
     }
     
     def void setEsFinal(boolean b) {
         esFinal = b
     }
     
      def getAcciones() {
      	acciones
      }
      
      def setAcciones(ArrayList<Accion> acc) {
     	acciones = acc
     }
     
     new(boolean eI, boolean eF, ArrayList<Accion> acc, Item i) {
        this.esInicial = eI
        this.esFinal = eF
        this.acciones = acc
        this.item = i
    }
}
