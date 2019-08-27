package lab03_Jesse_Monteiro_Ferreira;

/**
 * Classe agenda que cria uma lista de contatos e opera com seus valores
 * 
 * @author Jesse Monteiro Ferreira - 118210282
 *
 */
public class Agenda {

	/**
	 * Array do objeto Contato
	 */
	private Contato[] contatos;
	
	
	/**
	 * Contrutor de Agenda para inicializar o array
	 */
	public Agenda () {
		this.contatos = new Contato[100];
	}

	/**
	 * Metodo para cadastrar um contato na lista, verificando se sua posição respeita os parametros
	 * especificados e retornando verdadeiro ou falso caso seja adicionado o contato com sucesso.
	 * 
	 * @param posicao Posição da lista que o contato será salvo
	 * @param nome Primeiro nome do contato
	 * @param sobrenome Segundo nome do contato
	 * @param telefone Telefone do contato a ser salvo
	 * @return True caso seja salvo o contato e false caso não seja salvo
	 */
	public boolean cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {
		if(posicao > 0  && posicao < 101) {
			
			Contato contato = new Contato(nome, sobrenome, telefone);
			
			contatos[posicao - 1] = contato;
			return true;
		}else {
			return false;
		}
		
	}
	

	/**
	 * Exibir o contato em uma posição especifica da lista,
	 * verificando se a posição não é nula.
	 * 
	 * @param posicao Local na lista a ser verificado.
	 * @return o contato caso a posição seja válida ou "posição inválida" caso não.
	 */
	public String exibirContato(int posicao) {
		if (contatos[posicao - 1] != null) {
			return contatos[posicao - 1].exibirContato();
		}
		return "POSIÇÃO INVÁLIDA!";

	}
	
	
	/**
	 * Lista todos os contatos salvos, exibindo um a um percorrendo todo o array.
	 * 
	 * @return todos os contatos salvos em uma unica string
	 */
	public String listarContatos() {
		String salvarPraMandar = "";
		for (int i = 0 ; i < contatos.length ; i++) {
			if (contatos[i] != null) {
				salvarPraMandar += ( (i+1) + " - " + contatos[i].toString() + "\n");
			}
		}
		return salvarPraMandar;
	}
	
	
	/**
	 * Comparar dois contatos e verifica se tem os mesmo atributos
	 * 
	 * @param agenda que vai ser comparada
	 * @return True caso seja igual ou False caso não
	 */
	public boolean equals(Agenda agenda) {
		for (int i = 0 ; i < contatos.length; i++) {
			if (this.contatos[i] == null) {
				break;
			}
			if (!this.contatos[i].equals(agenda.contatos[i])) {
				return false;
			}
		}
			
		return true;
	}
	

}
