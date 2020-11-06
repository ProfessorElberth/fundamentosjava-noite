package dominio;

import auxiliar.Constante;

public class Funcionario {
	public String nome;
	public int idade;
	public float salario;
	public float bonus;
	public float desconto;

	public Funcionario(){
		this.nome = "fantasma";
	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}

	private float calcularSalario(){
		return salario + bonus - desconto;
	}

	private String obterSituacao(float sl){
		return sl > Constante.SALARIO_LIMITE_RICO ? "rico" : "pobre";
	}
	
	public void exibir() {
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