package dominio;

import auxiliar.Constante;

public class Programador {
	public String nome;
	public int idade;
	public float salario;
	public boolean fullStack;
	public String linguagem;

	public Programador() {
		this.nome = "javeiro";
	}

	public Programador(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Programador(String nome, int idade, float salario, boolean fullStack, String linguagem) {
		this(nome, idade);
		this.salario = salario;
		this.fullStack = fullStack;
		this.linguagem = linguagem;
	}
	
	private float calcularSalarioLiquido(){		
		float salarioFullStack = this.fullStack ? 1500 : 500;
		
		float salarioJava = "java".equalsIgnoreCase(this.linguagem) ? 2000 : 750;

		return this.salario + salarioFullStack + salarioJava;
	}

	private String obterSituacao(float sl){

		if(sl < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (sl >= Constante.SALARIO_LIMITE_RICO) {
			return "rico";
		}else {
			return "classe média";
		}
	}
	
	@Override
	public String toString() {
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		return String.format("%-15s | %03d | %10.2f | %s | %5s | Salário líquido = R$%10.2f (%s)", 
				this.nome,
				this.idade,
				this.salario,
				this.fullStack ? "sim" : "não",
				this.linguagem,
				salarioLiquido,
				situacao); 
	}
}