package projetojava2.classes;

import java.util.Date;

public class Aluno {
	public String nome;
	public String sobrenome;
	public int Id;
	public Date dataNacimento;
	public int Ranking;
	public int cpf;
	public String nomeMae;
	public String nomepai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	
	
	
	
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	
	public boolean getResultado() {
		
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		
		}else {
			return false;
			
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

}
