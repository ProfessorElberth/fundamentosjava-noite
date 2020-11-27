package testes;

import dominio.Empresa;
import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		System.out.println("e1");
		Empresa e1 = new Empresa();
		e1.setNome("Pedro Álvares cabral");
		try {
			e1.setFaturamento(-500);
			System.out.println(e1.getNome());
			e1.exibir();
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("e2");
		Empresa e2 = new Empresa();
		try {
			e2.setFaturamento(1000);
			System.out.println(e2.getNome());
			e2.exibir();
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("e3");
		Empresa e3 = new Empresa();
		e3.setNome("Pedro Álvares Cabral da Silva");
		try {
			e3.setFaturamento(1500);
		} catch (FaturamentoNegativoException e) {
			System.out.println(e.getMessage());
		}
		e3.exibir();
	}
}