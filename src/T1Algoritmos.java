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
		
		// Lista de Geradores contendo HashSets de valores aleatorios
		ArrayList<RandomGenerator> generators = new ArrayList<RandomGenerator>();
		// Lista de solucoes gulosas sub-otimas
		ArrayList<GreedySuboptimal> solutionsSuboptimal = new ArrayList<GreedySuboptimal>();
		// Lista de solucoes gulosas otimas
		ArrayList<GreedyOptimal> solutionsOptimal = new ArrayList<GreedyOptimal>();
		
		int totalSolOpt = 0, totalSolSub = 0;
		
		// Efetua rotina 10 vezes para gerar 10 casos de exemplos e soluções Ótimas e Sub-ótimas e compará-las
		for (int i = 0; i<10; i++) {
			
			System.out.println("Iniciando Gerador " + (i+1));
			generators.add(new RandomGenerator(1000000, 1000));
			
//			System.out.println("\nImprimindo Lista " + (i+1));
//			System.out.println(generators.get(i).getLista());
			
			System.out.println("\nSolucionando Lista pelo método guloso sub-ótimo");
			solutionsSuboptimal.add(new GreedySuboptimal(generators.get(i).getLista()));
			System.out.println(solutionsSuboptimal.get(i));
			
			System.out.println("\nSolucionando Lista pelo método guloso ótimo");
			solutionsOptimal.add(new GreedyOptimal(generators.get(i).getLista()));
			System.out.println(solutionsOptimal.get(i));
			
			System.out.println("\nNúmero de intervalos alocados por solução"
					+ "\nGulosa Sub-ótima: " + solutionsSuboptimal.get(i).getQuantity()
					+ "\nGulosa Ótima: " + solutionsOptimal.get(i).getQuantity());
			
			totalSolSub += solutionsSuboptimal.get(i).getQuantity();
			totalSolOpt += solutionsOptimal.get(i).getQuantity();
			
			System.out.println("\n--------------------------------------------------------------------\n");
		}
		
		float averageSub = totalSolSub / 10.0f;
		float averageOpt = totalSolOpt / 10.0f;
		
		System.out.println("Média de intervalos alocados por solução nos 10 casos"
				+ "\nGulosa Sub-ótima: " + averageSub 
				+ "\nGulosa Ótima: " + averageOpt);

	}
	
}
