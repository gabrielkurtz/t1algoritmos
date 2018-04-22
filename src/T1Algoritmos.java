import java.util.ArrayList;
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
		
		ArrayList<RandomGenerator> generators = new ArrayList<RandomGenerator>();
		ArrayList<GreedySuboptimal> solutionsSuboptimal = new ArrayList<GreedySuboptimal>();
//		ArrayList<RandomGenerator> solutionsOptimal = new ArrayList<RandomGenerator>();
		
		for (int i = 0; i<10; i++) {
			
			System.out.println("Iniciando Gerador " + (i+1));
			generators.add(new RandomGenerator(1000000, 1000));
			
//			System.out.println("\nImprimindo Lista " + (i+1));
//			System.out.println(generators.get(i).getLista());
			
			System.out.println("\nSolucionando Lista pelo método guloso sub-ótimo");
			solutionsSuboptimal.add(new GreedySuboptimal(generators.get(i).getLista()));
			System.out.println(solutionsSuboptimal.get(i).getResults());
			
			System.out.println("\nSolucionando Lista pelo método guloso ótimo");
			solutionsSuboptimal.add(new GreedySuboptimal(generators.get(i).getLista()));
			System.out.println(solutionsSuboptimal.get(i).getResults());
			
			System.out.println("\n--------------------------------------------------------------------\n");
		}

		
		
		
		
	}
	
}
