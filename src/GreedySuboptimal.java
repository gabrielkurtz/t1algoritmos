import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// Tenta solucionar o problema com estrat�gia gulosa Subotima
// Seleciona sempre o intervalo que inicia primeiro (menor ts entre os intervalos que ainda cabem)

public class GreedySuboptimal {

	private HashSet<Request> listOriginal;
	private ArrayList<Request> listSorted;
	private ArrayList<Request> results;
	
	public GreedySuboptimal(HashSet<Request> listaOriginal) {
		this.listOriginal = listaOriginal;
		sortList();
		solve();
	}
	
	// Ordena a lista utilizando comparador de menor TS
	public void sortList() {
		listSorted = new ArrayList<Request>(listOriginal);
		Collections.sort(listSorted, Request.COMPARE_BY_TS);
	}
	
	// Varre todos os Requests ordenados por TS
	// e os adiciona na lista de resultados quando seu TS inicia ap�s o t�rmino do ultimo request (evitando sobreposição). 
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
