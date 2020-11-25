package testes;

import java.util.Arrays;

public class StringTeste {

	public static void main(String[] args) {

		//String[] texto = new String[4];
		//
		//char[] java = { 'J', 'a', 'v', 'a', '-', 'd', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r' };
		//
		//texto[0] = new String();
		//texto[1] = new String("elberth moraes");
		//texto[2] = new String(java);
		//texto[3] = new String(java, 5, 9);
		//
		//for (int i = 0; i < texto.length; i++) {
//			System.out.println("- " + texto[i]);
		//}
		//
		//for (String txt : texto) {
//			System.out.println("- " + txt);
		//}
		//
		//int i = 0;
		//while (i < texto.length) {
//			System.out.println("- " + texto[i]);
//			i++;
		//}
		//
		//int j = 0;
		//do {
//			System.out.println("- " + texto[j]);
//			j++;
		//} while (j < texto.length);
		//
		//String nome = texto[1];
		//String nomeUp = nome.toUpperCase();
		//
		//System.out.println(nome.equals(texto[1]) ? "Iguais" : "Diferentes");
		//
		//System.out.println("> " + nome.charAt(8));
		//
		//System.out.println(Arrays.asList(texto));
		//
		//System.out.println(nome);
		//System.out.println(nomeUp);
		//
		//System.out.println(nomeUp.toLowerCase());
		//
		//String aNome = " elberth ";
		//String aSobrenome = " moraes ";
		//
		//String completo = aNome.concat(aSobrenome);
		//System.out.println(completo.trim());
		//
		//if (nome.equalsIgnoreCase(nomeUp)) {
//			System.out.println("=");
		//} else {
//			System.out.println("!=");
		//}
		//
		//String aElberth = "elbertha";
		//String oElberth = "elbertho";
		//
		//System.out.println(aElberth.compareTo(oElberth));
		//
		//System.out.println(nome.startsWith("elb"));
		//System.out.println(nome.endsWith("aes"));
		//
		//System.out.println(nome.indexOf("e"));
		//System.out.println(nome.lastIndexOf("e"));
		//
		//System.out.println(nome.substring(5));// th moraes
		//System.out.println(nome.substring(8, 10));// mo
		//
		//System.out.println("Professor ".concat(nome));
		//
		//aNome = aNome.trim().toUpperCase();
		//aNome = aNome.trim().substring(0, 1);
		//
		//aSobrenome = aSobrenome.substring(0, 1).toUpperCase().concat(aSobrenome.substring(1));
		//
		//// EMoraes
		//System.out.println(aNome.concat(aSobrenome));

		//String nome = "Elberther";
		//System.out.println(nome);
		//
		//nome = nome.replace("r", "s");		
		//System.out.println(nome);
		//
		//nome = nome.replaceAll("e", "a");
		//System.out.println(nome);
		//
		//nome = nome.replaceFirst("a", "e");
		//System.out.println(nome);

		String nomeCompleto = "Elberth Lins Costa de Moraes";
		
		String[] nomesCompletos = nomeCompleto.toLowerCase().split("e");
		
		System.out.println(nomeCompleto);
		System.out.println(Arrays.asList(nomesCompletos));
		
		for(String nome: nomesCompletos) {
			System.out.println("- " + nome);
		}
	}
}

