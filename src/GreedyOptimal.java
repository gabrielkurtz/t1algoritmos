import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// Soluciona o problema de forma Ótima com algoritmo guloso:
// Aloca o recurso sempre para o Request que termina mais cedo.

public class GreedyOptimal {

	private HashSet<Request> listOriginal;
	private ArrayList<Request> listSorted;
	private ArrayList<Request> results;
	
	public GreedyOptimal(HashSet<Request> listaOriginal) {
		this.listOriginal = listaOriginal;
		sortList();
		solve();
	}
	
	// Ordena a lista utilizando comparador de menor TF (qual Request termina primeiro)
	public void sortList() {
		listSorted = new ArrayList<Request>(listOriginal);
		Collections.sort(listSorted, Request.COMPARE_BY_TF);
	}
	
	// Varre todos os Requests ordenados por TF
	// e os adiciona na lista de resultados quando seu TS inicia após o término do ultimo request (evitando sobreposição). 
	public void solve() {
		results = new ArrayList<Request>();
		int freeTime = 0;
		for(Request req : listSorted) {
			if(req.getTs() > freeTime) {
				results.add(req);
				freeTime = req.getTf();
			}
		}
	}
	
	public ArrayList<Request> getResults(){
		return results;
	}
	
	public int getQuantity() {
		return results.size();
	}
	
	public String toString() {
		return results.toString();
	}
	
}

