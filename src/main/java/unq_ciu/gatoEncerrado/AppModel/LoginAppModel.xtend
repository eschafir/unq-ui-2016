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
	Usuario usuarioIngresado
	String claveIngresada

	new(Login l) {
		this.login = l
		this.usuarioIngresado = new Usuario()
		this.claveIngresada = null
	}

	def validaUsuario() {

		if (usuarioIngresado == null && claveIngresada == null) {

			throw new UserException("Debe ingresar el usuario y la contraseña")

		} else if (usuarioIngresado == null) {

			throw new UserException("Debe ingresar el usuario")

		} else if (claveIngresada == null) {

			throw new UserException("Ingrese la clave")

		} else {
			login.validarUsuario(usuarioIngresado.username)
		}
	}

	def validarClave() {
		login.validarClave(usuarioIngresado.username, claveIngresada)
	}
}
