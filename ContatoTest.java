package lab03_Jesse_Monteiro_Ferreira;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContatoTest {

	 private Contato contato;
	 private Contato contatoClone;
	 private Contato contatoDiferente;
	 private Contato contatoSetar;


     @BeforeEach

     public void criaContato() {

                 contato = new Contato( "Matheus" , "Gaudencio",  "2101-0000");
                 contatoClone = new Contato( "Matheus" , "Gaudencio",  "2101-0000");
                 contatoDiferente = new Contato( "Jesse" , "Monteiro",  "2102-0000");
                 contatoSetar = new Contato("mudar", "mudar", "mudar");


     	}


     @Test

     public void testarNomeVazio(){
         assertThrows(IllegalArgumentException.class, () -> new Contato("", "Monteiro", "2101-0000"));
     }

    @Test

    public void testarSobrenomeVazio(){
        assertThrows(IllegalArgumentException.class, () -> new Contato("Jesse", "", "2100-0000"));
    }

    @Test

    public void testarTelefoneVazio(){
        assertThrows(IllegalArgumentException.class, () ->  new Contato("Jesse", "Monteiro", ""));
    }




    @Test

    public void testarNomeNulo(){
        assertThrows(NullPointerException.class, () -> new Contato(null, "Monteiro", "2100-0000"));
    }

    @Test
    public void testarSobrenomeNulo(){
        assertThrows(NullPointerException.class, () -> new Contato("Jesse", null, "2100-0000"));
    }

    @Test
    public void testarTelefoneNulo(){
        assertThrows(NullPointerException.class, () -> new Contato("Jesse", "Monteiro", null));
    }



    @Test

     public void testNomeCompleto() {
    	 
    	 assertEquals("Matheus Gaudencio", contato.toString());
     	}
     
     @Test
     public void testNome() {
    	 assertEquals("Matheus", contato.getNome());
     }
     
     @Test
     public void testSobrenome() {
    	 assertEquals("Gaudencio" , contato.getSobrenome());
     }
     
     @Test
     public void testaTelefone () {
    	 assertEquals("2101-0000" , contato.getTelefone());
     }

     @Test
     public void testHascode (){
         assertEquals(contato.hashCode(), contato.hashCode());
     }

     @Test
     public void testeVerificaContato() {
    	 assertEquals("Matheus Gaudencio - 2101-0000" , contato.exibirContato());
     }
     
     @Test
     public void testComparaContato() {
    	 assertEquals(contato.toString(), contatoClone.toString());

     }
}
         




