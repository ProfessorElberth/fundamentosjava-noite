package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {

		Programador p1 = new Programador();
		p1.setIdade(42);
		p1.setSalario(100000);
		p1.setFullStack(true);
		p1.setLinguagem("java");
		System.out.println("Programador: " + p1);

		Programador p2 = new Programador("rodrigo", 28);
		p2.setSalario(2000);
		p2.setFullStack(true);
		p2.setLinguagem("JAVA");
		System.out.println("Programador: " + p2);
		
		Programador p3 = new Programador("joao", 105, 500, false, "cobol");
		System.out.println("Programador: " + p3);
	}
}