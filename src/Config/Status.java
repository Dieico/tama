package Config;

import java.util.ArrayList;
import java.util.List;

public class Status {
	int idade;
	List<Action> status;

	public Status(Time b) {
		idade = b.dias;
		status = new ArrayList<Action>();
	}

	public int captuarStatus(Action a) {
		return a.getStatus();
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setStatus(List<Action> status) {
		this.status = status;
	}

	public int getIdade() {
		return idade;
	}

	public List<Action> getStatus() {
		return status;
	}

}