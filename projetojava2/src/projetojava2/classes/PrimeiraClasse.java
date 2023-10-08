package projetojava2.classes;

import java.text.ParseException;

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
			String nome= JOptionPane.showInputDialog("Qual seu nome?");
			String sobrenome= JOptionPane.showInputDialog("Qual seu Sobrenome?");
			String nota1= JOptionPane.showInputDialog("Qual Sua Nota1?");
			String nota2= JOptionPane.showInputDialog("Qual Sua Nota2?");
			String nota3= JOptionPane.showInputDialog("Qual Sua Nota3?");
			String nota4= JOptionPane.showInputDialog("Digite Sua Nota4?");
			aluno1.setNome(nome);
			aluno1.setSobrenome(sobrenome);
			aluno1.setNota1(Double.parseDouble(nota1));
			aluno1.setNota2(Double.parseDouble(nota2));
			aluno1.setNota3(Double.parseDouble(nota3));
			aluno1.setNota4(Double.parseDouble(nota4));
			
		
			aluno1.toString();
			System.out.println("\n\nA media da Nota é\n\n"+ aluno1.getMediaNota());
			System.out.println("Resultado é:"+(aluno1.getResultado()?"Aprovado":"Reprovado"));
			
			Aluno aluno2 = new Aluno();
			String nome= JOptionPane.showInputDialog("Qual seu nome?");
			String sobrenome= JOptionPane.showInputDialog("Qual seu Sobrenome?");
			String nota1= JOptionPane.showInputDialog("Qual Sua Nota1?");
			String nota2= JOptionPane.showInputDialog("Qual Sua Nota2?");
			String nota3= JOptionPane.showInputDialog("Qual Sua Nota3?");
			String nota4= JOptionPane.showInputDialog("Digite Sua Nota4?");
			aluno2.setNome(nome);
			aluno2.setSobrenome(sobrenome);
			aluno2.setNota1(Double.parseDouble(nota1));
			aluno2.setNota2(Double.parseDouble(nota2));
			aluno2.setNota3(Double.parseDouble(nota3));
			aluno2.setNota4(Double.parseDouble(nota4));
			
		
			aluno2.toString();
			System.out.println("\n\nA media da Nota é\n\n"+ aluno2.getMediaNota());
			System.out.println("Resultado é:"+(aluno2.getResultado()?"Aprovado":"Reprovado"));
			
			
		
		
		
		
		
	}
	}