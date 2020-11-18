package dominio;

import negocio.Funcionario;

public class Estagiario extends Funcionario {

	private float desconto;
	private String instituicaoEnsino;
	
	public Estagiario() {
		this.setNome("estag");
	}
	
	public Estagiario(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void exibir() {
		System.out.println("Estágio :: Funcionario: " + this.toString());
	}

	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		return String.format("%s | %10.2f | %s :: Salário Líquido R$%10.2f", 
					super.toString(), 
					this.desconto,
					this.instituicaoEnsino,
					salarioLiquido
				);
	}
	
	@Override
	public float calcularSalarioLiquido() {
		return this.getSalario() - this.desconto;
	}

	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
}