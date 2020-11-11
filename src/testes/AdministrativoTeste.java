package testes;

import dominio.Administrativo;

public class AdministrativoTeste {
	
	public static void main(String[] args) {

		Administrativo adm1 = new Administrativo();
		adm1.setIdade(42);
		adm1.setSalario(1000);
		adm1.setBonus(500);
		adm1.setDesconto(200);
		adm1.exibir();
		
		Administrativo adm2 = new Administrativo();
		adm2.setNome("elberth");
		adm2.setIdade(22);
		adm2.setSalario(100000);
		adm2.setBonus(5000);
		adm2.setDesconto(2000);
		adm2.exibir();
		
		Administrativo adm3 = new Administrativo("rodrigo", 24);
		adm3.setSalario(999999);
		adm3.setBonus(2500);
		adm3.setDesconto(4000);
		adm3.exibir();

		new Administrativo("augusto", 23, 990000, 6000, 3000).exibir();
	}
}