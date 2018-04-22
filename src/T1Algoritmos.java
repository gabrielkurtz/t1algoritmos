import java.util.HashSet;

public class T1Algoritmos {
	
	// Programa para resolver o problema do Escalonamento através de algoritmo guloso
	
	public static void main(String args[]) {
		
	System.out.println("--- Pontificia Universidade Catolica do Rio Grande do Sul ---"
			+ "\n--- Bacharelado em Engenharia de Software ---"
			+ "\n--- Disciplina de Algoritmos Avançados ---"
			+ "\n--- Prof. Diego Noble ---"
			+ "\n--- Gabriel Ferreira Kurtz ---"
			+ "\n\n------------------------------------------------"
			+ "\n--- ALGORITMO DE ESCALONAMENTO DE INTERVALOS ---"
			+ "\n------------------------------------------------"
			+ "\n\nGerando 10 Listas de Intervalos");
		
		System.out.println("\nIniciando Gerador 1");
		HashSet<Request> lista0 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 1");
		printList(lista0);
		
		System.out.println("\nIniciando Gerador 2");
		HashSet<Request> lista1 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 2");
		printList(lista1);
		
		System.out.println("\nIniciando Gerador 3");
		HashSet<Request> lista2 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 3");
		printList(lista2);
		
		System.out.println("\nIniciando Gerador 4");
		HashSet<Request> lista3 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 4");
		printList(lista3);
		
		System.out.println("\nIniciando Gerador 5");
		HashSet<Request> lista4 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 5");
		printList(lista4);
		
		System.out.println("\nIniciando Gerador 6");
		HashSet<Request> lista5 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 6");
		printList(lista5);
		
		System.out.println("\nIniciando Gerador 7");
		HashSet<Request> lista6 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 7");
		printList(lista6);
		
		System.out.println("\nIniciando Gerador 8");
		HashSet<Request> lista7 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 8");
		printList(lista7);
		
		System.out.println("\nIniciando Gerador 9");
		HashSet<Request> lista8 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 9");
		printList(lista8);
		
		System.out.println("\nIniciando Gerador 10");
		HashSet<Request> lista9 = new RandomGenerator(15, 1000).getLista();
		System.out.println("Imprimindo Lista 10");
		printList(lista9);
		
	}
	
	public static void printList(HashSet<Request> lista) {
		System.out.print("{"); 
		for (Request req : lista) {
			System.out.print(req + ", ");
		}
		System.out.println("}");
	}
}
