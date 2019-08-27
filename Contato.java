package lab03_Jesse_Monteiro_Ferreira;

/**
 * Classe contato que armazena os atributos dos contatos e seus metodos
 * 
 * @author Jesse Monteiro Ferreira - 118210282
 *
 */
public class Contato {
	/**
	 * Primeiro nome do contato.
	 */
	private String nome;
	/**
	 * Segundo nome do contato.
	 */
	private String sobrenome;
	/**
	 * Telefone do contato salvo.
	 */
	private String telefone;
	
	
	
	
	/**
	 * Construtor de contato que antes de armazenar verifica se os parametros são vazios ou nulos.
	 * 
	 * @param nome Primeiro nome do contato a ser salvo
	 * @param sobrenome Segundo nome do contato a ser salvo
	 * @param telefone Numero de telefone do contato a ser salvo
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if ("".equals(nome.trim())) {
			throw new IllegalArgumentException("Nome Vazio");
		}
		if ("".equals(sobrenome.trim() )) {
			throw new IllegalArgumentException("Sobrenome Vazio");
		}
		if ("".equals(telefone.trim() )) {
			throw new IllegalArgumentException("Telefone Vazio");
		}
		if (nome == null) {
			throw new NullPointerException("Nome nulo");
		}
		if (sobrenome == null) {
			throw new NullPointerException("Sobrenome nulo");
		}
		if (telefone == null) {
			throw new NullPointerException("Telefone nulo");
		}else {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		}
	}
		



	/**
	 * Retorna o primeiro nome
	 * 
	 * @return Primeiro nome do contato
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o valor do primeiro nome
	 * 
	 * @param nome Primeiro nome para ser alterado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	/**
	 * Retorna o segundo nome
	 * 
	 * @return Segundo nome do contato
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Altera o segundo nome
	 * 
	 * @param sobrenome Segundo nome para ser alterado
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * Retorna o numero do telefone
	 * 
	 * @return Numero de telefone do contato
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Altera o numero de telefone
	 * 
	 * @param telefone Numero a ser alterado
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	/**
	 * Retorna todos os atributos do contato
	 * 
	 * @return Nome, sobrenome e telefone
	 */
	public String exibirContato() {
		return nome + " " + sobrenome + " - " + telefone; 
	}
	

	
	/**
	 * Verifica se dois contatos são iguais
	 * 
	 * @param contato Objeto contato a ser comparado
	 * @return True caso igual, False caso diferente
	 */
	public boolean equals(Contato contato) {
		if(contato.nome.equals(this.nome) && (contato.sobrenome.equals(this.sobrenome))) {
			return true;
		}
		return false;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}


	/**
	 * Retorna uma string de nome e sobrenome
	 * 
	 * @return nome + sobrenome
	 */
	@Override	
	public String toString() {
		return  nome + " " + sobrenome;
	}




	
	
	
}
