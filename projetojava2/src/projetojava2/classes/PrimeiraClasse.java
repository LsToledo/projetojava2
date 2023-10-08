package projetojava2.classes;

import javax.swing.JOptionPane;

public class PrimeiraClasse {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome= "Esther";
		aluno1.sobrenome= "Oliveira";
		aluno1.setNota1(20);
		aluno1.setNota2(20);
		aluno1.setNota3(30);
		aluno1.setNota4(60);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.nome= JOptionPane.showInputDialog("Qual seu nome?");
		aluno2.sobrenome= JOptionPane.showInputDialog("Qual seu nome?");
		
		System.out.println("\n\nA Nome do aluno\n\n"+ aluno1.getNome());
		System.out.println("\n\nA media da Nota é\n\n"+ aluno1.getMediaNota());
		System.out.println("Resultado é:"+(aluno1.getResultado()?"Aprovado":"Reprovado"));
	
		
		
		System.out.println("\n\nA Nome do aluno\n\n"+ aluno2.getNome());
		System.out.println("\n\nA media da Nota é\n\n"+ aluno2.getMediaNota());
		
		
		System.out.println("Resultado é:"+(aluno2.getResultado()?"Aprovado":"Reprovado"));
	}
}
