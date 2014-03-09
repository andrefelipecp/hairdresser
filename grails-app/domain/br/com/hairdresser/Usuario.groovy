package br.com.hairdresser

class Usuario {

	Long id;
	String nome;
	String senha;
	Perfil perfil;
	
	static hasMany = [perfil: Perfil];
	
	static mapping = {
		table 'tb_usuario'
		id column 'id_usuario'
		nome column 'nome'
		senha column 'senha'
		perfil column 'perfil'
		
		
	}
	
}
