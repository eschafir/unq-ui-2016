package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Usuario {
	
	String username
	String password
	
	new(String u, String p){
		
		this.username = u
		this.password = p
	}
}