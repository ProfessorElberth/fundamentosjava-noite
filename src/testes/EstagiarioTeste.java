package testes;

import dominio.Estagiario;

public class EstagiarioTeste {

	public static void main(String[] args) {
		
		Estagiario e = new Estagiario();
		e.setNome("elberth");
		e.setIdade(42);
		e.setSalario(999);
		e.exibir();
	}
}
