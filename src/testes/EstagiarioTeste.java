package testes;

import java.util.Scanner;

import auxiliar.Constante;
import dominio.Estagiario;

public class EstagiarioTeste {
	
	private static Estagiario[] estagiarios;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		estagiarios = new Estagiario[Constante.QTDE_ESTAGIO];
		
		float somaSalarial = 0;
		int i = 0;
		
		float maiorSalario = 0;
		String nomeMaiorSalario = null;
		
		while(somaSalarial <= 5000) {
			
			System.out.println("Informe o seu nome:");
			String nome = in.next();
			
			System.out.println("Informe a sua idade:");
			int idade = in.nextInt();
			
			Estagiario e = new Estagiario(nome, idade);
			
			System.out.println("Informe o seu sal�rio: ");
			e.setSalario(in.nextFloat());

			System.out.println("Informe o seu desconto: ");
			e.setDesconto(in.nextFloat());
			
			System.out.println("Informe o nome da institui��o de ensino: ");
			e.setInstituicaoEnsino(in.next());
			
			e.exibir();
			
			float salarioLiquido = e.calcularSalarioLiquido();
			
			if(salarioLiquido >= maiorSalario) {
				maiorSalario = salarioLiquido;
				nomeMaiorSalario = nome;
			}			
			
			somaSalarial = somaSalarial + salarioLiquido; 
			
			estagiarios[i] = e;
			
			i++;
		}

		System.out.println("Cadastramento realizado com sucesso!!!");
		System.out.println("Estagi�rios:");
		System.out.println("QTDE = " + i);
		System.out.println("TOTAL SALARIAL = " + somaSalarial);
		
		System.out.println("Relat�rio");
		System.out.println("Nome do estagi�rio com o maior sal�rio = " + nomeMaiorSalario);
		System.out.println("Valor do maior sal�rio = " + maiorSalario);
		
		in.close();
	}
}