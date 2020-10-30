package testes;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;
	
	@Override
	public String toString() {

		return String.format("%s - %d - %.2f - %.2f - %.2f", 
					nome, idade, salario, bonus, desconto
				);
	}
}