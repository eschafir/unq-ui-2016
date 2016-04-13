package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Login.Login
import unq_ciu.gatoEncerrado.Login.Usuario
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class LoginAppModel {

	Login login
	Usuario usuario
	String claveIngresada

	new(Login l) {
		this.login = l
		this.usuario = new Usuario()
		this.claveIngresada = ""
	}

	def validaUsuario() {

		if (usuario.username == null && claveIngresada == null) {

			throw new UserException("Debe ingresar el usuario y la contraseña")
			
		} else if (usuario.username == null && claveIngresada != null) {

			throw new UserException("Debe ingresar el usuario")

		} else if (usuario.username != null && claveIngresada == null) {

			throw new UserException("Entra por aca")
		
		}
		 else {
			login.validarUsuario(usuario.username, usuario.password)
		}
	}
}
