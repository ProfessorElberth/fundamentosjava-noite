package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.nome = "elberth";
		func1.idade = 42;
		func1.salario = 1000;
		func1.bonus = 500;
		func1.desconto = 200;
		System.out.println("Funcionário: " + func1);
		
		Funcionario func2 = new Funcionario();
		func2.nome = "ana";
		func2.idade = 22;
		func2.salario = 100000;
		func2.bonus = 5000;
		func2.desconto = 2000;
		System.out.println("Funcionário: " + func2);
		
		System.out.println("Acabou!!!");
	}
}