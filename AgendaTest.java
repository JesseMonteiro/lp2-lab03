package lab03_Jesse_Monteiro_Ferreira;



import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	private Agenda agenda;
	private Agenda agenda2;
	
	@BeforeEach
	void agendaDefault() {
		agenda = new Agenda();
		agenda2 = new Agenda();
	}
	
	

	@Test
	void testCadastrarContato() {
		assertTrue( this.agenda.cadastrarContato(1, "Jesse", "Monteiro","983984984") );
		}

	
	@Test
	void testCadastrarContatoLimiteMaior() {
		assertTrue( this.agenda.cadastrarContato(100, "Jesse", "Monteiro","983984984") );
		}
	
	@Test
	void testCadastrarContatoForaDoEspecificado() {
		assertFalse( this.agenda.cadastrarContato(101, "Jesse", "Monteiro","983984984") );
		}
	
	@Test 
	void testCadastrarContatoVazio() {
		try {
			this.agenda.cadastrarContato(1, "", "","");
		}catch(IllegalArgumentException e) {
			e.getMessage();
		}
		}
	
	@Test
	void testExibirContato() {
		this.agenda.cadastrarContato(1, "Jesse", "Monteiro","983984984");
		assertEquals("Jesse Monteiro - 983984984", this.agenda.exibirContato(1) );
	}
	
	
	@Test
	void testExibirContatoVazio() {
		this.agenda.cadastrarContato(1, "Jesse", "Monteiro","983984984");
		try {
		this.agenda.exibirContato(2);
		}catch(NullPointerException e) {
			e.getMessage();
		}
	}
	

	@Test
	void testListarContatos() {
		this.agenda.cadastrarContato(1, "Jesse", "Monteiro","983984984");
		this.agenda.cadastrarContato(2, "Matheus", "Gaudencio","948450459");
		this.agenda.cadastrarContato(3, "Jose", "Silva","99865960");
		assertEquals("1 - Jesse Monteiro\n2 - Matheus Gaudencio\n3 - Jose Silva\n", this.agenda.listarContatos());
	}

	@Test
	void testEqualsAgenda() {
		this.agenda.cadastrarContato(1, "Matheus" , "Gaudencio",  "2101-0000");
		this.agenda.cadastrarContato(2, "Jesse", "Monteiro","983984984");
		this.agenda2.cadastrarContato(1, "Matheus" , "Gaudencio",  "2101-0000");
		this.agenda2.cadastrarContato(2, "Jesse", "Monteiro","983984984");
		assertTrue(this.agenda.equals(this.agenda2));
		}

}
