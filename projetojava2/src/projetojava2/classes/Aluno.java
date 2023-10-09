package projetojava2.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Aluno {
	private String nome;
	private String sobrenome;
	private int Id;
	private Date dataNacimento;
	private int Ranking;
	private int cpf;
	private String nomeMae;
	private String nomepai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;;

	private List<Diciplinas> diciplinas = new ArrayList<Diciplinas>();

	public List<Diciplinas> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<Diciplinas> diciplinas) {
		this.diciplinas = diciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", Id=" + Id + ", dataNacimento=" + dataNacimento
				+ ", Ranking=" + Ranking + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomepai=" + nomepai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", diciplinas=" + diciplinas + "]";
	}

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Diciplinas diciplina : diciplinas) {
			somaNotas += diciplina.getNota();

		}
		return somaNotas / diciplinas.size();
	}
	public String getResultado() {
		double media1= getMediaNota();
		if(media1>=50) {
				
			if(media1>=70) {
				return "Aprovado";
			}else {
				return "Recuperaçao";
			}
			
		}else {
		return "Reprovado"; 
		}
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public int getRanking() {
		return Ranking;
	}

	public void setRanking(int ranking) {
		Ranking = ranking;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return cpf == other.cpf && Objects.equals(sobrenome, other.sobrenome);
	}

}
