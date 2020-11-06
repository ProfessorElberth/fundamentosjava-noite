package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador p1 = new Programador();
		p1.idade = 42;
		p1.salario = 100000;
		p1.fullStack = true;
		p1.linguagem = "java";
		System.out.println("Programador: " + p1);
		
		Programador p2 = new Programador("rodrigo", 28);
		p2.salario = 2000;
		p2.fullStack = true;
		p2.linguagem = "JAVA";
		System.out.println("Programador: " + p2);
		
		Programador p3 = new Programador("joao", 105, 500, false, "cobol");
		System.out.println("Programador: " + p3);
	}
}