package testes;

import dominio.Funcionario;

public class FuncionarioTeste {
	
	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.idade = 42;
		func1.salario = 1000;
		func1.bonus = 500;
		func1.desconto = 200;
		func1.exibir();
		
		Funcionario func2 = new Funcionario();
		func2.nome = "elberth";
		func2.idade = 22;
		func2.salario = 100000;
		func2.bonus = 5000;
		func2.desconto = 2000;
		func2.exibir();
		
		Funcionario func3 = new Funcionario("rodrigo", 24);
		func3.salario = 999999;
		func3.bonus = 2500;
		func3.desconto = 4000;
		func3.exibir();

		new Funcionario("augusto", 23, 990000, 6000, 3000).exibir();
	}
}