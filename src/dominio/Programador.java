package dominio;

import negocio.Funcionario;

public class Programador extends Funcionario {
	private boolean fullStack;
	private String linguagem;

	public Programador() {
		this.setNome("javeiro");
	}
	public Programador(String nome, int idade) {
		super(nome, idade);
	}
	public Programador(String nome, int idade, float salario, boolean fullStack, String linguagem) {
		super(nome, idade, salario);
		this.fullStack = fullStack;
		this.linguagem = linguagem;
	}
	
	public float calcularSalarioLiquido(){		
		float salarioFullStack = this.fullStack ? 1500 : 500;
		
		float salarioJava = "java".equalsIgnoreCase(this.linguagem) ? 2000 : 750;

		return this.getSalario() + salarioFullStack + salarioJava;
	}

	public void exibir() {
		System.out.println("Programador: " + this.toString());
	}

	@Override
	public String toString() {
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		return String.format("%s | %s | %5s | Salário líquido = R$%10.2f (%s)", 
				super.toString(),
				this.fullStack ? "sim" : "não",
				this.linguagem,
				salarioLiquido,
				situacao); 
	}

	public boolean isFullStack() {
		return fullStack;
	}

	public void setFullStack(boolean fullStack) {
		this.fullStack = fullStack;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
}