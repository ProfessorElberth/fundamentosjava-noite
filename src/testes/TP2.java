package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;
import dominio.Administrativo;
import dominio.Programador;
import negocio.Funcionario;

public class TP2 {
	
	private static Funcionario[] funcionarios; //adm prog adm
	
	private static void imprimir(int id) {
		System.out.println(funcionarios[id].toString());
	}
	
	private static void imprimir() {
		for (int i = 0; i < Constante.QTDE; i++) {
			if(funcionarios[i] != null) {
				imprimir(i);
			}
		}
	}

	private static float calcularMediaSalarial(int qtde){
		float somaSalarial = 0;		
		for(int x = 0; x < qtde; x++) {
			somaSalarial = somaSalarial + funcionarios[x].calcularSalarioLiquido();
		}		

		return somaSalarial / qtde;
	}

	public static void main(String[] args) {
		funcionarios = new Funcionario[Constante.QTDE];

		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int opcao;
		do {			
			System.out.println("[1] Cadastrar Administrativo");
			System.out.println("[2] Cadastrar Programador");
			System.out.println("[3] Consultar um");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair.");
			System.out.print("Informe a op��o desejada: ");
			
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {
				
				switch (opcao) {
				case 1:
					if(i < Constante.QTDE) {
						
						Administrativo adm = new Administrativo();
						
						System.out.println("Informe o seu nome:");
						adm.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						adm.setIdade(in.nextInt());
						
						System.out.println("Informe o seu sal�rio:");
						adm.setSalario(in.nextFloat());

						System.out.println("Informe o seu b�nus: ");
						adm.setBonus(in.nextFloat());
						
						System.out.println("Informe o seu desconto: ");
						adm.setDesconto(in.nextFloat());
						
						funcionarios[i] = adm;

						System.out.println("... Inclus�o realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar um novo funcionario!!!");
					}					
					break;

				case 2:
					if(i < Constante.QTDE) {
						
						Programador prog = new Programador();
						
						System.out.println("Informe o seu nome:");
						prog.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						prog.setIdade(in.nextInt());
						
						System.out.println("Informe o seu sal�rio:");
						prog.setSalario(in.nextFloat());

						System.out.println("Informe se � fullstack: ");
						prog.setFullStack(in.nextBoolean());
						
						System.out.println("Informe a sua linguagem: ");
						prog.setLinguagem(in.next());
						
						funcionarios[i] = prog;

						System.out.println("... Inclus�o realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar um novo funcionario!!!");
					}					
					break;

				case 3:
					System.out.print("Informe a identifica��o do funcion�rio: ");
					int id = in.nextInt();
	
					if(id >= 0 && id < i) {
						System.out.println("... Funcion�rio ...");
						imprimir(id);
						System.out.println("...................");
					}else {
						System.out.println("Identifica��o inv�lida!!!");
					}
					break;
					
				case 4:
					System.out.println("... Lista de funcion�rios ...");
					imprimir();
					System.out.println(".............................");
					break;
				}
			}else {
				System.out.println("Op��o inv�lida!!!");
			}
		} while (opcao != 5);

		System.out.println("Sistema finalizado com sucesso!!!");		
		System.out.println("Quantidade de funcion�rios: " + i);
		System.out.println("M�dia salarial: " + calcularMediaSalarial(i));
		
		in.close();
	}
}