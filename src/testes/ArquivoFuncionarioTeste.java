package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import exceptions.ArquivoCorrompidoException;

public class ArquivoFuncionarioTeste {
	
	private static String[] mensagens;

	public static void main(String[] args) {
		
		mensagens = new String[999];
		
		String dir = "C:/dev/workspace20E4/";
		
		String arquivo = "out_funcionarios.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);
			BufferedReader in = new BufferedReader(leitura);
			
			String linha = in.readLine();
			
			int qtde = 0;
			float somaSalarial = 0;
			float mediaSalarial = 0;			
			
			int qtdeTotal = 0;
			float somaSalarialTotal = 0;
			
			int i = 0;
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				try {					
					qtdeTotal = Integer.valueOf(campos[0]);
					somaSalarialTotal = Float.valueOf(campos[1]);
					
				} catch (NumberFormatException e) {
					mensagens[i++] = "O funcionário "+campos[0]+" recebe R$"+campos[1];

					somaSalarial = somaSalarial + Float.valueOf(campos[1]);
					
					qtde++;
				}
				
				linha = in.readLine();				
			}

			if(qtdeTotal != qtde || somaSalarialTotal != somaSalarial) {
				throw new ArquivoCorrompidoException("Arquivo corrompido");
			}
			
			for(String msg: mensagens) {
				if(msg != null) {
					System.out.println(msg);
				}
			}
			
			mediaSalarial = somaSalarial / qtde;			
			System.out.println("Quantidade: " + qtde);
			System.out.println("Soma salarial: " + somaSalarial);
			System.out.println("Média salarial: " + mediaSalarial);
			
			in.close();
			leitura.close();
		} catch (IOException | ArquivoCorrompidoException e) {
			System.out.println(e.getMessage());
		}
	}
}