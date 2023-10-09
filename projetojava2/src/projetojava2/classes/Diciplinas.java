package projetojava2.classes;

public class Diciplinas {
	private String diciplina1;
	private String diciplina2;
	private String diciplina3;
	private String diciplina4;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Double nota4;
	
	
	
	
	
	
	public String getDiciplina2() {
		return diciplina2;
	}
	public void setDiciplina2(String diciplina2) {
		this.diciplina2 = diciplina2;
	}
	public String getDiciplina3() {
		return diciplina3;
	}
	public void setDiciplina3(String diciplina3) {
		this.diciplina3 = diciplina3;
	}
	public String getDiciplina4() {
		return diciplina4;
	}
	public void setDiciplina4(String diciplina4) {
		this.diciplina4 = diciplina4;
	}
	
	public String getDiciplina1() {
		return diciplina1;
	}
	
	@Override
	public String toString() {
		return "Diciplinas [diciplina1=" + diciplina1 + ", diciplina2=" + diciplina2 + ", diciplina3=" + diciplina3
				+ ", diciplina4=" + diciplina4 + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3
				+ ", nota4=" + nota4 + "]";
	}
	public void setDiciplina1(String diciplina1) {
		this.diciplina1 = diciplina1;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double getNota4() {
		return nota4;
	}
	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}
	
	
	
}
