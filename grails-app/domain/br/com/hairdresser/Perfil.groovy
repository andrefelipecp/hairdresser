package br.com.hairdresser

class Perfil {
	
	long id
	Usuario usuario
	Permissoes permissoes
	
	static hasMany = [permissoes : Permissoes]
	
	static mapping = {
		table 'tb_perfil'
		id column 'id_perfil'
		usuario column 'usuario'
		permissoes column 'permissoes'
		
	}
	
	

}
