package projetojava2.classes;

public class Diciplinas {
	private String diciplina;
	private Double nota;
	@Override
	public String toString() {
		return "Diciplinas [diciplina=" + diciplina + ", nota=" + nota + "]";
	}
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
}