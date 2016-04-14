package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Login {

	List<Usuario> usuarios

	new() {
		this.usuarios = new ArrayList<Usuario>

	}

	/**
	 * Agrega un usuario a la "base de datos" del juego.
	 */
	def agregarUsuario(Usuario user) {
		usuarios.add(user)
	}

	/**
 	* Valida que el nombre de usuario esté en la "Base de Datos" del programa.
 	* @params usuario : nombre del usuario. Ingresado en el campo "Usuario".
 	*/
	def validarUsuario(String usuario) {

		if (!usuarios.exists[it.username == usuario]) {
			throw new UserException("Usuario incorrecto o inexistente")
		}
	}

	/**
 	* Valida que la clave ingresada sea la correspondiente con el usuario ingresado. Este método debe ser llamado inmediatamente luego de validarUsuario().
 	* @params clave : la clave que se va a validad en la base de datos.
 	*/
	def validarClave(String clave) {

		if (!usuarios.exists[it.password == clave]) {
			throw new UserException("Clave Incorrecta")
		}
	}

	/**
	 * Valida que ninguno de los campos de credenciales esté vacío.
	 */
	def validarCamposVacios(String usuarioIngresado, String claveIngresada) {
		if (usuarioIngresado == null) {
			throw new UserException("Ingrese el usuario.")
		} else if (claveIngresada == null) {
			throw new UserException("Ingrese la contraseña.")
		}
	}
}
