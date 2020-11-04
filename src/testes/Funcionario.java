package testes;

import auxiliar.Constante;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;

	Funcionario(){
		this.nome = "fantasma";
	}
	
	Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}

	private float calcularSalario(){
		return salario + bonus - desconto;
	}

	private String obterSituacao(float sl){
		return sl > Constante.SALARIO_LIMITE ? "rico" : "pobre";
	}
	
	void exibir() {
		System.out.println("Funcionário: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalario();
		
		String situacao = obterSituacao(salarioLiquido);

		return String.format("%s - %d - %.2f - %.2f - %.2f :: Salário Líquido R$%.2f (%s)", 
					nome, idade, salario, bonus, desconto,
					salarioLiquido,
					situacao
				);
	}
}