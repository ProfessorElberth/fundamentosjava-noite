package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.Estagiario;
import exceptions.EstagiarioInexistenteException;
import negocio.Funcionario;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/workspace20E4/";
		
		String arquivo = "funcionarios.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arquivo);
			BufferedWriter out = new BufferedWriter(escrita);
			
			String linha = in.readLine();
			
			float maiorSalario = 0;
			Funcionario funcionario = null;
			int qtde = 0;
			float somaSalarial = 0;
			
			while(linha != null) {
				String[] campos = linha.split(";");
				
				switch (campos[0].toUpperCase()) {
				case "E":
					Estagiario e = new Estagiario();		
					e.setNome(campos[1]);
					e.setIdade(Integer.valueOf(campos[2]));
					e.setSalario(Float.valueOf(campos[3]));
					e.setDesconto(Float.valueOf(campos[4]));
					e.setInstituicaoEnsino(campos[5]);
					e.exibir();

					float salarioLiquido = e.calcularSalarioLiquido();
					
					somaSalarial = somaSalarial + salarioLiquido;
							
					if(salarioLiquido >= maiorSalario) {
						maiorSalario = salarioLiquido;
						funcionario = e;
					}
					
					out.write(e.getNome()+";"+salarioLiquido+"\r");
					qtde++;
					
					break;

				default:
					break;
				}

				linha = in.readLine();
			}
			
			out.write(qtde+";"+somaSalarial+"\r");
			
			if(funcionario == null) {
				throw new EstagiarioInexistenteException("Não existe estagiários no arquivo!!!");
			}
			
			System.out.println("Estagiário com o maior salário: " + funcionario.getNome());
			
			in.close();
			leitura.close();
			out.close();
			escrita.close();
		} catch (IOException | EstagiarioInexistenteException e) {
			System.out.println(e.getMessage());
		}
	}
}