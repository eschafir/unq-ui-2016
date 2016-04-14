package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Login.Login
import unq_ciu.gatoEncerrado.Login.Usuario

@Accessors
@Observable
class LoginAppModel {

	Login login
	Usuario usuarioIngresado
	String claveIngresada

	new() {
	}

	new(Login l) {
		this.login = l
		this.usuarioIngresado = new Usuario()
		this.claveIngresada = null
	}

	/**
	 * Validación de todos los campos dentro de la pantalla de login.
	 */
	def validarUsuarioYClave() {
		login.validarCamposVacios(usuarioIngresado.username, claveIngresada)
		login.validarUsuario(usuarioIngresado.username)
		login.validarClave(claveIngresada)
	}
}
