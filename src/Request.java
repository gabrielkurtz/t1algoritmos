import java.util.Comparator;

// Cria um Request contendo o tempo inicial e o tempo final do intervalo

public class Request {
	
	private int ts;
	private int tf;
	

	// Comparador que utiliza Tempo Inicial do intervalo como parametro 
	public static Comparator<Request> COMPARE_BY_TS = new Comparator<Request>() {
        public int compare(Request one, Request other) {
            return Integer.compare(one.ts, other.ts);
        }
    };
    
	// Comparador que utiliza Tempo Final do intervalo como parametro
    public static Comparator<Request> COMPARE_BY_TF = new Comparator<Request>() {
        public int compare(Request one, Request other) {
            return Integer.compare(one.tf, other.tf);
        }
    };
    
	
	public Request(int ts, int tf) {
		this.ts = ts;
		this.tf = tf;
	}
	
	
	public int getTs() {
		return ts;
	}
	
	public int getTf() {
		return tf;
	}
	
	public String toString() {
		return "["+ ts + ", " + tf + "]";
	}
	
}
