
// Cria um Request contendo o tempo inicial e o tempo final do intervalo

public class Request {
	
	private int ts;
	private int tf;
	
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
