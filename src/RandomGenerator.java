import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

// Gera um Set (sem ordem definida) de Requests aleatórios

	
public class RandomGenerator {
	
	private HashSet<Request> lista;
	
	public RandomGenerator(int size, int maxValue) {
		generate(size, maxValue);
	}
	
	public void generate(int size, int maxValue) {
		lista = new HashSet<Request>();
		for (int i = 0; i<size; i++) {
			int ts = ThreadLocalRandom.current().nextInt(0, maxValue);
			int tf = ThreadLocalRandom.current().nextInt(ts + 1, maxValue + 1);
			lista.add(new Request(ts, tf));
		}
	}
	
	public HashSet<Request> getLista (){
		return lista;
	}

	public String toString() {
		return lista.toString();
	}
	
	
}
