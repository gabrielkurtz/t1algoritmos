import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

// Gera um Set (sem ordem definida) de Requests aleat�rios

	
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
		StringBuilder sb = new StringBuilder("{"); 
		for (Request req : lista) {
			sb.append(req + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("}");
		return sb.toString();
	}
	
	
}
