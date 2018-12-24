package br.com.treinaweb.estruturadados.main;

import java.util.Scanner;

import br.com.treinaweb.estruturadados.modelos.Pessoa;
import br.com.treinaweb.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista ligada");
		System.out.println("4. Lista duplamente ligada");
		System.out.println("5. Pilha");
		System.out.println("6. Fila");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		}
		scanner.close();
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("---------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("*********************************");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "TreinaWeb");
		System.out.println(p2.toString());
		System.out.println("---------------------");
		// p2.setNome("TreinaWeb Modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

	private static void fazerVetor() {
		// indice começa com 0
		Vetor vetorPessoas = new Vetor(3);
		vetorPessoas.inserirEm(0, new Pessoa(1, "TreinaWeb"));
		System.out.println(vetorPessoas.recuperar(3).getNome());
	}

}
