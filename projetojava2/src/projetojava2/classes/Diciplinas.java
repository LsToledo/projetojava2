package projetojava2.classes;

public class Diciplinas {
	private String nomediciplina;
	private Double nota;

	@Override
	public String toString() {
		return "Diciplinas [diciplina=" + nomediciplina + ", nota=" + nota + "]";
	}

	public String getNomeDiciplina() {
		return nomediciplina;
	}

	public void setDiciplina(String diciplina) {
		this.nomediciplina = diciplina;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}