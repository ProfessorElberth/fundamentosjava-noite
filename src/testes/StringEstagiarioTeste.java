package testes;

import java.util.Arrays;

import dominio.Estagiario;

public class StringEstagiarioTeste {

	public static void main(String[] args) {
		
		String linha = args[0];
		
		String[] campos = linha.split(";");
		
		System.out.println(Arrays.asList(campos));
		
		Estagiario e = new Estagiario();		
		e.setNome(campos[0]);
		e.setIdade(Integer.valueOf(campos[1]));
		e.setSalario(Float.valueOf(campos[2]));
		e.setDesconto(Float.valueOf(campos[3]));
		e.setInstituicaoEnsino(campos[4]);
		e.exibir();
	}
}