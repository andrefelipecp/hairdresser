package br.com.hairdresser

class Salao {
	
	long id
	String nome
	String cnpj
	String endereco
	String complemento
	String cep
	String telefone
	
	static mapping = {
		table 'tb_salao'
		id column 'id_salao'
		nome column 'nome'
		cnpj column 'cnpj'
		endereco column 'endereco'
		complemento column 'complemento'
		cep column 'cep'
		telefone column 'telefone'
		
	}

}
