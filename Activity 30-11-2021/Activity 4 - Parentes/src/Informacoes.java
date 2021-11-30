public class Informacoes {
	
	String parentesco;
	String localizacao;
	String ultimavisita;

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getUltimaVisita() {
		return ultimavisita;
	}

	public void setUltimaVisita(String ultimavisita) {
		this.ultimavisita = ultimavisita;
	}

	public Informacoes(String parentesco, String localizacao, String ultimavisita) {
		super();
		this.parentesco = parentesco;
		this.localizacao = localizacao;
		this.ultimavisita = ultimavisita;
	}

	public String toString() {
		return "Parentesco: " + parentesco + ", Onde Mora: " + localizacao + ", Ultima Visita: " + ultimavisita;
	}
}