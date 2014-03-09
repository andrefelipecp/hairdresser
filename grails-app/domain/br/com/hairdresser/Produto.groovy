package br.com.hairdresser

class Produto {
	
	long id
	String nome
	
	static belongsTo = {
		table 'tb_produto'
		id column
	}

}
