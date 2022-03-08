import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteEmail {
	
	private boolean emal;

	@Test
	public void testar_email_com_arroba() {
		emal = Pessoa.emailValid("email_teste@dominio.com.br");
		assertTrue(emal);
		
	}
	
	@Test
	public void testar_email_sem_arroba() {
		
		emal = Pessoa.emailValid("email_testedominio.com.br");
		assertFalse(emal);
	}

	public void testar_email_mais_50_caracteres() {
		
		emal = Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br");
		assertEquals(emal, false);
	}

}
