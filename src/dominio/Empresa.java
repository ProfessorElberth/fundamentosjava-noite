package dominio;

import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class Empresa {

	private String nome;
	private String nomeMeio;
	private String ultimoNome;
	private float faturamento;

	public String getNome() throws NomeIncompletoException {
		
		if(this.ultimoNome == null || this.nome == null || this.nomeMeio == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto");
		}
				
		StringBuilder sb = new StringBuilder();

		sb.append(this.ultimoNome.toUpperCase().charAt(0));
		sb.append("., ");
		sb.append(this.nome.toUpperCase());
		sb.append(" ");
		sb.append(this.nomeMeio.toLowerCase());

		return sb.toString();
	}
	public void setNome(String nome) {
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0,posInicial);
		this.nomeMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
	
	public void exibir() {
		System.out.println("Empresa: " + this.toString());		
	}
	
	@Override
	public String toString() {

		return String.format("%s - %s - %s - %.2f", 
					this.nome,
					this.nomeMeio,
					this.ultimoNome,
					this.faturamento
				);
	}
	public float getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(float faturamento) throws FaturamentoNegativoException {
		
		if(faturamento < 10000) {
			throw new FaturamentoNegativoException("Não é permitido o faturamento negativo");
		}
		
		this.faturamento = faturamento;			
	}
}