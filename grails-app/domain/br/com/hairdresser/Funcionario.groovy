package br.com.hairdresser

class Funcionario {
	
	long id
	String nome
	String telefone
	String cpf
	Date data_admissao 
	Date data_demissao
	Date dataDeNascimento
	
	static belongsTo = [salao: Salao]
	
	static mapping ={
		table 'tb_funcionario'
		id column 'id_funcionario'
		nome column 'nome'
		telefone column 'telefone'
		cpf column 'cpf'
		data_admissao column 'data_admissao'
		data_demissao column 'data_demissao'
		dataDeNascimento column 'dataDeNascimento'
	}
	

}
