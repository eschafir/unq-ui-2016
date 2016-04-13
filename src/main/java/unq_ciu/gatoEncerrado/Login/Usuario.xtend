package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Observable
@Accessors
class Usuario {
	
	String username
	String password
	
	new(String u, String p){
		
		this.username = u
		this.password = p
	}
	
	new(){
		username = null
		password = null
	}
}