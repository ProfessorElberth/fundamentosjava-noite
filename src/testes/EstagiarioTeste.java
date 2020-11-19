package testes;

import java.util.Scanner;

import auxiliar.Constante;
import dominio.Estagiario;

public class EstagiarioTeste {
	
	private static Estagiario[] estagiarios;// estagio 1, estagio 2, null, null, null

	private static String obterNivel(float salarioLiquido){

		if(salarioLiquido <= 1000) {
			return "A";
			
		}else if (salarioLiquido <= 2000) {			
			return "B";			
			
		}else if (salarioLiquido <= 3000) {
			return "C";
		}
		
		return "D";
	}
	
	private static void imprimir() {
		
		for(Estagiario estagiario : estagiarios) {

			if(estagiario != null) {

				float salario = estagiario.calcularSalarioLiquido();
				
				System.out.printf("%-10s | %10.2f | %s\n", 
						estagiario.getNome(),
						salario,
						obterNivel(salario)
						);
			}
		}
	}

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
			
			System.out.println("Informe o seu salário: ");
			e.setSalario(in.nextFloat());

			System.out.println("Informe o seu desconto: ");
			e.setDesconto(in.nextFloat());
			
			System.out.println("Informe o nome da instituição de ensino: ");
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
		System.out.println("Estagiários:");
		System.out.println("QTDE = " + i);
		System.out.println("TOTAL SALARIAL = " + somaSalarial);
		
		System.out.println("Relatório");
		System.out.println("Nome do estagiário com o maior salário = " + nomeMaiorSalario);
		System.out.println("Valor do maior salário = " + maiorSalario);
		
		imprimir();
		
		in.close();
	}
}