package br.com.hairdresser

class Cliente {
	
	long id
	String nome
	String telefone
	String endereco
	Date dataDeNascimento
	
	static belongsTo = [salao:Salao]
	
	static mapping ={
		table 'tb_clinte'
		id column 'id_cliente'
		nome column 'nome'
		telefone column 'telefone'
		endereco column 'dataDeNascimento'
	}
	
}
