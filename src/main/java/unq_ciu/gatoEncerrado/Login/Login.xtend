package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Login {

	//Lista de usuarios
	List<Usuario> usuarios

	new() {
		this.usuarios = new ArrayList<Usuario>

	}

	def validarUsuario(String usernameIngresado) {

		if (!this.usuarios.exists[(it.username.equals(usernameIngresado))]) {
			throw new UserException("Usuario inexistente")
		}
	}

	def validarClave(String usernameIngresado, String clave) {
		for (Usuario u : usuarios) {
			if (u.username == usernameIngresado) {
				if (u.password != clave) {
					throw new UserException("Clave Incorrecta")
				}
			}
		}
	}

	def agregarUsuario(Usuario user) {
		usuarios.add(user)
	}
}
