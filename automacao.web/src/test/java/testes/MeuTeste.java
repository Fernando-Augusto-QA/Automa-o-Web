package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import automacao.web.Metodos;

public class MeuTeste {
	
	Metodos metodos = new Metodos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador();
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void test() {
		System.out.println("Teste executado com sucesso");
		metodos.evidencias("CT01 - Teste abrir Google");
		
		
	}

}
