package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;

public class Segundo {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;
	
	private static float calcularSalario(int id){
		return salarios[id] + bonus[id] - descontos[id];
	}

	private static String obterSituacao(float sl){
		//		if(salarioLiquido > SALARIO_LIMITE) {
		//		situacao = "rico";
		//	}else {
		//		situacao = "pobre";
		//	}
	
		return sl > Constante.SALARIO_LIMITE_RICO ? "rico" : "pobre";
	}
	
	private static void imprimir(int id) {
		
		float salarioLiquido = calcularSalario(id);
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.printf("{%d} %s - %d - %.2f - %.2f - %.2f :: Salário Líquido = R$%.2f (%s)\n", 
				id, 
				nomes[id], idades[id], salarios[id], bonus[id], descontos[id], salarioLiquido, situacao);
	}
	
	private static void imprimir() {
		for (int i = 0; i < Constante.QTDE; i++) {
			if(nomes[i] != null) {
				imprimir(i);
			}
		}
	}

	private static float calcularMediaSalarial(int qtde){
		float somaSalarial = 0;		
		for(int x = 0; x < qtde; x++) {
			somaSalarial = somaSalarial + calcularSalario(x);
		}		

		return somaSalarial / qtde;
	}

	public static void main(String[] args) {
		nomes = new String[Constante.QTDE];
		idades = new int[Constante.QTDE];
		salarios = new float[Constante.QTDE];
		bonus = new float[Constante.QTDE];
		descontos = new float[Constante.QTDE];

		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int opcao;
		do {			
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair.");
			System.out.print("Informe a opção desejada: ");
			
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {
				
				switch (opcao) {
				case 1:
					if(i < Constante.QTDE) {
						System.out.println("Informe o seu nome:");
						nomes[i] = in.next();
						
						System.out.println("Informe a sua idade:");
						idades[i] = in.nextInt();
						
						System.out.println("Informe o seu salário:");
						salarios[i] = in.nextFloat();

						System.out.println("Informe o seu bônus: ");
						bonus[i] = in.nextFloat();
						
						System.out.println("Informe o seu desconto: ");
						descontos[i] = in.nextFloat();

						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar um novo funcionario!!!");
					}					
					break;

				case 2:
					System.out.print("Informe a identificação do funcionário: ");
					int id = in.nextInt();
	
					if(id >= 0 && id < i) {
						System.out.println("... Funcionário ...");
						imprimir(id);
						System.out.println("...................");
					}else {
						System.out.println("Identificação inválida!!!");
					}
					break;
					
				case 3:
					System.out.println("... Lista de funcionários ...");
					imprimir();
					System.out.println(".............................");
					break;
				}
			}else {
				System.out.println("Opção inválida!!!");
			}
		} while (opcao != 4);

		System.out.println("Sistema finalizado com sucesso!!!");		
		System.out.println("Quantidade de funcionários: " + i);
		System.out.println("Média salarial: " + calcularMediaSalarial(i));
		
		in.close();
	}
}